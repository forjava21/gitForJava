interface displayable{
	void display(String str);
		
	}
@FunctionalInterface
interface Cab {
	//void bookCab();
	//void bookCab(String start, String destination);
	double bookCab(String start, String destination);
};
public class LamdaApp implements displayable {
	public void display(String str) {
		System.out.println(str);
	}
	public static void main(String[] arg) {
		LamdaApp demo = new LamdaApp();
		demo.display("Hello World!!");
		
		//lambda expression without return type
		//Cab cab = () -> System.out.println("Uber Booked!! Arriving soon!!");
		//cab.bookCab();
		
		//Lambda expression with arguments
		/*
		 * Cab cab = (start, destination) -> { System.out.println("Uber form " + start +
		 * " to " +destination +" will arrive soon!!"); }; cab.bookCab("Edison",
		 * "Rahway");
		 * cab.bookCab("Edison", "Rahway");
		 */
		
		Cab cab = (start, destination) -> {
			System.out.println("Uber form " + start + " to " +destination +" will arrive soon!!");
			return 15.50;
		};
		
		double fare = cab.bookCab("Edison", "Rahway");
		System.out.println("Fare is "+fare);
	}

	
}
