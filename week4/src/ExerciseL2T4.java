import java.util.Scanner;
public class ExerciseL2T4 {
    public static void main(String[] args) {
        // 创建一个Scanner对象，用于从控制台读取用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入圆柱体的半径
        System.out.print("请输入圆柱体的半径: ");
        double radius = scanner.nextDouble();

        // 提示用户输入圆柱体的高度
        System.out.print("请输入圆柱体的高度: ");
        double height = scanner.nextDouble();

        // 计算圆柱体的体积（公式：πr²h）
        double volume = Math.PI * Math.pow(radius, 2) * height;

        // 输出圆柱体的体积
        System.out.printf("圆柱体的体积是: %.2f%n", volume);

        // 关闭Scanner对象
        scanner.close();
    }
}
