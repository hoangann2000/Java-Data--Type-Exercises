import java.util.Scanner;
public class Ex3 {
	public static void main(String[] String) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number between 0 - 1000");
		int num= input.nextInt();
		int sum=0; 
		while(num!=0) {
		sum+=num%10;
		num/=10;
		} 
		System.out.println(sum);
	}
}
