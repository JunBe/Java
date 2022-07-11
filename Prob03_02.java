import java.util.Scanner;
//입력하는 정수의 진수 결정
public class Prob03_02 {

	public static void main(String[] args) {
		System.out.print("입력진수 결정 <1>10 <2>16 <3>8 : ");
		Scanner s = new Scanner(System.in);
		int k,data;
		k = s.nextInt();
		String a;
		if (k == 1) {
			System.out.print("값 입력 : ");
			a = s.next();
			data=Integer.parseInt(a,10);
			System.out.printf("10진수 ==> %d \n", data);
			System.out.printf("16진수 ==> %x \n", data);
			System.out.printf("8진수 ==> %o \n", data);
		} else if (k == 2) {
			System.out.print("값 입력 : ");
			a = s.next();
			data=Integer.parseInt(a,16);
			System.out.printf("10진수 ==> %d \n", data);
			System.out.printf("16진수 ==> %x \n", data);
			System.out.printf("8진수 ==> %o \n", data);
		} else if (k == 3) {
			System.out.print("값 입력 : ");
			a = s.next();
			data=Integer.parseInt(a,8);
			System.out.printf("10진수 ==> %d \n", data);
			System.out.printf("16진수 ==> %x \n", data);
			System.out.printf("8진수 ==> %o \n", data);
		}

	}

}
