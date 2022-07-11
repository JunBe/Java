import java.util.Scanner;

//윤년 계산 프로그램
public class Prob04_03 {

	public static void main(String[] args) {
		System.out.print("연도를 입력하세요 : ");
		Scanner s = new Scanner(System.in);
		int year;
		year = s.nextInt();

		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.printf("%d 년은 윤년입니다.", year);
		} else {
			System.out.printf("%d 년은 윤년이 아닙니다.", year);
		}
	}

}
