package UserDefinedMethods;

public class ProtectedEx1 {
 protected void add() {
	 int var1=10;
	 int var2=20;
	 int var3=var1+var2;
	 System.out.println("The value of the var3;-"+var3);
	 
 }
 protected void sub()
 {
	 int var1=10;
	 int var2=20;
	 int var3=var1-var2;
	 System.out.println("The value of the var3:-"+var3);
	 
 }
	public static void main(String[] args) {
		ProtectedEx1 m3=new ProtectedEx1();
		m3.add();
		m3.sub();

	}

}
