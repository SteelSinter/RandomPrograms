package things;

import java.util.*;
import java.io.*;

public class DataSaverAndReader {

	public static void main(String[] args) throws IOException {
		File file = new File("SaveFile.txt");
		String fileContents = new String();
		
		if (file.createNewFile())
			System.out.println("Save file created.");
		else
			System.out.println("Existing save file found.");
		
		try (PrintWriter write = new PrintWriter(file);
		) {
			for (int i = 0; i < 100; i++) {
				write.print("A");
			}
			
		}
		
		try (Scanner read = new Scanner(file);
		) {
			while (read.hasNext()) {
				fileContents = fileContents.concat(read.next());
			}
			
			System.out.println(fileContents);
		}
		

	}

}
