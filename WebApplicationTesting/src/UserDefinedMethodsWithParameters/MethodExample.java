package UserDefinedMethodsWithParameters;

public class MethodExample {
	//Method Name should be unique
	//method without parameters
    public void addition()
    {
    	int var1=10;
    	int var2=20;
    	int var3;
    	var3=var1+var2;
    	System.out.println("The value of the Varaible value after adiition is:-"+var3);
    }
    //method with parameters and similar DataType
    //in the paramenters we dont give the values of the varaibles
    public void addition(int var1,int var2)
    {
    	int var3;
    	var3=var1+var2;
    	System.out.println("The value of the varaible value after addition is:-"+var3);
    }
    //method with 3 parameters 
    //decleared with similar datatype
    public void addition(int var1,int var2,int  var3)
    {
    	var3=var1+var2;
    	System.out.println("The value of the varaible value after addition is:-"+var3);
    }
    //method with 3 parameters
    //Declared with different Data types
    public void addition(int var1,int var2,double var3)
    {
    	double var4;
    	//var4=var1+var2;
    	var4=var1+var2+var3;
    	System.out.println("The value of the varaible value after addition is:-"+var4);
    }
	public static void main(String[] args) {
		MethodExample m1=new MethodExample();
		System.out.println("*****Method without parameters**********"); 
		m1.addition();
		System.out.println("*****Method with 2 parameters**********"); 
		m1.addition(60, 90);
		//wantedly taking againg same method which is having 2 parameters
		//To check which integers of out the method gives
		System.out.println("*****Method with 2 parameters**********"); 
		m1.addition(100, 60);
		System.out.println("*****Method with 3 parameters**********"); 
		m1.addition(30, 40, 50);
		System.out.println("*****Method with 3 parameters with different datatype**********"); 
		m1.addition(20, 50, 90.123);
	}

}
