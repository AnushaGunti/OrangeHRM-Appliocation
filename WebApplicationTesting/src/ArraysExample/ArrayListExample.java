package ArraysExample;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
	//List <datatype> arrayListName=new ArrayList<>();
		List<Object> arrayList1=new ArrayList<>();
		arrayList1.add(20);
		arrayList1.add("selenium");
		arrayList1.add('B');
		arrayList1.add(20.1234);
		arrayList1.add(40);
		/*
		 * System.out.println(arrayList1.get(0));
		 * * System.out.println(arrayList1.get(1));
		 * * System.out.println(arrayList1.get(2));
		 * * System.out.println(arrayList1.get(3));
		 */
		/*for(int index=0;index<arrayList1.size();index++)
		{
			System.out.println(arrayList1.get(index));
		}
		*/
       System.out.println("********ForEach Loop***********");
       for(Object index :arrayList1)
       {
    	   System.out.println(index);
       }
	}

}
