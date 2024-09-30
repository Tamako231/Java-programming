import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise_2_6 {
    public static void main(String[] args) {
        BigDecimal monthlyDeposit = new BigDecimal("100");
        BigDecimal annualInterestRate = new BigDecimal("0.05").divide(new BigDecimal("12"), 4, RoundingMode.HALF_UP);

        for (int month = 1; month <= 3; month++) {
            BigDecimal accountValue = calculateAccountValue(monthlyDeposit, annualInterestRate, month);
            System.out.println("After the " + month + " month, the value in the account becomes: $" + accountValue.setScale(3, RoundingMode.HALF_UP));
        }
    }

    private static BigDecimal calculateAccountValue(BigDecimal monthlyDeposit, BigDecimal interestRate, int month) {
        BigDecimal totalAmount = new BigDecimal("0");

        for (int i = 1; i <= month; i++) {
            if (i == 1) {
                totalAmount = monthlyDeposit.multiply(new BigDecimal("1").add(interestRate));
            } else {
                totalAmount = totalAmount.add(monthlyDeposit).multiply(new BigDecimal("1").add(interestRate));
            }
        }

        return totalAmount;
    }
}
