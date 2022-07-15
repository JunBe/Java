//3차원 배열을 활용한 합계
public class Prob08_02 {

	public static void main(String[] args) {
		int n[][][] = new int[10][10][10];
		int num = 1;
		int hap = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				for (int k = 0; k < 10; k++) {
					n[i][j][k] = num;
					num++;
					hap += n[i][j][k];
				}
			}
		}
		System.out.printf("1~1000까지 합계 : %d ", hap);

	}

}
