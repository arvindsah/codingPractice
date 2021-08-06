package hackerEarth30DaysChallenge;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;





	class Difference {
	  	private int[] elements;
	  	public int maximumDifference;
	    public Difference(int[] a){
	        elements=a;
	    }
		// Add your code here
	    public void computeDifference(){
	        maximumDifference=0;
	        for(int i =0; i<elements.length;i++){
	            for(int j =i; j<elements.length;j++){
	                if(Math.abs(elements[i]-elements[j])>maximumDifference){
	                    maximumDifference=Math.abs(elements[i]-elements[j]);
	                }
	        }}
	    }
	} // End of Difference class

	public class Day14_Scope {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextInt();
	        }
	        sc.close();

	        Difference difference = new Difference(a);

	        difference.computeDifference();

	        System.out.print(difference.maximumDifference);
	    }
	}
