//다중 반복문의 무한 루프
public class Ex07_11 {

	public static void main(String[] args) {
		int hap = 0;
		int i;

		for (;;) {
			for (i = 1; i <= 100; i++) {
				hap += i;
				if (hap > 2000) {
					System.out.printf("%d\n", hap);
					hap = 0;
					break;
				}
			}
			System.out.printf("아직도 반복중...\n");
		}

	}

}
