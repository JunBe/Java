import java.util.Scanner;

//break 문 사용 예2
public class Ex07_08 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a,b;
		
		while(true) {
			System.out.printf("더할 첫 번째 수 입력 : ");
			a=s.nextInt();
			System.out.printf("더할 두 번째 수 입력 : ");
			b=s.nextInt();
			
			if(a==0)
				break;
			
			System.out.printf("%d + %d = %d \n", a,b,a+b);
		}

	}

}
