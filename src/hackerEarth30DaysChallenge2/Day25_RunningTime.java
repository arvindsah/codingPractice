package hackerEarth30DaysChallenge2;

import java.util.Scanner;

public class Day25_RunningTime {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		 
		 Scanner scan= new Scanner(System.in);
		 int size=scan.nextInt();
		 
		 int[] arr= new int[size];
		 for(int i=0;i<size;i++) {
			 arr[i]=scan.nextInt();
		 }
		 
		 for(int i=2;i<arr[size-1];i++) {
			 if(arr[i]%i==0)
{
	System.out.println("Not Prime");
}
}
		 }
	    }
	}


