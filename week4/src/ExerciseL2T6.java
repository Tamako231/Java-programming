import java.util.Scanner;
public class ExerciseL2T6 {
    public static void main(String[] args) {
        // 创建一个Scanner对象来读取用户输入
        Scanner scanner = new Scanner(System.in);

        // 定义磅到千克和英寸到米的转换率
        final double POUNDS_TO_KILOGRAMS = 0.45359237;
        final double INCHES_TO_METERS = 0.0254;

        // 提示用户输入体重（磅）
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // 提示用户输入身高（英寸）
        System.out.print("Enter height in inches: ");
        double heightInInches = scanner.nextDouble();

        // 将体重转换为千克
        double weightInKilograms = weightInPounds * POUNDS_TO_KILOGRAMS;

        // 将身高转换为米
        double heightInMeters = heightInInches * INCHES_TO_METERS;

        // 计算BMI值
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // 显示BMI值
        System.out.printf("BMI is %.4f%n", bmi);

        // 关闭Scanner对象
        scanner.close();
    }
}
