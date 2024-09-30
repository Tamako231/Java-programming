
public class ExerciseL2T16 {
    // 方法：检查年份是否为闰年
    public static boolean isLeapYear(int year) {
        // 闰年的条件是：能被4整除但不能被100整除，或者能被400整除
        boolean leapYearCheck = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        return leapYearCheck;
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
