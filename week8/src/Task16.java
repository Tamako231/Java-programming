public class Task16 {
    public static void main(String[] args) {
        int x=1;
        int[]y=new int[10];
        System.out.println("Value of x before"+x);
        System.out.println("Value of y[0] before"+y[0]);

        test(x,y);
        System.out.println("Value of x after"+x);
        System.out.println("Value of y[0] after"+y[0]);

    }
    public static void test(int x,int[] y){
        x=2;
        y[0]=5;
    }
}
