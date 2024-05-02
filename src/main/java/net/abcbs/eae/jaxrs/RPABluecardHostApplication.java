package net.abcbs.eae.jaxrs;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
/***********************************************************************************************************************************************************************
 * @Author ABCBS Resource
 * 
 * Description: RPABluecardHostApplication class will be used as the application driver
 * 
 * Project: Bluecard Host Adjustment 
 ***********************************************************************************************************************************************************************/
@ApplicationPath("resources")
public class RPABluecardHostApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(RPABluecardHostResource.class);
		return classes;	
	}
}