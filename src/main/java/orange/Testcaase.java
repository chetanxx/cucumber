package orange;

import org.testng.annotations.AfterMethod;

public class Testcaase {

	public void tsng() 
	{
		DriverClass.WebDriver();
	}

	@AfterMethod
	public void tsng1() {

		DriverClass.close();


	}

	public static void TestCase1() throws Exception {
		OrangeHrmValidation.loginpage(Loginpage.loginpage());
	}

	public static void TestCase2() throws Exception {

		Loginpage.usernamekeys("Admin");
		Loginpage.passwordkeys("admin123");
		OrangeHrmValidation.EnteredUsername("Admin");
		OrangeHrmValidation.EnteredPassword("admin123");
		Loginpage.loginbuttonkeys();
		OrangeHrmValidation.Homepage(Loginpage.Homepage());
	}

	// Testcase3 username is wrong and password is correct

	public static void TestCase3() throws Exception {

		Loginpage.usernamekeys("Admi");
		Loginpage.passwordkeys("admin123");
		OrangeHrmValidation.EnteredUsername("Admi");
		OrangeHrmValidation.EnteredPassword("admin123");
		Loginpage.loginbuttonkeys();
		OrangeHrmValidation.IuserVpass(Loginpage.IuserVpass());
	}
	// Testcase4 username is blank and password is right

	public static void TestCase4() throws Exception {

		Loginpage.passwordkeys("admin123");
		OrangeHrmValidation.EnteredPassword("admin123");
		Loginpage.loginbuttonkeys();
		OrangeHrmValidation.NullUserVPass(Loginpage.NullUserVPass());
	}
	// Testcase5 username is right and password is wrong

	public static void TestCase5() throws Exception {

		Loginpage.usernamekeys("Admin");
		Loginpage.passwordkeys("admi");
		OrangeHrmValidation.EnteredUsername("Admin");
		OrangeHrmValidation.EnteredPassword("admi");
		Loginpage.loginbuttonkeys();
		OrangeHrmValidation.VuserIpass(Loginpage.IuserVpass());
	}
	// Testcase6 username is right and password is blank

	public static void TestCase6() throws Exception {

		Loginpage.usernamekeys("Admin");
		OrangeHrmValidation.EnteredUsername("Admin");
		Loginpage.loginbuttonkeys();
		OrangeHrmValidation.VuserNullpass(Loginpage.NullUserVPass());
	}
	// Testcase7 username and password is blank

	public static void TestCase7() throws Exception {

		Loginpage.loginbuttonkeys();
		OrangeHrmValidation.NulluserNullpass(Loginpage.NullUserVPass());
	}
	// Testcase8 username and password is wrong

	public static void TestCase8() throws Exception {

		Loginpage.usernamekeys("Admi");
		Loginpage.passwordkeys("admi");
		OrangeHrmValidation.EnteredUsername("Admi");
		OrangeHrmValidation.EnteredPassword("admi");
		Loginpage.loginbuttonkeys();
		OrangeHrmValidation.IuserIpass(Loginpage.IuserVpass());
	}

}
