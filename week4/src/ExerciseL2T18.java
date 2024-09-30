
public class ExerciseL2T18 {
    // 方法：检查年份是否为闰年
    public static boolean isLeapYear(int year) {
        // 组合布尔表达式来检查是否为闰年
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        return isLeapYear;
    }

    public static void main(String[] args) {
        // 测试年份
        int[] testYears = {1900, 2000, 2020, 2021, 2100, 2400};

        // 遍历测试年份并打印结果
        for (int year : testYears) {
            System.out.println("年份 " + year + " 是闰年吗？ " + (isLeapYear(year) ? "是" : "否"));
        }
    }
}
