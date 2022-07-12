//중첩 for문 사용 예 2
public class Ex06_14 {

	public static void main(String[] args) {
		int i, k;

		for (i = 2; i <= 9; i++) {
			System.out.printf("##제 %d단 ##\n", i);
			for (k = 1; k <= 9; k++) {
				System.out.printf(" %d X %d = %d \n", i, k, i * k);
			}
			System.out.printf("\n");
		}

	}

}
