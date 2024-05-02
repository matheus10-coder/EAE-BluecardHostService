package net.abcbs.eae.jaxrs;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import java.util.List;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.*;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.annotation.JacksonFeatures;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import net.abcbs.issh.util.pub.common.IsSharedApplicationDataObject;
import net.abcbs.rpa.javabeans.BluecardJavaBean;
import net.abcbs.rpa.dto.*;

/***********************************************************************************************************************************************************************
 * @Author mfribeiro
 * 
 * Body for all the methods used for the REST Web service
 * 
 * Description: BluecardHostResource class is the application resource level which the main methods will be called in order to return the message to the user 
 * 
 * Project: Bluecard Host Adjustment 
 ***********************************************************************************************************************************************************************/
@Path("/bluecard")
@OpenAPIDefinition(
		servers = {
				@Server(
					description = "localhost",
					url = "localhost:9080/RPABluecardHostService/resources"),
				@Server(
					description = "development",
					url = "https://isshareddev.abcbs.net/RPABluecardHostService/resources"),
				@Server(
						description = "test",
						url = "https://issharedtst.abcbs.net/RPABluecardHostService/resources"),
				@Server(
					description = "stage",
					url = "https://issharedstg.abcbs.net/RPABluecardHostService/resources"),
				@Server(
					description = "production",
					url = "https://isshared.abcbs.net/RPABluecardHostService/resources")
		})
@SecurityScheme(name = "basicAuth",
		type = SecuritySchemeType.HTTP,
		scheme = "basic",
		description = "Username and Password are used for authorization")

public class RPABluecardHostResource {
	
    /**
     * Private method
     * 
     * Data object to get database information
     * 
     * Utilizing isSharedApplication class
     * 
     */
	private static Logger logger = LogManager.getLogger(RPABluecardHostResource.class);
	private static IsSharedApplicationDataObject isSharedApplicationDataObject = null;
	private static String jndi = "db2NodeDB";
	private static String schema = "DB26ITS";

	static {
		try {
			isSharedApplicationDataObject = new IsSharedApplicationDataObject(Constants.SYSTEM_NAME, Constants.AUTH_KEY, Constants.AUTH_PASS_PHRASE_DEV);
		} catch (Exception e) {
			logger.error(ExceptionUtils.getStackTrace(e));
		}
	}
	/**
     * Public method
     * 
     * Method to output successful message from the server
     * 
     * Includes brief instruction on how to use this service
     * 
     * @return List value
     * 
     */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Operation(summary = "Service base endpoint that you can hit to get a response from the server",
			security = @SecurityRequirement(name = "basicAuth"),
			description = "A simple base endpoint that you can hit to get a response from the server",
			responses = {
					@ApiResponse(
							description = "JSON response",
							content = @Content(mediaType = "application/json",
							schema = @Schema(implementation = JsonPayload.class))),
					@ApiResponse(responseCode = "401", description = "Credentials not authorized") }
	)	
	public String blueCardMessage(){
		return "{\"message\": \"Bluecard service will accept in a request and respond with the appropriate information queried from the Blue2/ITS database. Db2jndiName: " + isSharedApplicationDataObject.getDb2JndiName() + ". Schema: " + isSharedApplicationDataObject.getDb2Schema() + ". Please append your sccf number to this endpoint. \"}";
	}
	/**
     * Public method
     * 
     * Calculates the total count of lines for *COVID* given a claim number. 
     * 
     * Message ID is a string type that will be required from the user during the call 
     * 
     * It will go through the claim number validation security guidelines in order to retrieve the final service line count (*COVID*) for that particular claim 
     * 
     * @return returns the total count of lines for *COVID* given a claim number
     * 
     */
	@GET
	@Path("/{messageId}")
	@Produces(MediaType.APPLICATION_JSON)
	@Operation(summary = "Purpose for this GET method is to retrieve queried information from blue2ITS for each sccf#",
	security = @SecurityRequirement(name = "basicAuth"),
	description = "Returns a complete list of all the information requested from each sccf",
	responses = {
		@ApiResponse(
				description = "JSON response in a form of array",
				content = @Content(mediaType = "application/json",
				array = @ArraySchema(schema = @Schema(implementation = BluecardDTO.class)))),
		@ApiResponse(responseCode = "401", description = "Credentials not authorized") }
	)
	@JacksonFeatures(serializationEnable =  { SerializationFeature.INDENT_OUTPUT })
	
