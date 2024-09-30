
public class ExerciseL2T22 {
    public static void main(String[] args) {
        // 初始化变量x和a
        int x = 1; // x的初始值设为1
        int a = 3; // 假设a的值为3，用于测试switch语句

        // 使用switch语句根据a的值来更新x
        switch (a) {
            case 1:
                x += 5; // 如果a等于1，x增加5
                break;
            case 2:
                x += 10; // 如果a等于2，x增加10
                break;
            case 3:
                x += 16; // 如果a等于3，x增加16
                break;
            case 4:
                x += 34; // 如果a等于4，x增加34
                break;

        }

        System.out.println("执行switch语句后，x的值为: " + x);
    }
}
