
public class ReverseString {

	public static void main(String[] args) {
		String s = "Hello World!!";
		System.out.println(reverse(s));
		
		StringBuilder str = new StringBuilder("pretty!!");
		System.out.println(str.reverse());
		
		
	
		
	}
	
	public static String reverse(String s){
		char[] letters = new char[s.length()];
		
		int index = 0;
		for(int i = s.length() - 1; i>=0; i--) {
			letters[index] = s.charAt(i);
			index++;
		}
		
		String reverseStr = "";
		for(int i=0; i < s.length(); i++) {
			reverseStr = reverseStr + letters[i];
		}
		return reverseStr;
	}

}
