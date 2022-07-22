import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

//파일에서 읽어온 문자열을 파일에 거꾸로 출력
public class Prob10_03 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(new File("C:/temp/in.txt"));
		PrintWriter pw = new PrintWriter("C:/temp/out.txt");

		String str1, str2 = "";

		while (sc.hasNextLine()) {
			str1 = sc.nextLine();
			int size = str1.length();
			for (int i = size - 1; i >= 0; i--) {
				//str2 += str1.charAt(i);
				pw.print(str1.charAt(i));
			}

			//pw.println(str2);
			//str2 = "";
		}

		sc.close();
		pw.close();

	}

}
