import java.util.Scanner;
public class Ex4 {
	public static void main(String[] String) {
		Scanner input = new Scanner(System.in);
		
		double  minutesInYear = 60 * 24 * 365;
		System.out.print("Input the number of minutes: ");
		double min = input.nextDouble();
		
		long years = (long) (min/minutesInYear);
		int days = (int) (min/60/24)%365;
		
		System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
	}
}
