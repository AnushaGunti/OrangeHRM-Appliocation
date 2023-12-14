package ArraysExample;

public class objectArrayExample {

	public static void main(String[] args) {
		//object ArrayName=new object[size];
		Object array1[]=new Object[4];
		array1[0]=20;
		array1[1]='A';
        array1[2]="Testing";
        array1[3]=10.23;
        /*
         * System.out.println(array1[0]);
         * System.out.println(array1[1]);
         * System.out.println(array1[2]);
         * System.out.println(array1[3]);
         */
       // for(int index=0;index<array1.length;index++)
       // {
        //	System.out.println(array1[index]);
       // }
        for(Object index :array1)
        {
        	System.out.println(index);
        }
        
	}

}
