import java.util.Scanner;

public class Exercise_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius and length of a cylinder (separated by space): ");
        double radius = scanner.nextDouble();
        double length = scanner.nextDouble();

        double area = Math.PI * radius * radius;
        double volume = area * length;

        System.out.printf("The area is %.4f\n", area);
        System.out.printf("The volume is %.1f\n", volume);
    }
}
