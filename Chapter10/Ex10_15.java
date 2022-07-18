import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Scanner;

//파일을 이용한 출력 3
public class Ex10_15 {

	public static void main(String[] args) throws Exception {
		Scanner sc= new Scanner(System.in);
		String Input,Output;
		System.out.printf("입력파일 :");
		Input=sc.nextLine();
		FileInputStream fis=new FileInputStream(Input);
		System.out.printf("출력파일 :");
		Output=sc.nextLine();
		FileOutputStream fos=new FileOutputStream(Output);
		int ch;
		
		while((ch=fis.read())!=-1)
			fos.write((byte)ch);
		
		System.out.println("복사 완료");
		fis.close();
		fos.close();
		
		

	}

}
