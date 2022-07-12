import java.util.Scanner;

//입력된 문자를 거꾸로 출력
public class Prob06_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;
		System.out.printf("글자를 입력 : ");
		str = s.nextLine();
		System.out.printf("입력한 문자열 ==> %s\n", str);
		System.out.printf("변환된 문자열 ==> ");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.printf("%c", str.charAt(i));
		}

	}

}
