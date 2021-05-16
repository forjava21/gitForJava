import java.text.SimpleDateFormat;
import java.util.Date;

public class NestedLoops {

	public static void main(String[] args) {
		String str[][] = { { "red", "green" }, { "blue", "yellow" } };
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(str[i][j]);
			}
		}
		
		//int[] array = new int[3];
		//String[] s = new String[3];
		//for (int i = 0; i < 3; i++) {
		//	array[i] = i + 100;
		//	System.out.println(array[i]);
		//}
		
		//Date 
		//Date currentDate = new Date();
		//System.out.println(currentDate);
		//SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
		//System.out.println(dateFormat.format(currentDate));
		
		//SimpleDateFormat dayOfTheweek = new SimpleDateFormat("EEEE");
		//System.out.println(dayOfTheweek.format(currentDate));
		
		//SimpleDateFormat clockFormat = new SimpleDateFormat("h:mm a");
		//System.out.println(clockFormat.format(currentDate));
		
		
	}

}
