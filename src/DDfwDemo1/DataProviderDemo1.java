package DDfwDemo1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo1
{

	@Test
		public void funA(int a)
	{
		System.out.println("funA of DtataProvider");
		System.out.println(a);
		
	}
    
	@DataProvider
	public Object[][] setData()
	{
		Object[][] o1=new Object[1][1];
				o1[0][0]=10;
		return o1;
	}

}

