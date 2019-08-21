package hackerrank;

/*
John works at a clothing store. He has a large pile of socks that he must pair by color for sale. Given an array of integers representing the color of each sock, determine how many pairs of socks with matching colors there are.
For example, there are  socks with colors . There is one pair of color  and one of color . There are three odd socks left, one of each color. The number of pairs is .
Function Description
Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.
sockMerchant has the following parameter(s):
n: the number of socks in the pile
ar: the colors of each sock
Input Format
The first line contains an integer , the number of socks represented in . 
The second line contains  space-separated integers describing the colors  of the socks in the pile.
Constraints
 where 
Output Format
Return the total number of matching pairs of socks that John can sell.
Sample Input
9
10 20 20 10 10 30 50 10 20
Sample Output
3
 */

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

public class SockMerchant {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
//        int numOfPairs = 0;
//        List<Integer> arNew = new ArrayList<Integer>();
//        int j=0;
//        if (n == 0 && n == 1 && n == -n)
//            return 0;
//        else if (n == 2 && ar[j] == ar[j+1])
//            return 1;
//        else {
//            for (int i = 0; i < n-1; i++) {  
//                if(!arNew.contains(ar[i])) {
//                    arNew.add(ar[i]);         
//                    for (int k = i+1; k < n; k++) {
//                        if (ar[i] == ar[k])
//                            arNew.add(ar[i]); 
//                        if (arNew.size() % 2 == 0 && ar[i] == ar[k])
//                            numOfPairs++;
//                        if (arNew.size() % 2 == 1 && ar[i] == ar[k])
//                        	numOfPairs++;
//                     }   
//                }
//            }
//        }
//        return numOfPairs;
    	        int numOfPairs = 0;
    	        int count = 1;
    	        Arrays.sort(ar);
    	        for (int i = 0; i < ar.length-1;i++) {             
    	            if (ar[i] == ar[i+1]) {
    	               count++; 
    	            } else {
    	            	numOfPairs = numOfPairs + count/2;
    	                count = 1; 
    	            }
    	        }
    	        return numOfPairs = numOfPairs + count/2;
    }
   // private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int n = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        int[] ar = new int[n];
//
//        String[] arItems = scanner.nextLine().split(" ");
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//
//        for (int i = 0; i < n; i++) {
//            int arItem = Integer.parseInt(arItems[i]);
//            ar[i] = arItem;
//        }
        
        String s = "Sandeep";
        IntStream intStream = s.chars();
        System.out.println(intStream);

//        int result = sockMerchant(n, ar);
//        scanner.close();
//        System.out.println("Result is:" + result);
    }
}
