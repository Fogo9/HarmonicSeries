import java.util.Scanner;

public class harmonicseries{
    public static void main(String[] args) {

            int n;

            double result;

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter The Number : ");

            n = scan.nextInt();

            result = 0.0;

            for(int i = 1; i <= n; i++){

                result += (1.0/i);

            }

            System.out.println("Harmonic series : " + result);

    }
}
