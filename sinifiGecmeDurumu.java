package patikadev;
import java.util.Scanner;
public class sinifiGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math,turkish,history,chemistry,physics;
        double avrg;

        System.out.print("enter your math note:");
        math = input.nextInt();
        System.out.print("enter your turkish  note:");
        turkish = input.nextInt();
        System.out.print("enter your chemistry math note:");
        chemistry = input.nextInt();
        System.out.print("enter your physics note:");
        physics = input.nextInt();
        System.out.print("enter your history note:");
        history = input.nextInt();
        avrg = (math + turkish + chemistry + physics + history) / 5;
        System.out.println("your average is:"+avrg);
        if ((avrg > 55) && (avrg <= 100)){
            System.out.println("you passed!");
        }if ((avrg > 0) && (avrg <= 55)){
            System.out.println("you failed!");
        }else
            System.out.println("Error!! Your average must be between 100 and 0!");


        {


        }
    }
}
