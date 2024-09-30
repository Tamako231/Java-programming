import java.util.Scanner;
public class ExerciseL2T13 {
    public static void main(String[] args) {
        // 假设员工的初始工资为某个值，这里我们假设为1000（可以根据实际情况调整）
        double salary = 1000.0;

        // 获取员工的得分
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入员工的得分（0-100）：");
        int score = scanner.nextInt();
        scanner.close();

        // 根据得分计算新的工资
        if (score >= 90) {
            salary *= 1.03; // 工资增加3%
        } else {
            salary *= 1.01; // 工资增加1%
        }

        // 打印新的工资
        System.out.printf("员工的新工资为：%.2f\n", salary);
    }
}
