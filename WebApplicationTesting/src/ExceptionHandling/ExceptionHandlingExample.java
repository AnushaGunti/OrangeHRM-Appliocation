package ExceptionHandling;

public class ExceptionHandlingExample {
	public void addition()
	{
	  int var1=10;
	  int var2=20;
	  int var3;
	  var3=var1+var2;
	  System.out.println("The value of the  varaible after addition"+var3);
	}
	public void division()
	{
		try {
			int var1=30;
			int var2=0;
			int var3;
			var3=var1/var2;
			 System.out.println("The value of the  varaible after division"+var3);
		}
		catch(Exception divisionException)
		{
System.out.println("Exception is:-"+divisionException);
		}
	}
		public void subtraction()
		{
		  int var1=10;
		  int var2=20;
		  int var3;
		  var3=var1-var2;
		  System.out.println("The value of the  varaible after subtraction"+var3);
		
		
		
	}

	public static void main(String[] args) {
		ExceptionHandlingExample EE=new ExceptionHandlingExample();
		EE.addition();
		EE.division();
		EE.subtraction();

	}

}
