import java.util.Scanner;
public class Ex2 {
		public static void main(String[] String) {
			Scanner input = new Scanner(System.in);
			
			System.out.print("Input a value for inch: ");
			double inch = input.nextDouble();
			double meters = inch * 0.0254;
			System.out.print(inch + " inch is " + meters + " meters");
		}
}
