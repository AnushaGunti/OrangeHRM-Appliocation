package UserDefinedMethods;

public class DefaultEx1 {
	void mul()//default Access Modifier
	{
		 int var1=10;
		 int var2=20;
		 int var3=var1+var2;
		 System.out.println("The value of the var3;- "+var3);
	}
	void Div()//default Access Modifier
	{
		 int var1=10;
		 int var2=20;
		 int var3=var1/var2;
		 System.out.println("The value of the var3;- "+var3);
	}

	public static void main(String[] args) {
		DefaultEx1 m4=new DefaultEx1();
		m4.mul();
		m4.Div();

	}

}
