package testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.crm.BaseClass.BaseClass;
import com.crm.pom.LoginRepo;
public class Script1 extends BaseClass {

	@Test
	 public void script1() throws IOException
	 {
	  
	  LoginRepo l = new LoginRepo(null);
	  l.login();
	  
	 }
	}


