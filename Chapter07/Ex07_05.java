//do~while 문 사용 예 1
public class Ex07_05 {

	public static void main(String[] args) {
		int a = 100;
		while (a == 200) {
			System.out.printf("while문 내부에 들어왔습니다\n");
		}
		do {
			System.out.printf("while문 내부에 들어왔습니다\n");
		} while (a == 200);

	}

}
