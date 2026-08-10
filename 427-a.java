import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente the n size:");
        int n=sc.nextInt();
        int untreated=0,availablepolice=0;
        int event;
        for(int i=1;i<=n;i++){
            event=sc.nextInt();
            if(event>0){
                availablepolice+=event;
            }
            else{
                if(availablepolice>0)
                   availablepolice--;
                else
                  untreated++;
            }
        }
      System.out.println(untreated);
    }
}

//using arrays
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Ente the n size:");
        int n=sc.nextInt();
        int untreated=0,availablepolice=0;
        int[] event = new int[100];
       
        int count=n;
        System.out.println("Enter n elements:");
        for(int i=1;i<=n;i++){
            event[i] = sc.nextInt();
           
            if(event[i]>0){
                availablepolice+=event[i];
            }
            else{
                if(availablepolice>0)
                   availablepolice--;
                else
                  untreated++;
            }
        }
      System.out.println(untreated);
    }
}
