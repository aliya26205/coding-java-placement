import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < str.length(); i++) {
            // Pattern 010101...
            if(i % 2 == 0) {
                if(str.charAt(i) != '0')
                    count1++;
            }
            else {
                if(str.charAt(i) != '1')
                    count1++;
            }
            // Pattern 101010...
            if(i % 2 == 0) {
                if(str.charAt(i) != '1')
                    count2++;
            }
            else {
                if(str.charAt(i) != '0')
                    count2++;
            }
        }
        System.out.println(Math.min(count1, count2));
    }
}

//output:- 0001010111
//2
