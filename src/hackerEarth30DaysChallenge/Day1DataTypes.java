package hackerEarth30DaysChallenge;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Day1DataTypes {

		
	    public static void main(String[] args) {
	        int i = 4;
	        double d = 4.0;
	        String s = "HackerRank ";
			
	        Scanner scan = new Scanner(System.in);

	        /* Declare second integer, double, and String variables. */
	        
	        /* Read and save an integer, double, and String to your variables.*/
	        System.out.println("Enter interger");
	        int secondInteger=scan.nextInt();
	        System.out.println("Enter double");
	        double secondDouble=scan.nextDouble();
	        
	        
	        scan.nextLine();
	        System.out.println("Enter string");
	        String secondString=scan.nextLine();
	        System.out.println("not wating for nect line" + secondString);
	        
	        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
	        
	        /* Print the sum of both integer variables on a new line. */
	        System.out.println(i+secondInteger);
	        

	        /* Print the sum of the double variables on a new line. */
	        System.out.format("%.1f",d+secondDouble);
	        System.out.println();
	        
			
	        /* Concatenate and print the String variables on a new line; 
	        	the 's' variable above should be printed first. */
	        
	        System.out.println(s+secondString);
	        
	        scan.close();
	    }
	

}
