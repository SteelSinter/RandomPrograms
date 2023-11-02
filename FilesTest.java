package filesTest;

import java.util.Scanner;
import java.io.*;

public class FilesTest {

	public static void main(String[] args) throws Exception {
		File file = new File("TextTest.txt");
		
		if (file.exists()) {
			
			
			try (
					PrintWriter output = new PrintWriter(file);
					Scanner input = new Scanner(file);
					) {
				output.print("I once ate an entire 3 pound bag of sourpatch kids.\r"
						+ "It was early saturday morning when I awoke to the distant hum of "
						+ "the neighbor's lawn mower, the sunlight dancing across the room.\r"
						+ "I reached to the nightstand to the glass of water that had been waiting"
						+ " patiently all night.\rI yanked myself out of bed, one limb at a time."
						+ "\r");
				output.println("Red.");
				output.println("Rice is twice as nice as ice.");
				if (input.hasNextLine()) {
					String word1 = input.nextLine();
					String word2 = input.next();
					String word3 = input.next();
					
					System.out.println(word1 + word2 + word3);
				}
					
				
				
				for (int i = 0; i < 44; i++) {
					output.append('A');
				}
			}
			
		}
		else
			System.out.println();

	}

}
