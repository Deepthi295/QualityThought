package basics;

public class Ex_BitwiseAndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 300;
		int b = 200;

		// ((300>200) && ((300<200))
		if ((a < b) && (a > b)) { /* in the log "and" if the 1st condition is f it will check the 2 condition */
			System.out.println("welcome ");/* in the log "and" if the 1st condition is t it will check the 2nd condition */
		} else {
			System.out.println("Good bye");
		}
		int x = 300;
		int y = 200;
		if ((x < y) || (x > y)) { /* in the log "or" if the 1st condition is t it wont check the 2nd condition */

			System.out.println(
					"hii deepthi"); /* in the log "or" if the 1st condition is f it will check the 2nd condition */
		} else {
			System.out.println("good night");
		}

	}

}
