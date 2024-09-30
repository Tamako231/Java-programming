import java.util.Scanner;
public class Exercise_2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 提示用户输入子总额和小费率
        System.out.print("Enter the subtotal and a gratuity rate: ");
        double subtotal = input.nextDouble();
        double gratuityRate = input.nextDouble();

        // 计算小费和总金额
        double gratuity = subtotal * (gratuityRate / 100);
        double total = subtotal + gratuity;

        // 输出结果
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);
    }
}
