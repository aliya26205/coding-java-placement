// with normal recursion
import java.util.*;
class Main {
    public static int fibo(int n){
         if (n == 0) {
            return 0;
        }
        if(n==1)
          return 1;
        return (fibo(n-1)+fibo(n-2));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(fibo(n));
    }
}
// with dynamic program method(dp)(memoizing)
//2 method in dp tabulation,memization
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        long dp[]=new long[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
    }
}
