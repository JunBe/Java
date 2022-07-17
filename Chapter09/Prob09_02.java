import java.util.Scanner;

//대문자와 소문자의 변환
public class Prob09_02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.printf("문자열을 입력하세요 : ");
		String str1, str2 = "";
		str1 = s.nextLine();
		char ch;
		System.out.printf("변환된 문자열 ==> ");
		for (int i = 0; i < str1.length(); i++) {
			ch = str1.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				str2 += (char) (ch - 32);
			} else if (ch >= 'A' && ch <= 'Z') {
				str2 += (char) (ch + 32);
			} else {
				str2 += ch;
			}
		}
		System.out.printf("%s", str2);

	}

}
