import java.util.Scanner ;
public class lab_two_Q3 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("insert the height : \n ");
        int x = input.nextInt();
        System.out.println("insert the width : \n ");
        int y = input.nextInt() ;
        System.out.println("the perimeter =  \n "  + 2 * (x+y));
        System.out.println("\n the Area =  \n " + x*y );
        System.out.println("thank u");
    }
}