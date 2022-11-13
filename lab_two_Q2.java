    import java.util.Scanner ;
    public class lab_two_Q2 {
        public static void main (String[] args)
        {
            Scanner input = new Scanner(System.in) ;
            System.out.println("insert the diameter : \n ");
            int x = input.nextInt() ;
            System.out.println("perimeter =  \n "  + (3.14 * x));
            System.out.println("\n Area =  \n "  + (3.14 * ((x/2) * (x/2))));
            System.out.println("thank u");
        }
    }
