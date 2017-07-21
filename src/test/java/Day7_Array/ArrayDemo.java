package Day7_Array;
import java.util.Arrays;
public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] arry = new int[5];
		
		
		int[] myInt = {3, 5, 1};   
		int[] myInt1 = new int[]{4, 5, 6};  // Can also be declared and initialized like this
		int[] myInt2 = new int[5];
		
		String[] myString = {"cat", "mat", "rat"};
		String[] myString2 = new String[] {"cat", "mat", "rat"}; // Can also be declared and initialized like this
		
		System.out.println(myInt1);  // Prints the memory value
		
		Arrays.sort(myInt);  // Sorts the array myInt
		
//		System.out.println(Arrays.sort(myInt));// THIS IS WRONG. Any func with return type void can't be used in print Stmt
		
//		Arrays class has lots of inbuilt methods to use. Eg: Arrays.asList()
		
		String myIntStr = Arrays.toString(myInt);  // String representation of an Array with braces [ ] 
		
		System.out.println(myIntStr); // Prints [1, 3, 5]
	}
}
