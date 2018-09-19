package demoseleniumday1;

import org.testng.annotations.Test;

public class DataProvider {
	
	@Test(dataProvider="getdata")
	public void testcase(String name,String pass)
	{
		System.out.println(name+"-----"+pass);
	}


	@org.testng.annotations.DataProvider
	public Object[][] getdata()
	{
		Object obj[][]={{"name1","pass1"},{"name2","pass2"}		
		
	};
	
	return obj;
		
}
}

