package net.abcbs.eae.jaxrs;
import javax.xml.bind.annotation.*;
/***********************************************************************************************************************************************************************
 * @author mfribeiro
 * 
 * Description: RPABluecardHostMessage class will be used to print the message back after the web service call
 * 
 * Project: Bluecard Host Adjustment 
 ***********************************************************************************************************************************************************************/
@SuppressWarnings("unused")
public class RPABluecardHostMessage {
	private String blueCardInfo;
	private int id;
	
	
	public RPABluecardHostMessage(){
		
	}
	public RPABluecardHostMessage(String message){
		this.blueCardInfo = message;
	}
	public RPABluecardHostMessage(String message, int id){
		this.blueCardInfo = message;
		this.id = id;
	}
	public String printMessage() {
		return blueCardInfo;
	}
	
	public String getMessage(String message) {
		return message;
	}

	public void setMessage(String message) {
		this.blueCardInfo = message;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
}
