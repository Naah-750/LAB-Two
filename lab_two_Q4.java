import java.util.Scanner ;
public class lab_two_Q4 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int[] x = new int [3];
        for(int i = 0  ; i < 3 ; i++  ) {
            System.out.println("insert num: ");
            x[i] = input.nextInt() ;
        }
        System.out.println((x[0] + x[1] + x[2]) / 3);
        System.out.println("thank u");
    }
}
