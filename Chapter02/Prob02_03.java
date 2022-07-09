import java.io.IOException;
import java.util.Scanner;

//오류 없는 계산기
public class Prob02_03 {

	public static void main(String[] args) throws IOException {
		int a, b;
		char k;
		int result;

		Scanner s = new Scanner(System.in);
		System.out.print("첫 번째 계산할 값을 입력하세요 ==>");
		a = s.nextInt();
		System.out.print("+ - * / % ==>");
		k = (char) System.in.read();
		System.out.print("두 번째 계산할 값을 입력하세요 ==>");
		b = s.nextInt();

		if (k == '+') {
			result = a + b;
			System.out.println(a + "+" + b + "=" + result);
		} else if (k == '-') {
			result = a - b;
			System.out.println(a + "-" + b + "=" + result);
		} else if (k == '*') {
			result = a * b;
			System.out.println(a + "*" + b + "=" + result);
		} else if (k == '/') {
			if (b == 0) {
				System.out.println("0으로 나누면 안됩니다.");
			} else {
				result = a / b;
				System.out.println(a + "/" + b + "=" + result);
			}
		} else if (k == '%') {
			if (b != 0) {
				result = a % b;
				System.out.println(a + "%" + b + "=" + result);
			} else {
				System.out.println("0으로 나누면 안됩니다.");
			}
		}

	}

}
