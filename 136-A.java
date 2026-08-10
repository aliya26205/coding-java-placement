import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int friends[]=new int[n+1];
        for(int i=1;i<=n;i++)
          friends[sc.nextInt()]=i;
        for(int i=1;i<=n;i++)
          System.out.print(friends[i]+" ");
    }
}
