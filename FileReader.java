import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



public class FileReader {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Foram\\JavaWork\\sample.txt");
		Scanner scan = new Scanner(file);
		
		String fileContent = "";
		while(scan.hasNextLine()) {
			fileContent = fileContent.concat(scan.nextLine() + "\n");
		}
		
		FileWriter writer = new FileWriter("C:\\Foram\\JavaWork\\duplicate.txt");
		writer.write(fileContent);
		writer.close();

	}

}
