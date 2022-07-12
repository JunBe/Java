import java.util.Scanner;

//입력한 숫자만큼 별표 출력
public class Prob07_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String num;
		char k;
		System.out.printf("숫자를 여러 개 입력 : ");
		num = s.next();
		int i = 0;

		while (i < num.length()) {
			k = num.charAt(i);
			for (int j = 0; j < k - '0'; j++) {
				System.out.printf("*");
			}
			System.out.printf("\n");
			i++;
		}

	}

}
