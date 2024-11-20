import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        int[][] m = getarray();
        System.out.println(sum(m));
    }


    public static int[][] getarray() {
        Scanner input = new Scanner(System.in);

        int[][]m=new int[3][4];
        System.out.println("Enter 3 rows and 4 columns");
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j]=input.nextInt();
            }
        }
        return m;
    }

    public static int sum(int[][] m) {
        int sum=0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                sum+=m[i][j];
            }
        }
        return sum;
    }
}
