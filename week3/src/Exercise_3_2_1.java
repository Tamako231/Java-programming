import java.util.Random;
import java.util.Scanner;

public class Exercise_3_2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a two-digit lottery number
        int lotteryNumber = generateLotteryNumber(random);

        System.out.println("Enter your lottery pick (two digits): ");
        int userPick = scanner.nextInt();

        // Determine the award based on the rules
        String result = determineAward(lotteryNumber, userPick);

        System.out.println(result);
    }

    private static int generateLotteryNumber(Random random) {
        return 10 + random.nextInt(90); // Generates a number between 10 and 99
    }

    private static String determineAward(int lotteryNumber, int userPick) {
        if (lotteryNumber == userPick) {
            return "Exact match: you win $10,000";
        } else if ((lotteryNumber / 10 == userPick % 10 || lotteryNumber % 10 == userPick / 10)) {
            return "Match all digits: you win $3,000";
        } else if ((lotteryNumber / 10 == userPick / 10 && lotteryNumber % 10 != userPick % 10)
                || (lotteryNumber % 10 == userPick % 10 && lotteryNumber / 10 != userPick / 10)) {
            return "One digit matches: you win $1,000";
        } else {
            return "No match: try again!";
        }
    }
}
