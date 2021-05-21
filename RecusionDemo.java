
public class RecusionDemo {
	// Recursion mean a method call itself.
	public static void main(String[] args) {
		callMe(5);

	}
	public static void callMe(int n) {
		if (n == 0) {
			System.out.println("It is done");
		}else {
			System.out.println(n);
			n--;
			callMe(n);
		}
	}

}
