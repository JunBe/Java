import java.util.Scanner;

//입력된 문자열을 거꾸로 출력
public class Prob09_01 {
	static void reverse(String str) {
		System.out.printf("내용을 거꾸로 출력 ==> ");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.printf("%c", str.charAt(i));
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("문자열을 입력하세요 : ");
		String str;

		str = s.nextLine();
		reverse(str);

	}

}
