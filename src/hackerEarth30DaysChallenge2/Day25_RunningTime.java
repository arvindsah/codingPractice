package hackerEarth30DaysChallenge2;

import java.util.Scanner;


public class Day25_RunningTime {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. 
	         * Print output to STDOUT. Your class should be named Solution. */
		 
		 Scanner scan= new Scanner(System.in);
         int size=scan.nextInt();
         
         int[] arr= new int[size];
         for(int j=0;j<size;j++) {
             arr[j]=scan.nextInt();
             
             if(arr[j]==1)
                 {System.out.println("Not prime");
                 continue;}
             boolean isPrime=true;
             
             for (int i = 2; i * i <= arr[j]; i++) {
                    if (arr[j] % i == 0) {
                    isPrime=false;
                }
            }
             if(isPrime) {
                 System.out.println("Prime");
             }else {
                 System.out.println("Not prime");
             }
             
         }
        
         scan.close();
        }
	 }


