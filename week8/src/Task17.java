public class Task17 {
    public static void main(String[] args) {
        int[] a={1,2};

        System.out.println("Before invoking method");
        System.out.println("array is{"+a[0]+","+a[1]+"}");
        swap(a[0],a[1]);
        System.out.println("After invoking method");
        System.out.println("array is{"+a[0]+","+a[1]+"}");

        System.out.println("Before invoking swapFirstTwoInArray");
        System.out.println("array is{"+a[0]+","+a[1]+"}");
        swapFirstTwoInArray(a);
        System.out.println("After invoking swapFirstTwoInArray");
        System.out.println("array is{"+a[0]+","+a[1]+"}");
    }
    public static void swap(int n1, int n2) {
        int temp = n1;
        n1 = n2;
        n2 = temp;
    }
    public static void swapFirstTwoInArray(int[] n) {
        int temp = n[0];
        n[0] = n[1];
        n[1] = temp;
    }
}
