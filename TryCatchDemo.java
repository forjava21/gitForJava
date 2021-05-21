import java.util.Scanner;

public class TryCatchDemo {

	public static void main(String[] args) {
		System.out.println("enter first number");
		Scanner scan1 = new Scanner(System.in);
		int a = scan1.nextInt();
		System.out.println("enter second number");
		Scanner scan2 = new Scanner(System.in);
		int b = scan2.nextInt();
		try {
			System.out.println("divison of two number = " + a/b);
		
		}catch(Exception e) {
			System.out.println("can't divide number by zero");
		}finally {
			System.out.println("This will be executed any how"); 
			scan1.close();
			scan2.close();
			
		}
			
			
			
	}

}
