import java.util.Scanner;

//다양한 for문의 형태3
public class Ex06_18 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;

		for (;;) {
			System.out.printf("더할 첫 번째 수 입력 : ");
			a = s.nextInt();
			System.out.printf("더할 두 번째 수 입력 : ");
			b = s.nextInt();
			System.out.printf("%d + %d = %d\n", a, b, a + b);
		}

	}

}
