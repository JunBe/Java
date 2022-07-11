import java.io.IOException;
import java.util.Scanner;

//단순 if문을 활용한 간단한 계산기
public class Prob05_01 {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int a, b;
		char k;
		System.out.printf("첫번 째 수를 입력하시오 : ");
		a = s.nextInt();
		System.out.printf("계산할 연산자를 입력하세요 : ");
		k = (char) System.in.read(); // 또는 k=s.next().charAt(0);
		System.out.printf("첫번 째 수를 입력하시오 : ");
		b = s.nextInt();

		if (k == '+') {
			System.out.printf("%d + %d = %d", a, b, a + b);
		}
		if (k == '-') {
			System.out.printf("%d - %d = %d", a, b, a - b);
		}
		if (k == '*') {
			System.out.printf("%d * %d = %d", a, b, a * b);
		}
		if (k == '/') {
			System.out.printf("%d / %d = %d", a, b, a / b);
		}
		if (k == '%') {
			System.out.printf("%d %% %d = %d", a, b, a % b);
		}

	}

}
