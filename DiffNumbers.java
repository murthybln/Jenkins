import java.util.Scanner;
public class DiffNumbers {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int firstInt = in.nextInt();
        System.out.print("Input 2nd integer: ");
        int secondInt = in.nextInt();


        System.out.printf("Difference of two integers: %d%n", firstInt - secondInt);
    }
}
