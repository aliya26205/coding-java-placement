/*
1. permutations(string):- given a string print all permutatoions of the string using recursion
Approach 1:- 
a.fix one character permute the rest ,
b.pick one char , 
c.fix it at the current position ,
d.recursion permutation remaining characters 
input: str="abc"
output abc acb bac bca cab cba
*/


import java.util.*;
class Main {
    public static void permu(String prefix,String remain){
        if(remain.length()==0){
          System.out.println(prefix);
          return;
        }
        for(int i=0;i<remain.length();i++){
            char ch=remain.charAt(i);
            String nextRemain=remain.substring(0,i)+remain.substring(i+1);
            permu(prefix+ch,nextRemain);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        permu("",s);
    }
}
