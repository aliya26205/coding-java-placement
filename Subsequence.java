// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
class Main {
     static void subsequence(String s, int index, String current) {
        if(index == s.length()) {
            System.out.print(current+" ");
            return;
        }
        // Take the character
        subsequence(s, index + 1, current + s.charAt(index));
        // Don't take the character
        subsequence(s, index + 1, current);
    }
    public static void main(String[] args) {
         String s = "abc";
         System.out.println("SubString:");
          for(int i=0;i<s.length();i++){
               for(int j=i;j<=s.length();j++){
                 String k=s.substring(i,j);
                 System.out.print(k+" ");
                }
            }
         System.out.println("\nSubSequence");
         subsequence(s, 0, "");

    }
}
/*output:
SubString:
 a ab abc  b bc  c 
SubSequence
abc ab ac a bc b c  
=== Code Execution Successful ===*/
