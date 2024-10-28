import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        double[] mylist=new double[5];

        Scanner input=new Scanner(System.in);
        System.out.println("Enter"+mylist.length+"Values");
        for (int i = 0; i < mylist.length; i++) {
            mylist[i]=(Math.random()*10);
        }

        double total=0;
        for (int i = 0; i < mylist.length; i++) {
            System.out.println(mylist[i]+"  ");
            total+=mylist[i];
        }

        System.out.println();
        System.out.println("Total: "+total);
    }
}