	public List<BluecardDTO> blueCardTotalInfo (
			@Parameter(description = "Identify the string and perform input validation. {messageId} refers to the 'sccf id' in Blue2ITS (DB2) database",
			required = true)
			@PathParam("messageId") String id,
			@DefaultValue("false") @QueryParam("facility") boolean facility) {
		RPABluecardHostMessage info = new RPABluecardHostMessage();
		String sccfId = info.getMessage(id);
		BluecardJavaBean bluecardJavaBean = new BluecardJavaBean();
		
		if (facility) {
			return bluecardJavaBean.queryBlueSquareFacility(isSharedApplicationDataObject.getDb2JndiName(),isSharedApplicationDataObject.getDb2Schema(),sccfId);
			//return bluecardJavaBean.queryBlueSquareFacility(jndi,schema,sccfId);
		} else {
			return bluecardJavaBean.queryBlueSquare(isSharedApplicationDataObject.getDb2JndiName(),isSharedApplicationDataObject.getDb2Schema(),sccfId);
			//return bluecardJavaBean.queryBlueSquare(jndi,schema,sccfId);
		}
	}
	
	/**
     * Public method
     * 
     * Retrieves all the request message type from the current claim
     * 
     * M2 process initiative to exclude PURGE and/or ADJUST message type claims 
     * 
     * @return returns JSON list with reason code and message types
     * 
     */
	@GET
	@Path("/m2/{claimNumber}")
	@Produces(MediaType.APPLICATION_JSON)
	@Operation(summary = "Purpose for this GET method is to retrieve queried information from blue2ITS for each origclaim#",
	security = @SecurityRequirement(name = "basicAuth"),
	description = "Returns a complete list of ipp msg search",
	responses = {
		@ApiResponse(
				description = "JSON response in a form of array",
				content = @Content(mediaType = "application/json",
				array = @ArraySchema(schema = @Schema(implementation = BlueSquareDTO.class)))),
		@ApiResponse(responseCode = "401", description = "Credentials not authorized") }
	)
	@JacksonFeatures(serializationEnable =  { SerializationFeature.INDENT_OUTPUT })
	
	public List<BlueSquareDTO> m2MessageType (
			@Parameter(description = "Identify the string and perform input validation. {claimNumber} refers to the 'prcsg_site_plan_cd' in Blue2ITS (DB2) database",
			required = true)
			@PathParam("claimNumber") String id)
			 {
		RPABluecardHostMessage info = new RPABluecardHostMessage();
		String claimNumber = info.getMessage(id);
		BluecardJavaBean bluecardJavaBean = new BluecardJavaBean();
		
		return bluecardJavaBean.queryBlueSquareMessageType(isSharedApplicationDataObject.getDb2JndiName(),isSharedApplicationDataObject.getDb2Schema(),claimNumber);
		
	}

	/**
     * Public method
     * 
     * Performs credential validation 
     * 
     * If user gets a 401 they are unauthorized
     * 
     * @return JsonPayLoad type message 
     * 
     */
	@GET
	@Path("/test/authorization") 
	@Produces(MediaType.APPLICATION_JSON)
	@Operation(summary = "Simple test authorization method",
		security = @SecurityRequirement(name = "basicAuth"),
		description = "Test your credentials",
		responses = {
			@ApiResponse(
					description = "A method to simply test your credentials against the web service to see if you are authorized",
					content = @Content(mediaType = "application/json")),
			@ApiResponse(responseCode = "401", description = "Credentials not authorized")}
	)
	public JsonPayload testAuthorization() {
		JsonPayload payload = new JsonPayload();
		payload.setMessage("authorization valid");
		return payload;
	}
}
