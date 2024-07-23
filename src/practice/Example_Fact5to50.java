package practice;

public class Example_Fact5to50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 5; i <= 50; i++) {
			long fact = 1;
			for(int j = i;j>=1;j--) {
//			int j = i;
//			while (j>0) {
				fact = fact *j;
//				j = j-1;

			}
			System.out.println("Factioral of :" + i + " "+fact);
		}
	}
}
