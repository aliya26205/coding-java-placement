/*
you are given N disks on sourse rod 
move all diska to destination rod using one auxiliary rod following rules:
->move only 1 disk at a time
->never place a bigger disk  on smaller one

idea
->move n-1 disks from source->helper
->move largest disk source->destination
3.move n-1 disks helper-> destination

*/
import java.util.*;
class Main {
    public static void towerOfHanoi(int n,char source,char helper,char dest){
        if(n==0)
          return;
        towerOfHanoi(n-1,source,dest,helper);
        System.out.println("Move disk "+n+" from "+source+" to "+dest);
        towerOfHanoi(n-1,helper,source,dest);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int disks=sc.nextInt();
        towerOfHanoi(disks,'s','H','D');
    }
}

OUTPUT:
3
Move disk 1 from s to D
Move disk 2 from s to H
Move disk 1 from D to H
Move disk 3 from s to D
Move disk 1 from H to s
Move disk 2 from H to D
Move disk 1 from s to D
