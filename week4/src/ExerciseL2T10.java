import java.util.Scanner;
public class ExerciseL2T10 {
    public static void main(String[] args) {
        // 创建一个Scanner对象来读取用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入每月储蓄金额
        System.out.print("Enter the monthly saving amount: ");
        double monthlySaving = scanner.nextDouble();

        // 定义月利率（这里假设为5%，即0.05/12，但题目未给出具体利率，这里仅作为示例）
        // 注意：实际利率应根据题目要求或实际情况设定
        final double MONTHLY_INTEREST_RATE = 0.05 / 12;

        // 初始化账户价值为0
        double accountValue = 0.0;

        // 循环计算六个月的账户价值
        for (int month = 1; month <= 6; month++) {
            // 每月账户价值增加储蓄金额和上月账户价值的利息
            accountValue = (accountValue + monthlySaving) * (1 + MONTHLY_INTEREST_RATE);
        }

        // 显示第六个月后的账户价值
        System.out.printf("After the sixth month, the account value is $%.2f%n", accountValue);

        // 关闭Scanner对象
        scanner.close();
    }
}
