
public class ExerciseL2T9 {
    public static void main(String[] args) {
        // 定义常量
        final double MONTHLY_DEPOSIT = 100.0; // 每月存入金额
        final double ANNUAL_RATE = 0.05; // 年化利率
        final double MONTHLY_RATE = ANNUAL_RATE / 12; // 月度利率
        final int MONTHS = 12; // 总月份数

        // 初始化账户价值
        double accountValue = 0.0;

        // 循环计算每个月的账户价值
        for (int month = 1; month <= MONTHS; month++) {
            // 如果是第一个月之前，没有存款，所以不需要加MONTHLY_DEPOSIT
            // 但从第二个月开始，需要加上上个月的账户价值和新存入的金额
            if (month == 1) {
                accountValue = MONTHLY_DEPOSIT * (1 + MONTHLY_RATE);
            } else {
                accountValue = (accountValue + MONTHLY_DEPOSIT) * (1 + MONTHLY_RATE);
            }

            // 打印每个月的账户价值（可选，用于调试或查看中间结果）
            // System.out.printf("After month %d, the account value is $%.3f%n", month, accountValue);
        }

        // 打印最终的账户价值
        System.out.printf("After %d months, the final account value is $%.3f%n", MONTHS, accountValue);

        // 计算年化收益率（这里简单理解为最终账户价值与初始存款总额的比例减去1）
        // 注意：这不是严格的年化收益率计算公式，因为年化收益率通常考虑复利效应并转化为年度比较基准
        // 但由于题目要求，且我们按月复利存款，这里可以这样简化计算
        double totalDeposits = MONTHLY_DEPOSIT * MONTHS; // 总存款金额
        double annualizedReturnRate = (accountValue / totalDeposits - 1) * 100; // 年化收益率（百分比）

        // 打印年化收益率
        System.out.printf("The annualized return rate is %.2f%%%n", annualizedReturnRate);
    }
}
