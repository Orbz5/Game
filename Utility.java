import java.text.DecimalFormat;
import java.util.Scanner;
import java.math.*;

public class Utility {
    private static Scanner in = new Scanner(System.in);
    private static final DecimalFormat decfor = new DecimalFormat("0.00");  

    // reading user input
    public static String readLine(String msg) {
        System.out.println(msg);
        return in.nextLine();
    }

    public static char readChar(String msg) {
        System.out.println(msg);
        return in.nextLine().charAt(0);
    }

    public static char readUpperChar(String msg) {
        System.out.println(msg);
        return in.nextLine().toUpperCase().charAt(0);
    }

    public static int readInt(String msg) {
        System.out.println(msg);
        int i = in.nextInt();
        in.nextLine();
        return i;
    }

    public static double readDouble(String msg) {
         System.out.println(msg);
        double d = in.nextDouble();
        in.nextLine();
        return d;
    }

    // formatting numbers
    public static double formatDecimals(double number){
        return Double.parseDouble(decfor.format(number));
    }

    public static int removeDecimals(double number){
        return (int) number;
    }

    public static double randomNumber(){
        double random = Math.random() * 50;
        return formatDecimals(random);
    }

    public static void main(String[] args) {
        System.out.println(randomNumber());
    }
}


