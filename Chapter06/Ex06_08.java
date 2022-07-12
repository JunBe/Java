
public class Ex06_08 {

	public static void main(String[] args) {
		int hap = 0;
		int i;

		for (i = 1; i <= 10; i++) {
			hap += i; // hap의 값을 초기화 안해서 오류
		}

		System.out.printf("1에서 10까지의 합: %d \n", hap);

	}

}
