//왼쪽, 오른쪽 시프트 연산자 사용 예
public class Ex04_15 {

	public static void main(String[] args) {
		int a = 100, result;
		int i;

		for (i = 1; i <= 5; i++) {
			result = a << i;
			System.out.printf("%d << %d = %d\n", a, i, result);
		}
		for (i = 1; i <= 5; i++) {
			result = a >> i;
			System.out.printf("%d >> %d = %d\n", a, i, result);
		}

	}

}
