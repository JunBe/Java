import java.util.Scanner;

//입력한 문자열의 종류 구분
public class Prob07_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		System.out.printf("문자열을 입력 : ");
		str = s.nextLine();
		int i = 0;
		int upper, lower, num;
		upper = lower = num = 0;

		while (i < str.length()) {
			if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				upper += 1;
			} else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				lower += 1;
			} else if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				num += 1;
			}
			i++;
		}
		System.out.printf("대문자 %d개, 소문자 %d개, 숫자 %d개", upper, lower, num);

	}

}
