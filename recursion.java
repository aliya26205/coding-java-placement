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
