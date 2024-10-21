public class L7T5 {

    public static void nPrintln(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }

    public static void nPrintIn(String message, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(message);
        }
    }

    public static void printWelcomeFiveTimes() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Welcome to Java");
        }
    }

    public static void main(String[] args) {

        nPrintln("Hello, World!", 3);

        nPrintIn("Welcome to Java", 4);

        printWelcomeFiveTimes();
    }
}