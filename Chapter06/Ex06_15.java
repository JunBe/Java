//중첩 for문 사용 예 3
public class Ex06_15 {

	public static void main(String[] args) {
		int i,k;
		
		for(i=1;i<=9;i++) {
			for(k=2;k<=9;k++) {
				System.out.printf("%3dX%d=%2d", i,k,i*k);
			}
			System.out.printf("\n");
		}
	}

}
