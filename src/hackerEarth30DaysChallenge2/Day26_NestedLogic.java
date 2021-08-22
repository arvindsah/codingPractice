package hackerEarth30DaysChallenge2;

	import java.io.*;
	import java.util.*;

	public class Day26_NestedLogic {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	    
	    
	int fine;
	        
	        Scanner scan = new Scanner(System.in);
	        
	        int returnDay = scan.nextInt();
	        int returnMonth = scan.nextInt();
	        int returnYear = scan.nextInt();
	        
	        int dueDay = scan.nextInt();
	        int dueMonth = scan.nextInt();
	        int dueYear = scan.nextInt();
	        
	        scan.close();
	        
	        if(returnYear <= dueYear){
	            if(returnMonth <= dueMonth){
	                if(returnDay <= dueDay){
	                    fine = 0;
	                }else{
	                    fine = (returnDay - dueDay) * 15;
	                }
	            }else{
	                fine = (returnMonth - dueMonth) * 500;
	            }
	        }else{
	            fine = 10000;
	        }
	        
	        System.out.println(fine);
	    }
	    
	}
	    
