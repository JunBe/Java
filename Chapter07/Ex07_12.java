//break 레이블문 사용 예
public class Ex07_12 {

	public static void main(String[] args) {
		int hap = 0;
		int i;

		MyLabel: for (;;) {
			for (i = 1; i <= 100; i++) {
				hap += i;
				if (hap > 2000) {
					System.out.printf("%d\n", hap);
					hap = 0;
					break MyLabel;
				}
			}
			System.out.printf("아직도 반복중..\n");
		}

	}

}
