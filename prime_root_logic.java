// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static boolean isprime(int n){
        if (n<2){
            return false;
        }
        for(int i=2;i*i<=n;i++){
             if(n % i == 0)
                 return false;
        }
          return true;
    }

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       boolean result= isprime(n);
       System.out.println(result);
    }
}
