import java.util.Scanner;

//입력된 문자열을 거꾸로 출력
public class Prob03_04 {

	public static void main(String[] args) {
		System.out.print("문자열을 입력 ==>");
		Scanner s = new Scanner(System.in);
		String str;
		str = s.nextLine();
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.printf("%c", str.charAt(i));

		}
	}

}
