public class Test {
    public static void Test1(int a){
        a++;
        System.out.println(a);
    }

    public static void main(String[] args) {
        int a =0;
        int b=2;
        int[] arr={1,3,7};
        for (int i=0 ; i<10;i++){
            a++;
            b++;
            Test1(a);
            Test1(b);
        }
    }
}
