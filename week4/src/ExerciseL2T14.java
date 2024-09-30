import java.util.Scanner;
public class ExerciseL2T14 {
    public static void main(String[] args) {
        // 创建一个Scanner对象来读取用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入体重（磅）
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();

        // 提示用户输入身高（英寸）
        System.out.print("Enter height in inches: ");
        double heightInInches = scanner.nextDouble();

        // 将磅转换为千克
        double weightInKilograms = weightInPounds * 0.45359237;

        // 将英寸转换为米
        double heightInMeters = heightInInches * 0.0254;

        // 计算BMI
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);

        // 格式化BMI结果，保留两位小数
        double formattedBmi = Math.round(bmi * 100.0) / 100.0;

        // 根据BMI值判断体重范围（这里仅作为示例，实际范围可能有所不同）
        String bmiCategory;
        if (bmi < 18.5) {
            bmiCategory = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            bmiCategory = "Normal";
        } else if (bmi >= 25 && bmi < 29.9) {
            bmiCategory = "Overweight";
        } else {
            bmiCategory = "Obesity";
        }

        // 显示BMI结果和体重范围
        System.out.printf("BMI is %.2f%n", formattedBmi);
        System.out.println(bmiCategory);

        // 关闭Scanner对象
        scanner.close();
    }
}
