package hackerEarth30DaysChallenge;


	
	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.function.*;
	import java.util.regex.*;
	import java.util.stream.*;
	import static java.util.stream.Collectors.joining;
	import static java.util.stream.Collectors.toList;

	/*
	 * Given an integer, , perform the following conditional actions:

If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
	 */

	
	/*
	 * Explain what is wrong here -  

if (90 >>= angle =<< 180) 

Since all operators besides assignment are evaluated left-to-right,
 this would associate as (90 <= angle) <= 180, which is comparing a 
 boolean to an integer, which is not allowed. 

 
	 */
	
	
	public class Day3Operators {
	
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        int N = Integer.parseInt(bufferedReader.readLine().trim());
	        
	        String testToPrint;
	        if(N%2!=0){
	                        testToPrint="Weird";
	        } else if(N%2==0 && (2<=N) && (N<=5)){
	            testToPrint="Not Weird";
	        }
	        
	        else if(N%2==0 && (6<=N) && (N<=20)){
	            testToPrint="Weird";
	        }
	        
	        else{
	            testToPrint="Not Weird";
	        }
	    System.out.println(testToPrint);
	        bufferedReader.close();
	    }
	}


}
