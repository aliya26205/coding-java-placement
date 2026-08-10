class Main {
    public static void main(String[] args) {
        int a=10,b=10,c,d;
        c=a++;//post value op c=10,a=11
        d=++b;//pre op value b=11 d=11
        System.out.println(a+" "+b+" "+c+" "+d);
    }
}
