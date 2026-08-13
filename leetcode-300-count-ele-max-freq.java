class Solution {
    public int maxFrequencyElements(int[] nums) {
 
    
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int num:nums){
        if(map.containsKey(num))
          map.put(num,map.get(num)+1);
        else
            map.put(num,1);
    }
    int maxCount=0,result=0;
    for(int count:map.values()){
        if(maxCount<count){
            maxCount=count;
            result=count;
        }else if(count == maxCount){
            result+=count;
        }
    }
    return result;
    }
}
