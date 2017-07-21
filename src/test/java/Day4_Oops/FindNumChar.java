package Day4_Oops;

public class FindNumChar {

	public static void main(String[] args){
		
		String a = "sdkofjsdlkwqqwenzx asmnasdnbijasd sd--=3";
		int countA = 0;
		int countS = 0;
				
		//finding number of a and s in the given string. 
				
			for(int i=0; i<a.length(); i++){
			
				if (a.charAt(i)=='a'){
					countA++;
			}	else if (a.charAt(i)=='s'){
					countS++;
				}
			else {	continue; }
			}
			System.out.println("Count of a = "+countA+ "\nCount of s = "+ countS);
			}
		
	}
