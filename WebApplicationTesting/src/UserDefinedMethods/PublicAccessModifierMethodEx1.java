package UserDefinedMethods;

public class PublicAccessModifierMethodEx1 {
	//
	//Global Variables are useful when there are no variables with in the method 
	//userdefined method can write no.of methods in the class
	//the same global variables values are used for all the methods in the same class 
	//and if the access modifier is public it can be used to perform the variables operation in different class using other class creating object and object calling
	//And also public is used to perform the variable values  operation in different package and different class
	//no.og methods can be written
	int var1=10;//Global Variables
	int var2=30;
	public void addition()
	{
		//Local Variables are used only for within the methods only;
		int var1=20;
		int var2=30;
		int var3;
		var3=var1+var2;
		System.out.println("The value of the varaible value var3 is:-"+var3);
	}
	public void subtraction()
	{
		//here local variables values are not given and it is automatically accessing the Global values
	int var3=var1-var2;
	System.out.println("The value of the varaible value var3 is:-"+var3);
	}
	

	public static void main(String[] args) {
		PublicAccessModifierMethodEx1 m1=new PublicAccessModifierMethodEx1();
		m1.addition();
		m1.subtraction();

	}

}
