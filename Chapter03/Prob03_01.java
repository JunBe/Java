import java.util.Scanner;
//정수형을 출력하는 프로그램
public class Prob03_01 {

	public static void main(String[] args) {
		System.out.print("정수를 입력하세요 ==> ");
		Scanner s = new Scanner(System.in);
		int a;
		a=s.nextInt();
		
		System.out.printf("10진수 ==> %d\n",a);
		System.out.printf("16진수 ==> %x\n",a);
		System.out.printf("8진수 ==> %o\n",a);
	}

}
