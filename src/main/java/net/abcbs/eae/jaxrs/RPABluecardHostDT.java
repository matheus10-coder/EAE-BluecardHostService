package net.abcbs.eae.jaxrs;
import java.util.ArrayList;
import java.util.*;
/***********************************************************************************************************************************************************************
 * @author mfribeiro
 * 
 * Description: RPABluecardHostDT class is used to manually test the web service call to retrieve values out of a data table
 * 
 * Project: Bluecard Host Adjustment 
 ***********************************************************************************************************************************************************************/
public class RPABluecardHostDT {
	
	public List<RPABluecardHostMessage> getDBServiceLines(){
		RPABluecardHostMessage servLn1 = new RPABluecardHostMessage("COVID19",1);
		RPABluecardHostMessage servLn2 = new RPABluecardHostMessage("ITS",2);
		RPABluecardHostMessage servLn3 = new RPABluecardHostMessage("N/A",3);
		
		List<RPABluecardHostMessage> serviceLinesLs = new ArrayList<>();
		serviceLinesLs.add(servLn1);
		serviceLinesLs.add(servLn2);
		serviceLinesLs.add(servLn3);
		return serviceLinesLs;
	}

}
