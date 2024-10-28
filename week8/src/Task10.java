import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        String[] months={"January","February","March","July","May","June ","August","September","October","November","Decemeber"};
        System.out.print("Enter a month number(1 to 12):");
        Scanner input =new Scanner(System.in);
        int monthNumber =input.nextInt();
        System.out.println("The month is " + months[monthNumber-1]);
        input.close();
    }
}
