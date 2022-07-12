//구구단 출력
public class Prob06_01 {

	public static void main(String[] args) {
		int i, k;
		for (i = 2; i <= 9; i++) {
			System.out.printf("  #제%d단# ", i);
		}
		System.out.printf("\n");
		for (i = 1; i <= 9; i++) {
			for (k = 2; k <= 9; k++) {
				System.out.printf("%2dX%2d=%2d ", k, i, i * k);
			}
			System.out.printf("\n");
		}

	}

}
