import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        double[] mylist=new double[5];

        Scanner input=new Scanner(System.in);
        System.out.println("Enter"+mylist.length+"Values");
        for (int i = 0; i < mylist.length; i++) {
            mylist[i]=(Math.random()*10);
        }
        for (double i : mylist) {
            System.out.println(i);
        }
        input.close();
    }
}