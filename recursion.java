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
          fun(n-1);
        }
    }

    public static void main(String[] args) {
        fun(5);
    }
}
