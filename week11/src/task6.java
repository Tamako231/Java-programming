import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        int [][ ]matrix = new int[3][3];

        Scanner input = new Scanner(System.in);
        System.out.println("Enter values in "+matrix.length+" rows and "+matrix[0].length+" columns");
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                matrix[row][column] = (int)(Math.random()*20);
            }
        }

        int maxOfRow =0;
        int indexofMaxRow = 0;
        for (int column = 0; column < matrix[0].length; column++) {
            maxOfRow += matrix[0][column];
        }
        int totleOfThisRow = 0;
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                totleOfThisRow += matrix[row][column];
            }
            if (totleOfThisRow > maxOfRow) {
                maxOfRow = totleOfThisRow;
                indexofMaxRow = row;
            }
        }
        System.out.println(maxOfRow);
        input.close();
    }
}
