package exceptions;
import java.io.PrintWriter;
import java.io.File;

public class FileClassTest {

	public static void main(String[] args) {
		File file = new File("Text");
		String[] files = new String[10];
		
		if (file.exists()) {
			
			files = file.list();
			System.out.println(files[0]);
		}
		

	}
}
