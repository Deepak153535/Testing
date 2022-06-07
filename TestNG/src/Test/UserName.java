package Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class UserName {

	@Test(dataProvider="getData")
	public void test(String username,String password)
	{
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getData()
	{
		Object[][]data=new Object[3][2];
		
		data[0][0]="firstusernmae";
		data[0][1]="firstpassword";
		
		data[1][0]="secondusername";
		data[1][1]="secondpassword";
		
		data[2][0]="thirdusername";
		data[2][1]="thirdpassword";
				
		return data;
	}
}
