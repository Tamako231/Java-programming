import java.util.Scanner;

public class L6T3 {
    public static void main(String[] args) {
        // 生成一个0到100之间的随机数
        int number = (int) (Math.random() * 101);
        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        int guess = -1;
        while (guess != number) {
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();

            if (guess == number) {
                System.out.println("Yes, the number is " + number);
            } else if (guess > number) {
                System.out.println("Your guess is too high");
            } else {
                System.out.println("Your guess is too low");
            }
        }
    }
}