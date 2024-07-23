package basics;

public class EX_Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int x = 10+20*(3*20/2-10)+200-100;

		// System.out.println(x);

		int a = 10;
		int b = 20;

		// int c = ++a +a + a++ + b++ + b +a + ++a + --b;
		// 11 + 11+11(12)+20(21)+21+12+13+20 = 119,13,20

		// int c = a++ + a + a-- + b++ +b-- +a-- +a +b-- +b;
		// 10(11)+11+11(10)+20(21)+21(20)+10(9)+ 9 +20(19)+19 =122,9,19

		int c = a + b + a++ + a++ + b++ + a++ + a + b++;

		// 10+20+ 11(12)+ 11(12)+20(21)+12(13)+13+21(22)=93,13,22

		System.out.println(c); // 122
		System.out.println(a); // 10
		System.out.println(b); // 29
	}

}
