//구구단의 결과 2차원 배열에 저장
public class Prob08_01 {

	public static void main(String[] args) {
		int gugu[][] = new int[9][9];
		int i, k;
		for (i = 0; i < 9; i++) {
			for (k = 0; k < 9; k++) {
				gugu[k][i] = (i + 1) * (k + 1);
				System.out.printf("%dX%d=%3d  ", k + 1, i + 1, gugu[k][i]);
			}
			System.out.printf("\n");
		}

	}

}
