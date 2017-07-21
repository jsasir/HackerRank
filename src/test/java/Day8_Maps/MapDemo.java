package Day8_Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapDemo {

	public static void main(String[] args) {
		
		Map<String, Integer> phBook= new HashMap<String, Integer>(); 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the #of phone book entries you input");
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
        	System.out.println("Enter the name and phoneNo");
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phBook.put(name, phone);
        }
        
        while(in.hasNext()){
        	System.out.println("Enter the name of the phno which you've stored");
            String s = in.next();
            if (phBook.containsKey(s)){
            	System.out.println(s+"="+phBook.get(s));
            }
            else { System.out.println("Not found"); }
        }
        in.close();
    }
	}

