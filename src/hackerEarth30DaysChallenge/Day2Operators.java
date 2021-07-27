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


public class Day2Operators {

	    /*
	     * Complete the 'solve' function below.
	     *
	     * The function accepts following parameters:
	     *  1. DOUBLE meal_cost
	     *  2. INTEGER tip_percent
	     *  3. INTEGER tax_percent
	     */
	
	/**
	 *  There is difference between math.round and int type casting 
	 * 
	 */

	    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
	    // Write your code here

	    	 System.out.println(Math.round(meal_cost + meal_cost*tip_percent/100 
	                    + meal_cost*tax_percent/100 ));
	    }

	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

	        double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());

	        int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());

	        int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());

	        Day2Operators.solve(meal_cost, tip_percent, tax_percent);

	        bufferedReader.close();
	    }

}
