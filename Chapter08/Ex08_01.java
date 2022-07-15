import java.util.Scanner;

//여러 개의 변수 값을 선언하여 출력 
public class Ex08_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, c, d;
		int hap = 0;

		System.out.printf("1번째 숫자를 입력하세요 : ");
		a = s.nextInt();
		System.out.printf("2번째 숫자를 입력하세요 : ");
		b = s.nextInt();
		System.out.printf("3번째 숫자를 입력하세요 : ");
		c = s.nextInt();
		System.out.printf("4번째 숫자를 입력하세요 : ");
		d = s.nextInt();

		hap = a + b + c + d;
		System.out.printf(" 합계 ==> %d", hap);

	}

}
