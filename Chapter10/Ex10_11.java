import java.io.BufferedReader;
import java.io.FileReader;

//파일을 이용한 입력 3
public class Ex10_11 {

	public static void main(String[] args) throws Exception {
		FileReader fReader = new FileReader("c:/Windows/win.ini");
		BufferedReader bReader = new BufferedReader(fReader);

		String str = null;
		int i=0;
		while ((str = bReader.readLine()) != null) {
			System.out.println((i+1)+"행 : "+str);
			i++;
		}

		bReader.close();
		fReader.close();

	}

}
