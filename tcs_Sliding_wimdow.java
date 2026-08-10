// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static int findMax(int arr[],int start,int end){
        int max=arr[start];
        for(int i=start;i<=end;i++)
          if(arr[i]>max)
             max=arr[i];
        return max;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       //to take values into array when u dont know the size 2 methods are there
       /* 1.
       String data[]=sc.nextLine().split(" ");
       int arr[]=new int[data.lenght];
       for(int i=0;i<data.length;i++)
          arr[i]=Integer.parseInt(data[i]);
          2.*/
        int arr2[]=Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int k=sc.nextInt();
        int result[]=new int[arr2.length-k+1];
        for(int i=0,p=0;i<arr2.length-k+1;i++){
            result[p++]=findMax(arr2,i,i+k-1);
        }
        for(int ele:result)
           System.out.print(ele+" ");
    }
}
