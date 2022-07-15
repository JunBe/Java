import java.util.Scanner;

public class Ex08_11 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;

		char[] stack = new char[5];
		int top = 0;

		while (true) {
			System.out.printf("1: 출입 2: 퇴장 ");
			n = s.nextInt();
			if (n == 1) {
				if (top >= 5) {
					System.out.printf("터널이 꽉 참\n");
					continue;
				}
				stack[top] = (char) (top + 65);
				System.out.printf(" %c 자동차가 터널에 들어감\n", stack[top]);
				top++;
			} else if (n == 2) {
				if (top <= 0) {
					System.out.printf("터널이 비었음\n");
					continue;
				}
				top--;
				System.out.printf(" %c 자동차가 터널을 빠져나감\n", stack[top]);
				stack[top] = ' ';
			}

		}

	}

}
