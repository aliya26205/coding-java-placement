class Main {
    public static void main(String[] args) {
        int m=10,n=5;
        int res=n++ +m*m++ -5;//5+10*10-5;
        System.out.println(res);
    }
}
//output:-100

class Main {
    public static void main(String[] args) {
        int a=10;
        int res=a++ + a + ++a + a++;
        //      10+11+12+12
        System.out.println(res);
    }
}

//output:- 45
