import java.util.Scanner;
public class Task22 {

    // 方法：找出数组中的最小元素
    public static double min(double[] array) {

        double minValue = array[0]; // 将第一个元素设为最小值

        // 遍历数组，找出更小的元素
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i]; // 更新最小值
            }
        }

        return minValue; // 返回最小值
    }

    // 主方法：测试min方法
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextDouble();
        }

        // 调用min方法并输出结果
        double minValue = min(numbers);
        System.out.println("min number is " + minValue);
    }
}