import java.util.Random;
import java.util.Scanner;

public class ExerciseL2T19 {
    public static void main(String[] args) {
        // 创建一个随机数生成器
        Random random = new Random();

        // 随机生成两个单个数字
        int number1 = random.nextInt(10); // 生成0到9之间的随机数
        int number2 = random.nextInt(10); // 生成0到9之间的随机数

        // 显示问题给学生
        System.out.println("What is " + number1 + " + " + number2 + "?");

        // 创建一个扫描器来读取学生的答案
        Scanner scanner = new Scanner(System.in);

        // 获取学生的答案
        System.out.print("Your answer: ");
        int studentAnswer = scanner.nextInt();

        // 计算正确答案
        int correctAnswer = number1 + number2;

        // 显示消息来指示学生的答案是否正确
        if (studentAnswer == correctAnswer) {
            System.out.println("Your answer is true!");
        } else {
            System.out.println("Your answer is false. The correct answer is " + correctAnswer + ".");
        }

        // 关闭扫描器
        scanner.close();
    }
}
