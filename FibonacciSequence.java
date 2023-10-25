package objects;
import java.math.*;

public class FibonacciSequence {

	public static void main(String[] args) {
		BigInteger bigInt = new BigInteger("1");
		BigInteger next;
		BigInteger prev = new BigInteger("0");
		
		for(int i = 1; i < 50; i++) {
			next = bigInt.add(prev);
			prev = bigInt;
			bigInt = next;
			System.out.println(i + 1 + ": " + bigInt);
		}

	}

}
