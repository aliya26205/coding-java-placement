//use hash algorithm and set methodn of java
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String str = sc.next();
        if (n<26){
            System.out.println("NO");
        }
        else{
             str = str.toLowerCase();
             HashSet<Character> set = new HashSet<>();
             for(int i = 0; i < str.length(); i++) {
                       set.add(str.charAt(i));
              }

              if(set.size() == 26)
                   System.out.println("YES");
              else
                   System.out.println("NO");
        }
    }
}
