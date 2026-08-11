/*Count Trailing Zeroes in Factorial
Given a non-negative integer n, find the number of trailing zeroes in n! (n factorial).
A trailing zero is a zero at the end of a number.
Recall:
n! = n × (n-1) × (n-2) × ... × 2 × 1
Example 1
Input:
5
Output:
1*/
import java.util.*;
class Main {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int deno=5,trailZeroCount=0;
       while(deno<=n){
         trailZeroCount+=n/deno;
         deno*=5;
       }
       System.out.println(trailZeroCount);
    }
}
