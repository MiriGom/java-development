package addints;
import java.util.Scanner;
public class add {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a;
        int b;

        System.out.println("Enter an integer :");
        a = s.nextInt();
        s.nextLine();
        System.out.println("Enter an integer :");
        b = s.nextInt();
        s.nextLine();
        int answer = a + b;
        System.out.println("Answer is " + answer);

    }
}
