//***************************************************
//
//Code by Jauharul Arifin
//array1.java
//***************************************************
public class array1{
	public static void main(String[] args) {

		int[] number1={};
		int[] number2={};

		//print array number1
		System.out.println("First Array: ");
		for(int i=0; i<number1.length; i++)
			System.out.print(number1[i] + " ");

		//print extra lines
		System.out.println("");

		//print array number2
		System.out.println("Second Array: ");
		for(int i=0; i<number2.length; i++)
			System.out.print(number2[i] + " ");


		//print extra lines
		System.out.println("");
		System.out.println ("");

		//set some value for first array
		number1 = new int[6];
		number1[0] = 1;
		number1[1] = 2;
		number1[2] = 3;
		number1[3] = 4;
		number1[4] = 5;
		number1[5] = 6;

		//print array number1
		System.out.println("First Array after assign values: ");
		for(int i=0; i<number1.length; i++)
			System.out.print(number1[i] + " ");

		//print extra lines
		System.out.println("");

		//print array number2
		System.out.println("Second Array: ");
		for(int i=0; i<number2.length; i++)
			System.out.print(number2[i] + " ");

		//print extra lines
		System.out.println("");
		System.out.println ("");


		//copy value of first array to second array
		int [] b = number1.clone();

		//print array 1 & 2 after copy array 1 to 2
		System.out.println("First Array after change value: ");
		for(int i=0; i<number1.length; i++)
			System.out.print(number1[i] + " ");

		//print extra lines
		System.out.println("");

		//print array number2
		System.out.println("Second Array Copy from first Array: ");
		for(int i=0; i<b.length; i++)
			System.out.print(b[i] + " ");

	}
}