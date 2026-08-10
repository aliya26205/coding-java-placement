//An elephant decided to visit his friend. It turned out that the elephant's house is located at point 0 and his friend's house is located at point x(x > 0) of the coordinate line. In one step the elephant can move 1, 2, 3, 4 or 5 positions forward. Determine, what is the minimum number of steps he need to make in order to get to his friend's house.

import java.util.*;
class Main {
    public static void main(String[] args) {
        int n=0;
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the friends address: ");
        n=sc.nextInt();
        System.out.println((n+4)/5);
    }
}
