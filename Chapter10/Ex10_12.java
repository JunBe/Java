import java.io.File;
import java.util.Scanner;

//Scanner를 이용한 입력
public class Ex10_12 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("C:/temp/data2-1.txt"));

		float hap = 0;

		while (sc.hasNextLine())
			hap += sc.nextFloat();

		System.out.printf("합계 : %7.2f", hap);
		sc.close();
	}

}
