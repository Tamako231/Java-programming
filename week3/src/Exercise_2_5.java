import java.util.Scanner;
public class Exercise_2_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入边长
        System.out.print("Enter the length of the side: ");
        double sideLength = scanner.nextDouble();

        // 计算六边形的面积
        double area = (3 * Math.sqrt(3) / 2) * Math.pow(sideLength, 2);

        // 输出结果
        System.out.println("The area of the hexagon is " + area);

        // 关闭scanner对象
        scanner.close();
    }
}
