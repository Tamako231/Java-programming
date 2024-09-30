import java.util.Scanner;
public class ExerciseL2T8 {
    public static void main(String[] args) {
        // 创建一个Scanner对象来读取用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入六边形的一条边长
        System.out.print("Enter the length of the side of a hexagon: ");
        double sideLength = scanner.nextDouble();

        // 计算六边形的面积（公式：(3 * sqrt(3)) / 2 * s^2，其中s是边长）
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(sideLength, 2);

        // 显示六边形的面积，保留四位小数
        System.out.printf("The area of the hexagon is %.4f%n", area);

        // 关闭Scanner对象
        scanner.close();
    }
}
