package exceptions;

public class ExceptionLinking {

	public static void main(String[] args) {
		try {
			method1();
		}
		catch (Exception e2) {
			e2.printStackTrace();
		}

	}
	
	public static void method1() throws Exception {
		try {
			method2();
		}
		catch (Exception e1) {
			throw new Exception("Message from method 1", e1);
		}
	}
	
	public static void method2() throws Exception {
		throw new Exception("Message from method 2");
	}

}
