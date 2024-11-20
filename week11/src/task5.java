import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        int [][ ]matrix = new int[3][3];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter values in "+matrix.length+" rows and "+matrix[0].length+" columns");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)(Math.random()*20);
            }
        }

        int totle = 0;

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                totle += matrix[row][column];
            }
        }
        System.out.println("Total number of rows: "+totle);

        input.close();
    }
}
