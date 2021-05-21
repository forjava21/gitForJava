import java.util.Scanner;

public class ScanMethod {

	public static void main(String[] args) {
		System.out.println("enter first number");
		Scanner scan1 = new Scanner(System.in);
		int a = scan1.nextInt();
		System.out.println("enter second number");
		Scanner scan2 = new Scanner(System.in);
		int b = scan2.nextInt();
		
		System.out.println(addition(a, b));
	}
	public static int addition(int a, int b) {
		int add = a + b;
		System.out.println("addition of two numbers:");
		return add;
	}

}
