interface Calculator{
	void add(int num1, int num2);
}

class Calc{
	public static void addNumbers(int num1, int num2) {
		System.out.println("addition of " + num1 + " and " +num2 + " is " + (num1+num2) );
	}
	
	public void letsAdd(int num1, int num2) {
		System.out.println("add " + num1 + " and " +num2 + " is " + (num1+num2) );
	}
}

interface Messenger{
	Message getMessage(String str);
}

class Message{
	Message(String msg){
		System.out.println("Message is " + msg);
	}
}
public class MethodReference {

	public static void main(String[] args) {
		//Calc.addNumbers(5,10);

		//1. Reference to a static method
		//Calculator c = Calc::addNumbers;     // Method reference(to class Calc)
		//c.add(20, 30);
		
		//2.Reference to a non static method
		//Calc cal = new Calc();
		//Calculator c = cal::letsAdd;
		//c.add(12, 13);
		
		//3. reference to constructor
		
		Messenger mRef = Message::new;
		mRef.getMessage("Hello World!!");
	}

}
