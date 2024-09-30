import java.util.Scanner;
public class Exercise_2_4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the driving distance
        System.out.print("Enter the driving distance: ");
        double distance = input.nextDouble();

        // Prompt the user to enter miles per gallon
        System.out.print("Enter miles per gallon: ");
        double mpg = input.nextDouble();

        // Prompt the user to enter price per gallon
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = input.nextDouble();

        // Calculate the cost of driving
        double gallonsUsed = distance / mpg;
        double costOfDriving = gallonsUsed * pricePerGallon;

        // Display the cost of driving
        System.out.printf("The cost of driving is $%.2f\n", costOfDriving);

    }
}
