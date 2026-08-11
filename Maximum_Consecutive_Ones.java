/*Maximum Consecutive Ones
Given a binary array nums, return the maximum number of consecutive 1s in the array.
A binary array contains only 0s and 1s.
Example 1
Input:
[1,1,0,1,1,1]
Output:3*/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = Arrays.stream(sc.nextLine().split(" "))
                  .mapToInt(Integer::parseInt)
                  .toArray();
        int count=0, maxc=0;
        for(int num: arr){
            if(num==1){
                count++;
                if(count>maxc)
                   maxc=count;
            }else
              count=0;
        }
        System.out.println(maxc);
    }
}
