class Main {
    public static void main(String[] args) {
       String s="abc";
    //    for(int i=0;i<s.length();i++){
    //      char ch=s.charAt(i);
    //      System.out.print(ch+" ");
    //    }
    for(int i=0;i<s.length();i++){
        for(int j=i;j<=s.length();j++){
            String k=s.substring(i,j);
            System.out.print(k+" ");
        }
    }
    }
}
/*op:
 a ab abc  b bc  c 
=== Code Execution Successful ===*/
