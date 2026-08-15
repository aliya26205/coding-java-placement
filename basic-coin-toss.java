/*
Problem:-Given N,print all possible sequences of n coine tosses
Sample input:- 2
Sample output:-
HH
HT
TH
TT
eg 2:-
                         " "
                   H             T
               HH     HT       TH    TT
*/

import java.util.*;
class Main {
    public static void flipCoins(String tossed,int n){
        if(n<=0){
            System.out.println(tossed);
            return;
        }
        flipCoins(tossed+"H",n-1);
        flipCoins(tossed+"T",n-1);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        flipCoins("",n);
    }
}
