package basics;

public class Ex_OnetotenFact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 10; i >= 1; i--) {
			factorial(i);
		}
	}

	public static void factorial(int i) {
		int fact = 1;
		while (i >= 1) {
			fact = fact * i;
			i = i - 1;

		}
		System.out.println("Factorial of " + i + "::" + fact);
	}

}
