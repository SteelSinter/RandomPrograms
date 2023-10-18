package mod1Exam;

public class ObjectTesting {

	public static void main(String[] args) {
		Cheese cheese1 = new Cheese();
		
		Cheese cheese2 = new Cheese("Parmesan", "Large", 12);
		
		System.out.println(cheese1.type);
		
		cheese1.setType("Swiss");
		
		System.out.println(cheese1.type);
		System.out.println(cheese2.ageMonths);
		
		cheese2.eat();
		cheese1.eat();

	}

}

class Cheese {
	String type;
	String size;
	int ageMonths;
	
	Cheese() {
		type = "Cheddar";
		size = "Medium";
		ageMonths = 15;
	}
	
	Cheese(String newType, String newSize, int newAge) {
		type = newType;
		size = newSize;
		ageMonths = newAge;
	}
	
	void setType(String newType) {
		type = newType;
	}
	
	void eat() {
		System.out.println("Wow! That " + type.toLowerCase() + " cheese was really tasty!");
	}
}