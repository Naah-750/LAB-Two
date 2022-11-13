import java.util.Scanner;
public class lab_two_Q7 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("insert num: ");
        double x = input.nextInt();
        System.out.println("the square number = " + (x*x));
        System.out.println("the cube number = " + (x*x*x));
        System.out.println("the Forth number = " + Math.pow(x,4));
        System.out.println("thank u");
    }
}