import java.util.Scanner;
public class ExerciseL2T11 {
    public static void main(String[] args) {
        // 创建一个Scanner对象来读取用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入购买金额
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        // 定义销售税率
        final double SALES_TAX_RATE = 0.06;

        // 计算销售税
        double salesTax = purchaseAmount * SALES_TAX_RATE;

        // 格式化销售税结果，保留两位小数
        double formattedSalesTax = Math.round(salesTax * 100.0) / 100.0;

        // 显示销售税结果
        System.out.printf("Sales tax is $%.2f%n", formattedSalesTax);

        // 关闭Scanner对象
        scanner.close();
    }
}
