import java.util.Scanner;
public class ExerciseL2T15 {
    public static void main(String[] args) {
        // 创建一个Scanner对象以获取用户输入
        Scanner scanner = new Scanner(System.in);

        // 提示用户输入一个整数
        System.out.print("请输入一个整数：");
        int number = scanner.nextInt();

        // 检查数字是否能被2或3整除
        boolean divisibleBy2Or3 = (number % 2 == 0) || (number % 3 == 0);

        // 检查数字是否既能被2整除又能被3整除（即被6整除）
        boolean divisibleBy6 = (number % 6 == 0);

        // 输出结果
        System.out.println("该数字能被2或3整除吗？ " + (divisibleBy2Or3 ? "是" : "否"));

        // 注意：这里的条件描述有些混淆，我假设您想要检查的是“数字能被2或3整除，但不能同时被2和3整除”
        // 这实际上意味着数字应该能被2或3整除，但不能被6整除（因为6是2和3的最小公倍数）
        System.out.println("该数字能被2或3整除，但不能同时被2和3整除吗？ " +
                (divisibleBy2Or3 && !divisibleBy6 ? "是" : "否"));

        // 另一个条件是“该数字不是同时被2和3整除”，这实际上与上面的条件相反（即检查是否能被6整除的否定）
        System.out.println("该数字不是同时被2和3整除吗？ " + (!divisibleBy6 ? "是" : "否"));

        // 关闭Scanner对象
        scanner.close();
    }
}
