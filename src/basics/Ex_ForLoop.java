 package basics;

public class Ex_ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i =5 ;i>=1;i--) { //1 2

		 for (int j = 5;j>=i;j--) { //5 5 4 5 4 3 5 4 3 2 5 4 3 2 5 4 3 2 1

		//for (int i = 1; i <= 5; i++) { // 54321 5432 543 54 5
			//for (int j = 5; j >= i; j--) {

				System.out.print(j + "  ");
			}
			System.out.println();
		}
	}

}
