import java.util.Scanner;

//원하는 배수의 합계를 구하는 계산기
public class Prob07_01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a, b, k;
		int hap = 0;
		System.out.printf("합계의 시작값==>");
		a = s.nextInt();
		System.out.printf("합계의 끝값==>");
		b = s.nextInt();
		System.out.printf("배수==>");
		k = s.nextInt();
	
		
		while(a<=b){
			if (a % k == 0)
				hap += a;
			a++;
		}
		System.out.printf("%d부터 %d까지의 %d배수의 합계 ==> %d", a, b, k, hap);

	}

}
