// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente the n and t:");
        int n=sc.nextInt();
        int t=sc.nextInt();
        System.out.println("Ente the String B OR G:");
        String s=sc.next();
        while(t-->0){
            for(int i=0;i<s.length()-1;i++){
                if(s.charAt(i)=='B' && s.charAt(i+1)=='G'){
                    s=s.substring(0,i)+"GB"+s.substring(i+2);
                    i++;
                }
            }
        }
        System.out.println(s);
    }
}
