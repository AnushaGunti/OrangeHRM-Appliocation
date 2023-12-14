package ArraysExample;

public class multipleDimensionalArray {
	public static void main(String[] args) {
		String array1[][]=new String[2][2];
	
	array1[0][0]="Venkatsir";
	array1[0][1]="Manual Testing";
	array1[1][0]="Srini";
	array1[1][1]="Automation Testing";
	for(int arrayRowindex=0;arrayRowindex<array1.length;arrayRowindex++)
	{
		for(int arrayRowOfCellindex=0;arrayRowOfCellindex<array1.length;arrayRowOfCellindex++)
		{
			System.out.println(array1[arrayRowindex][arrayRowOfCellindex]);
		}
	}
		

	}

}
