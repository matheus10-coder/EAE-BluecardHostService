package net.abcbs.eae.test;

import static org.junit.Assert.*;
import net.abcbs.eae.jaxrs.*;
import org.junit.Test;
import net.abcbs.rpa.dto.BluecardDTO;
import net.abcbs.issh.util.pub.common.IsSharedApplicationDataObject;

/***********************************************************************************************************************************************************************
 * @author mfribeiro
 * 
 * Description: BluecardDTOTest class used to provide and perform unit test on the core functions of the application
 * 
 * Project: Bluecard Host Adjustment 
 ***********************************************************************************************************************************************************************/
public class BluecardDTOTest {
	
	/**
	 * IsSharedApplicationDataObject isSharedApplicationDataObject = new IsSharedApplicationDataObject(Constants.SYSTEM_NAME, Constants.AUTH_KEY, Constants.AUTH_PASS_PHRASE_DEV);
	 * 
	 * JUnit test cases
	 * 
	 * Testing sccfID getter and setter
	 * Testing database connection and manager properties 
	 */
	
	
	/**SCCF ID*/
	@Test
	public void testSccfId() {
		BluecardDTO sccfId = new BluecardDTO();
		sccfId.setSccf("1234567SCCFTEST");
		String result = sccfId.getSccf();
		assertEquals("1234567SCCFTEST", result);
	}
	
	/**Patient First Name*/
	@Test
	public void testpatFirstName() {
		BluecardDTO patFirstName = new BluecardDTO();
		patFirstName.setPatFirstName("Adam");
		String result = patFirstName.getPatFirstName();
		assertEquals("Adam", result);
	}
	
	/**Patient Last Name*/
	@Test
	public void testpatLastName() {
		BluecardDTO patLastName = new BluecardDTO();
		patLastName.setPatFirstName("Smith");
		String result = patLastName.getPatFirstName();
		assertEquals("Smith", result);
	}
	
	
	/**Other Carrier*/
	@Test
	public void testotherCarrier() {
		BluecardDTO otherCarrier = new BluecardDTO();
		otherCarrier.setOtherCarrier("Y");
		String result = otherCarrier.getOtherCarrier();
		assertEquals("Y", result);
	}
	
	/**Patient Paid Amount
	@Test
	public void testpatPaidAmt() {
		double delta = 1e-15;
		BluecardDTO paidAmt = new BluecardDTO();
		paidAmt.setPatPaidAmt(22000.00);
		double result = paidAmt.getPatPaidAmt();
		assertEquals(22000.00, result, delta);
	}*/
	/**
	@Test
	public void testIsSharedAppPropDataSource() {
		String dataSource = isSharedApplicationDataObject.getDb2JndiName();
		assertNotNull(dataSource);
	}
	
	@Test
	public void testIsSharedAppPropDbScheme() {
		String scheme = isSharedApplicationDataObject.getDb2Schema();
		assertNotNull(scheme);
	}**/
	

}
