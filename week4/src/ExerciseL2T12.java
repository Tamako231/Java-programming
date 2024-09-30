import java.util.Scanner;
public class ExerciseL2T12 {
    public static void main(String[] args) {
        // 调用方法获取用户输入
        int number = getNumberFromUser();

        // 检查数字是否为5的倍数并打印结果
        if (number % 5 == 0) {
            System.out.println("HiFive");
        }

        if (number % 2 == 0) {
            System.out.println("HiEven");
        }
    }

    // 定义一个方法来获取用户输入的数字
    public static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        scanner.close();
        return number;
    }
}

