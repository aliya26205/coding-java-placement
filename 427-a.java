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
