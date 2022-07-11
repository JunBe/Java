import java.util.Scanner;

//동전 교환 프로그램
public class Prob04_02 {

	public static void main(String[] args) {
		System.out.printf(" ## 교환할 돈은 ? ");
		Scanner s = new Scanner(System.in);
		int money;
		int C500, C100, C50, C10, remain;
		money = s.nextInt();
		C500 = money / 500;
		C100 = (money % 500) / 100;
		C50 = (money % 100) / 50;
		C10 = (money % 50) / 10;
		remain = (money % 10);
		System.out.printf("\n 오백원짜리 ==> %d 개", C500);
		System.out.printf("\n 백원짜리 ==> %d 개", C100);
		System.out.printf("\n 오십원짜리 ==> %d 개", C50);
		System.out.printf("\n 십원짜리 ==> %d 개", C10);
		System.out.printf("\n 바꾸지 못한 잔돈 ==> %d 개", remain);
	}

}
