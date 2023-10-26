package objects;
import java.util.*;
import java.lang.*;

public class StringTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		StringBuilder strB = new StringBuilder(input.nextLine());
		
		System.out.println(strB.reverse() + String.valueOf(strB.capacity()));

	}

}

