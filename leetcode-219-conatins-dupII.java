//using brut force (2 pointer method) time complexcity O(n2)
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<=nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j] && Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;
    }
}
//using hashmaps timecomplexcity O(n)
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer>map=new HashMap<>();//create map 
         for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])&&i-map.get(nums[i])<=k)//do we have i in map eg i==3 num=1 we already have in map so 3-0 3<3 so return true
               return true;
            map.put(nums[i],i);//adds values to empty map
         }
         return false;
        
    }
}

/*
1 2 3 1
0 1 2 3

hashmap
1:0 , 2:1, 3:2, 
*/
