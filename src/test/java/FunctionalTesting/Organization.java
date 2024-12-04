package FunctionalTesting;

import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.pom.organizationPOM;

public class Organization extends BaseClass {
	@Test
	public void organization() {
		
		organizationPOM org=new organizationPOM(driver);
		
		org.organization();
		org.createOrg();
		org.accountName();
		org.save();
		postCondition();
	}
}
