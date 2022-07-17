import java.util.Scanner;

//startsWith(),endsWith() 사용 예
public class Ex09_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str;

		System.out.printf("문자열 입력 ==> ");
		str = s.nextLine();

		System.out.printf("출력 문자열 ==> ");

		if (!str.startsWith("("))
			System.out.printf("(");

		for (int i = 0; i < str.length(); i++)
			System.out.printf("%c", str.charAt(i));

		if (!str.endsWith(")"))
			System.out.printf(")");
	}

}
