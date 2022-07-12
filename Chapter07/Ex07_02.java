//for 문을 while 문으로 바꾸기2
public class Ex07_02 {

	public static void main(String[] args) {
		int hap = 0;
		int i;

		i = 0;
		while (i <= 10) {
			hap += i;
			i++;
		}
		System.out.printf(" 1에서 10까지의 합: %d \n", hap);

	}

}
