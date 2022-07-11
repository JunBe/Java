//증감 연산자와 대입 연산자
public class Ex04_03 {

	public static void main(String[] args) {
		int a = 11;

		a++;
		System.out.printf(" a ++ ==> %d \n ", a);

		a--;
		System.out.printf(" a -- ==> %d \n", a);

		a += 5;
		System.out.printf(" a += 5 ==> %f \n", (float) a);

		a -= 5;
		System.out.printf(" a -= 5 ==> %f \n", (float) a);

		a *= 5;
		System.out.printf(" a *= 5 ==> %f \n", (float) a);

		a /= 5;
		System.out.printf(" a /= 5 ==> %f \n", (float) a);

		a %= 5;
		System.out.printf(" a %%= 5 ==> %d \n", a);

	}

}
