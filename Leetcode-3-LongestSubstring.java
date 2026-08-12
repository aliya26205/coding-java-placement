class Solution {
    public int lengthOfLongestSubstring(String s) {
        // for(int i=0;i<s.length();i++){
        //      for(int j=i;j<=s.length();j++){
        //         String k=s.substring(i,j);   
        //     }
        // }\
        int max = 0;
       for(int i = 0; i < s.length(); i++) {
             for(int j = i; j <= s.length(); j++) {
                 String k = s.substring(i, j);
                 boolean duplicate = false;
                 for(int x = 0; x < k.length(); x++) {
                      for(int y = x + 1; y < k.length(); y++) {
                         if(k.charAt(x) == k.charAt(y)) {
                             duplicate = true;
                             break;
                           }
                        }
                        if(duplicate) {
                            break;
                        }
                    }
                    if(!duplicate && k.length() > max) {
                          max = k.length();
                     }
                }
            }
        return max;
    }
}

//sirs solution:-class Solution {
    public boolean noDup(String s,int start,int end){
        boolean exisitChar[]=new boolean[128];
        for(int i=start;i<=end;i++){
            char ch=s.charAt(i);
            if(exisitChar[ch])
               return false;
            exisitChar[ch]=true;
        }
        return true;
    }
    public int lengthOfLongestSubstring(String s) {
        int max=0;
        for(int i=0;i<s.length();i++){
             for(int j=i;j<s.length();j++){
                if(noDup(s,i,j))
                   max=Math.max(max,j-i+1);
            }
        }
        return max;
    }
}
