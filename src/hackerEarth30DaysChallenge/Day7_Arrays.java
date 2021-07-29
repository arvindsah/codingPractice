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


public class Day7_Arrays {
	// just print the array in reverse order

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());
        
        bufferedReader.close();
        
        //int[] array1=arr.toArray(int[]);
        Integer[] a=arr.toArray(new Integer[0]);
        for(int i=a.length-1;i>-1;i--) {
        	System.out.print(a[i] + " ");
        }
       
    }
}
