/*
Recursion:- function calling itself 
types of recursion [6 types]
1.direct
2.indirect
3.head[no tail]
4.tail
5.linear
6.tree

base case:
1. adding 
2. sustracting
3. diving

recursion has call stack
*/

// program 1 :- to print 5 4 3 2 1 with recursion
class Main {
    public static void fun(int n){
        if(n<=0)
          return;
        else{
          System.out.print(n+" ");
          fun(n-1);//tail recursion
        }
    }

    public static void main(String[] args) {
        fun(5);
    }
}

//program 2:- to print 1 2 3 4 5 with recursion
class Main {
    public static void func(int n){
        if(n<=0)
          return;
        else{
            func(n-1);
            System.out.print(n);//N0-tail recursion  or head recursion
        }
    }
    public static void main(String[] args) {
        func(5);
    }
}

// program 3: print name using recursion
import java.util.*;
class Main {
    public static void printName(String name,int n){
        /*using loop
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            System.out.println(ch);
        }*/
        if(n<0)
          return;
        else{
            printName(name,n-1);
            char ch=name.charAt(n);
            System.out.println(ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        printName(s,n-1);
    }
}
