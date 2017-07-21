package Day11_2DArray;

import java.util.Arrays;
import java.util.Scanner;

public class Array2DDemo {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] sum = new int[66];
        int s = 0;
        int arr[][] = new int[4][4];
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        for(int i=0; i<2; i++){
        	for(int j=0; j<2; j++){
        		sum[s]= arr[i][j]+arr[i][j+1]+arr[i][j+2]
        				+ arr[i+1][j+1]
        				 + arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
        		s++;
        	}
        }
        Arrays.sort(sum);
        System.out.println(sum[8]);
    }
}
