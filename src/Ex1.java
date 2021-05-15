import java.util.Scanner;
public class Ex1 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a degree in Fahrenheit: ");
        double F = input.nextDouble();

        double  C =(( 5 *(F - 32.0)) / 9.0);
        System.out.println(F + " degree Fahrenheit is equal to " + C + " in Celsius");
    }
}
