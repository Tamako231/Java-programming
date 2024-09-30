import java.util.Scanner;
public class ExerciseL2T5 {
    public static void main(String[] args) {
        // 创建一个Scanner对象以读取用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入总金额
        System.out.print("请输入总金额: ");
        double totalAmount = scanner.nextDouble();

        // 提示用户输入小费率（这里用户输入的是百分比前的数字，如10或15）
        System.out.print("请输入小费率（10或15）: ");
        int tipRateInput = scanner.nextInt();

        // 根据特殊规则计算实际的小费率
        double actualTipRate;
        if (tipRateInput == 10) {
            actualTipRate = 0.15; // 10%的小费率对应15%的小费
        } else if (tipRateInput == 15) {
            actualTipRate = 0.20; // 15%的小费率对应20%的小费
        } else {
            // 如果输入的不是10或15，则输出错误信息并退出程序
            System.out.println("错误：小费率只能是10或15。");
            scanner.close();
            return;
        }

        // 计算小费
        double tipAmount = totalAmount * actualTipRate;

        // 计算总金额（含小费）
        double totalWithTip = totalAmount + tipAmount;

        // 输出结果
        System.out.printf("小费是: %.2f%n", tipAmount);
        System.out.printf("总金额（含小费）是: %.2f%n", totalWithTip);

        // 关闭Scanner对象
        scanner.close();
    }
}
