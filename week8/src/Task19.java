public class Task19 {
    public static void main(String[] args) {
        printMax(1,3,5,7);
        printMax(new double[]{1,3,5,7});
    }
    public static void printMax(double...numbers) {
        if (numbers.length == 0) {
            System.out.println("No numbers");
            return;
        }
        double max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Max:"+max);

    }
}
