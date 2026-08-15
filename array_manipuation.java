/*
House Problem
there are n houses bui8ld in a line,each of which  conatains some value in it
a thief is going to steal the maximal value of these houses but he cannt steal in 2 adjacent houses because the owner of the stolen houses will tell his two neighbours left and right side
what is the maximum stolen value?
sample input val[]={6,7,1,3,8,2,5}
6+1+8+5
8+7+5
sample output:20

sample 2:- 5,99,199,98,1=99+98=197
sample 3:-2,9,1,8,3,7,4,10=9+8+7+10=34
sample 4:-6,1,2,9,3,8,4,16=6+9+8+16=39

leetcode:-198
*/
class Solution {
    static int maxTheft(int[] nums,int index){
        if(index>=nums.length)
          return 0;
        int rob=nums[index]+maxTheft(nums,index +2);
        int skip=maxTheft(nums,index+1);
        return Math.max(rob,skip);
    }
    public int rob(int[] nums) {
        return maxTheft(nums,0);
    }
}
