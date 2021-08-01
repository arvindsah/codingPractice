 package hackerEarth30DaysChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day10_BinaryNumbers {
	/*
	 * find the ocruance of cucutive once in binary number from digit number
	 */
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        
        int rem=0,s=0,t=0;


        while(n>0)
            {
            rem=n%2;
            n=n/2;
            if(rem==1)
             {   s++;
               if(s>=t)

                t=s;

            }
            else{

                s=0;
            }   
        }

        System.out.println(t);
    }
}