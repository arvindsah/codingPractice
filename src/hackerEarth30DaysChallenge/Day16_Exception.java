package hackerEarth30DaysChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day16_Exception {
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String S = bufferedReader.readLine();
        int number;
        try{
        	number=Integer.parseInt(S);
        	System.out.println(number);
        } catch(NumberFormatException e) {
        	System.out.println("Bad String");
        }
        
        
        bufferedReader.close();
    }

}
