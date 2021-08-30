package hackerEarth30DaysChallenge2;
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

	class Result {
		//All possible values of  and  are: A:1, B:2, A&B=0
		// A:1= 0 1
		//B:2=  1 0
		//A&B=  0 0
		//final answer is 0

	    /*
	     * Complete the 'bitwiseAnd' function below.
	     *
	     * The function is expected to return an INTEGER.
	     * The function accepts following parameters:
	     *  1. INTEGER N
	     *  2. INTEGER K
	     */

	    public static int bitwiseAnd(int N, int K) {
	    // Write your code here
	    	 int finalResult = 0;
	         for(int i = 1; i < N ; i++){
	             for(int j = i+1; j <= N ; j++){
	                 int amp = i&j;
	                 if(amp < K && amp > finalResult)
	                     finalResult = amp;                    
	             } 
	         } 
	         System.out.println(finalResult);
	    	
	    	return finalResult;
	    }

	}

	public class Day29_bitwise {
	    public static void main(String[] args) throws IOException {
	        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int t = Integer.parseInt(bufferedReader.readLine().trim());

	        IntStream.range(0, t).forEach(tItr -> {
	            try {
	                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

	                int count = Integer.parseInt(firstMultipleInput[0]);

	                int lim = Integer.parseInt(firstMultipleInput[1]);

	                int res = Result.bitwiseAnd(count, lim);

	                bufferedWriter.write(String.valueOf(res));
	                bufferedWriter.newLine();
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });

	        bufferedReader.close();
	        bufferedWriter.close();
	    }
	}

