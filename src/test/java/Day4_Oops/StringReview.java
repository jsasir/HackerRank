package Day4_Oops;

import java.util.Scanner;
/*
 * Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as 
 * space-separated strings on a single line 
Note: 0 is considered to be an even index.

***Sample Input****
2
Hacker
Rank

***Sample Output****
Hce akr
Rn ak

 */


public class StringReview {

	public static void main(String[] args) {

		String[] inputText = new String[10];
		Scanner scan = new Scanner(System.in);
		String evenString = "";
		String oddString = "";
		
		System.out.println("How many cases you want to try?. Enter a number");
		int numberofTest = scan.nextInt();
		
		for(int i=0; i<numberofTest; i++){
			inputText[i] = scan.next();
		}
		
		
		for(int i=0; i<numberofTest; i++){
			char[] splitChar = inputText[i].toCharArray();
			for(int j=0; j<splitChar.length; j++){
				if (j%2==0){
					evenString = evenString + splitChar[j];
				}
				else 
				{oddString = oddString + splitChar[j];}
			}
			System.out.println(evenString+" "+ oddString);
			evenString = "";
			oddString = "";
	}
		}
}
