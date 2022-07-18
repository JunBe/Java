import java.io.IOException;
import java.util.Scanner;

//예외 처리를 활용한 간단한 계산기
public class Prob10_01 {

	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int num1, num2;
		char oper;
		int result = 0;
		System.out.printf("첫번째 수를 입력하세요 : ");
		num1 = s.nextInt();
		System.out.printf("계산할 연산자를 입력하세요 : ");
		oper = (char) System.in.read();
		System.out.printf("두번째 수를 입력하세요 : ");
		num2 = s.nextInt();

		try {
			if (oper == '+') {
				result = num1 + num2;
			} else if (oper == '-') {
				result = num1 - num2;
			} else if (oper == '*') {
				if (num1 == 0 || num2 == 0) {
					throw new Exception("0으로 곱하면 어차피 0입니다.");
				}
				result = num1 * num2;
			} else if (oper == '/') {

				if (num2 == 0) {
					throw new Exception("0으로 나눌 수 없습니다.");
				}
				result = num1 / num2;

			} else if (oper == '%') {
				result = num1 % num2;
			}
			
			System.out.printf("%d와 %d의 결과는 %d입니다", num1, num2, result);
		} catch (Exception e) {
			System.out.print("발생 오류 ==> ");
			System.out.println(e.getMessage());
		}

	}

}
