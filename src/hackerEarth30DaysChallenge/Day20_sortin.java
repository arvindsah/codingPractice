package hackerEarth30DaysChallenge;


	import java.io.IOException;
import java.util.Scanner;



	public class Day20_sortin {
	    public static void main(String[] args) throws IOException {
	         Scanner scan = new Scanner(System.in);
	     int n = scan.nextInt();
	     int a[] = new int[n];
	     for (int i=0; i<n; i++) {
	         a[i] = scan.nextInt();
	     }
	        // Write your code here
	        
	        int numberOfSwaps = 0;
	        for (int i = 0; i < n; i++) {
	    // Track number of elements swapped during a single array traversal
	    
	    
	    for (int j = 0; j < n - 1; j++) {
	        // Swap adjacent elements if they are in decreasing order
	        if (a[j] > a[j + 1]) {
	            int temp1=a[j];
	            a[j]=a[j+1];
	            a[j+1]=temp1;
	            numberOfSwaps++;
	        }
	    }
	    
	    // If no elements were swapped during a traversal, array is sorted
	    if (numberOfSwaps == 0) {
	        break;
	    }
	}

	System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
	System.out.println("First Element: "+a[0]);
	System.out.println("Last Element: "+a[n-1]);




	        scan.close();
	    }
	    
	   
	}

