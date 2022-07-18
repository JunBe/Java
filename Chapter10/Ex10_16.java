import java.io.FileInputStream;
import java.io.FileOutputStream;

//명령 프롬프트에서 파라미터 전달받기
public class Ex10_16 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream(args[0]);
		FileOutputStream fos=new FileOutputStream(args[1]);
		
		int ch;
		
		while((ch=fis.read())!=-1)
			fos.write((byte)ch);
		
		System.out.println("복사 완료");
		fis.close();
		fos.close();
		

	}

}
