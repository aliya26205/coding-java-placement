// Given an integer n, count how many prime numbers ≤ n can be represented as the sum of consecutive prime numbers starting from 2.
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
       List<Integer>primeList=new ArrayList<Integer>();
       for(int i=2;i<=n;i++)
          if(isprime(i))
            primeList.add(i);
        int sum=2,count=0;
        for(int num:primeList.subList(1,primeList.size())){
            sum+=num;
            if(sum<=n && isprime(sum))
               count++;
        }
       System.out.println(count);
    }
}
