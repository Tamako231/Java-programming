import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100];
        int countAboveAverage = 0;
        double sum = 0;
        double average;

        // 读取100个数字  
        System.out.println("请输入100个数字：");
        for (int i = 0; i < 100; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        // 计算平均值  
        average = sum / 100.0;

        // 计算大于平均值的数字的数量  
        for (int i = 0; i < 100; i++) {
            if (numbers[i] > average) {
                countAboveAverage++;
            }
        }

        // 输出结果  
        System.out.println("平均值是：" + average);
        System.out.println("大于平均值的数字的数量是：" + countAboveAverage);

        // 关闭扫描器  
        scanner.close();
    }
}