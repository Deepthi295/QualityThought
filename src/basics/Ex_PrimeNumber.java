package basics;

public class Ex_PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		isprime(278);

	}

	public static void isprime(int n) {
		int count = 1;
		for (int i = 2; i <= 2; i++) {
			if (n % i == 0) {
				System.out.println("Given number is prime number  ");
				count = count + 1;
				break;

			}
		}
		if (count == 1) {
			System.out.println("Given number is not prime number ");
		}

	}

}
