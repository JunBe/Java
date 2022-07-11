//산술 연산자 사용 예
public class Ex04_01 {

	public static void main(String[] args) {
		int a, b = 5, c = 3;
		float x;
		a = b + c;
		System.out.printf("%d + %d = %d \n", b, c, a);

		a = b - c;
		System.out.printf("%d - %d = %d \n", b, c, a);

		a = b * c;
		System.out.printf("%d * %d = %d \n", b, c, a);

		x = (float) b / c;
		System.out.printf("%d / %d = %f \n", b, c, x);

		a = b % c;
		System.out.printf("%d %% %d = %d \n", b, c, a);
	}

}
