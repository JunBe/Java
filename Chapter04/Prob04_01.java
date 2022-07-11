import java.util.Scanner;

//입력된 두 실수의 산술 연산
public class Prob04_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		float a, b;
		System.out.printf("첫번째 계산할 값을 입력하세요 ==> ");
		a = s.nextFloat();
		System.out.printf("두번째 계산할 값을 입력하세요 ==> ");
		b = s.nextFloat();
		
		System.out.printf("%f + %f = %f\n", a,b,a+b);
		System.out.printf("%f - %f = %f\n", a,b,a-b);
		System.out.printf("%f * %f = %f\n", a,b,a*b);
		System.out.printf("%f / %f = %f\n", a,b,a/b);
		System.out.printf("%d + %d = %d\n", (int)a,(int)b,(int)a%(int)b);
	}

}
