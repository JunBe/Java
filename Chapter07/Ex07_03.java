import java.util.Scanner;

//while문의 무한 루프 만들기
public class Ex07_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b;

		while (true) {
			System.out.printf("더할 첫 번째 수 입력 : ");
			a = s.nextInt();
			System.out.printf("더할 두 번째 수 입력 : ");
			b = s.nextInt();

			System.out.printf("%d + %d = %d \n", a, b, a + b);
		}

	}

}
