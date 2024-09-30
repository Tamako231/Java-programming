public class ExerciseL2T3 {
    public static void main(String[] args) {
        int today = 2; // 今天是星期二
        int daysLater = 100 % 7; // 100天后的星期偏移量
        int finalDay = (today + daysLater - 1) % 7 + 1; // 计算100天后的星期几（注意这里的-1和+1是为了确保结果在1-7之间）
        // 或者更简单地（由于我们已经知道today是2且daysLater是0-6，所以可以直接相加后%7+1）：
        // int finalDay = (today + daysLater) % 7 + 1; // 这与上面的计算等价，在这个特定情况下
        System.out.println("100天后是星期" + finalDay); // 输出结果
    }
}