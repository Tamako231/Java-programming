import java.util.Scanner;
public class ExerciseL2T7 {
    public static void main(String[] args) {
        // 创建一个Scanner对象来读取用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入行驶距离
        System.out.print("Enter the driving distance: ");
        double distance = scanner.nextDouble();

        // 提示用户输入每加仑燃油效率
        System.out.print("Enter miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();

        // 提示用户输入每加仑价格
        System.out.print("Enter price per gallon: ");
        double pricePerGallon = scanner.nextDouble();

        // 计算所需的加仑数
        double gallonsNeeded = distance / milesPerGallon;

        // 计算总成本
        double totalCost = gallonsNeeded * pricePerGallon;

        // 显示总成本
        System.out.printf("The cost of driving is $%.2f%n", totalCost);

        // 关闭Scanner对象
        scanner.close();
    }
}
