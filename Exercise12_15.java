package filesTest;
import java.util.Scanner;
import java.io.*;

public class Exercise12_15 {

	public static void main(String[] args) throws IOException {
		File file = new File("Exercise12_15.txt");
		
		try (PrintWriter output = new PrintWriter(file)) {
			for (int i = 0; i < 10000; i++) {
				double n = (int)(Math.random() * 10);
				if (i % 37 == 0)
					output.append("\r");
				output.append(Integer.toBinaryString((int)n));
			}
		}

	}

}
