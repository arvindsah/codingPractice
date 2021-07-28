package hackerEarth30DaysChallenge;

import java.io.*;
import java.util.*;

public class Day6_Review {

	


	    public static void main(String[] args) throws IOException {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        
	        
	        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	        int N=Integer.parseInt(br.readLine().trim());
	        StringBuffer strBfr1= new StringBuffer("");
	        StringBuffer strBfr2= new StringBuffer("");
	        
	        for (int i=0;i<N;i++) {
	        	System.out.println("value of N - " +N);
	        	strBfr1.delete(0, strBfr1.length());
	        	strBfr2.delete(0, strBfr2.length());
	        	String value=br.readLine();
	        	
	        	for(int j=0;j<value.length();j++) {
	        		if(j%2==0) {
	        			strBfr1.append(value.charAt(j));
	        		}else {
	        			strBfr2.append(value.charAt(j));
	        		}
	        	}
	        	System.out.println(strBfr1+ " "+ strBfr2);
	        	
	        }
	     br.close();   
	    }
}
