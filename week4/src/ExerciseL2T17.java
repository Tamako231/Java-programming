import java.util.Scanner;
public class ExerciseL2T17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 彩票号码（假设为固定值，实际使用时可以随机生成或从文件读取）
        int lotteryNumber = 34; // 此处仅为示例，实际值可能不同

        // 获取用户输入的两位数
        System.out.print("Enter your lottery pick (two digits): ");
        int userInput = scanner.nextInt();

        // 错误检查：如果输入的数字小于等于0，则输出"Sorry: no match"
        if (userInput <= 0 || userInput > 99) {
            System.out.println("Sorry: no match");
            return;
        }

        // 将两位数格式化为字符串，如果个位数为0，则前面补0
        String formattedNumber = String.format("%02d", userInput);

        // 将数字转换为八进制和十六进制字符串
        String octal = Integer.toOctalString(userInput);
        String hex = Integer.toHexString(userInput).toUpperCase();

        // 输出转换结果
        System.out.println("Decimal: " + userInput);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hex);

        // 彩票匹配游戏逻辑
        int userFirstDigit = Character.getNumericValue(formattedNumber.charAt(0));
        int userSecondDigit = Character.getNumericValue(formattedNumber.charAt(1));
        int lotteryFirstDigit = lotteryNumber / 10;
        int lotterySecondDigit = lotteryNumber % 10;

        if (userInput == lotteryNumber) {
            System.out.println("Exact match: you win $10,000");
        } else if (userFirstDigit == lotteryFirstDigit && userSecondDigit == lotterySecondDigit) {
            System.out.println("Match all digits: you win $3,000");
        } else if (userFirstDigit == lotteryFirstDigit || userFirstDigit == lotterySecondDigit ||
                userSecondDigit == lotteryFirstDigit || userSecondDigit == lotterySecondDigit) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry: no match");
        }

        scanner.close();
    }
}
