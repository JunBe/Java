import java.util.Scanner;

//if문을 활용한 계산기
public class Prob02_02 {

	public static void main(String[] args) {
		int a, b;
		int k;
		int result;

		Scanner s = new Scanner(System.in);
		System.out.print("첫 번째 계산할 값을 입력하세요 ==>");
		a = s.nextInt();
		System.out.print("<1> 덧셈 <2> 뺄셈 <3> 곱셈 <4> 나눗셈 ==>");
		k = s.nextInt();
		System.out.print("두 번째 계산할 값을 입력하세요 ==>");
		b = s.nextInt();

		if (k == 1) {
			result = a + b;
			System.out.println(a + "+" + b + "=" + result);
		} else if (k == 2) {
			result = a - b;
			System.out.println(a + "-" + b + "=" + result);
		} else if (k == 3) {
			result = a * b;
			System.out.println(a + "*" + b + "=" + result);
		} else if (k == 4) {
			result = a / b;
			System.out.println(a + "/" + b + "=" + result);
		}
	}

}
