package UserDefinedMethods;

public class PrivateEx1 {
	private void multiplication()
	{
		int var1=10;
		int var2=20;
		int var3;
		var3=var1*var2;
		System.out.println("The value of the var3 is:-"+var3);
	}
	private void Division()
	{
		int var1=40;
		int var2=10;
		int var3;
		var3=var1/var2;
		System.out.println("The value of the var3 is:-"+var3);
	}
	

	public static void main(String[] args) {
	PrivateEx1 m2=new PrivateEx1();
	m2.multiplication();
	m2.Division();

	}

}
