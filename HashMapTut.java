import java.util.HashMap;

public class HashMapTut {

	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		HashMap<String, String> passCode = new HashMap<String, String>();
		h.put("a", 1);
		h.put("b", 2);
		h.put("c", 3);
		
		System.out.println(h);
		System.out.println(h.get("a"));
		System.out.println(h.values());
		System.out.println(h.keySet());
		h.put("d", 4);
		
		System.out.println(h);
		h.remove("d");
		System.out.println(h);
		h.put("e",  5);
		System.out.println(h);
		h.replace("e", 5, 55);
		System.out.println(h);
		
		passCode.put("AllenMoes", "fireBall7");
		passCode.put("susanpompeo", "DevilSoccer@1");	
		System.out.println(passCode);

	}

}
