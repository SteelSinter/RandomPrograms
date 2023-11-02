package exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {
		int[] array = new int[5];
		array[1] = 5024320;
		int zero = 0;
		
		try {
			System.out.println(array[0] + "statement1");
			System.out.println(array[1] / 0 + "statement2");
			System.out.println(array[2] + "statement3");
		}
		catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1);
		}
		catch (ArithmeticException e2) {
			throw e2;
		}
		finally {
			System.out.println("Statement4");
		}
		System.out.println("Statement5");

	}

}
