package things;

import java.util.*;
import java.io.*;

public class DataSaverAndReader {

	public static void main(String[] args) throws IOException {
		File file = new File("SaveFile.txt");
		StringBuilder fileContents = new StringBuilder();
		
		if (file.createNewFile())
			System.out.println("Save file created.");
		else
			System.out.println("Existing save file found.");
		
		try (
		Scanner read = new Scanner(file);
		PrintWriter write = new PrintWriter(file);
		) {
			write.print("A");
			while (read.hasNext()) {
				fileContents.append(read.next());
			}
			
			System.out.println(fileContents);
		}

	}

}
