import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

//파일을 이용한 출력 2
public class Ex10_14 {

	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		FileWriter fw= new FileWriter("C:/temp/data4.txt");
		PrintWriter pw=new PrintWriter("C:/temp/data4-1.txt");
		String str,str2;
		
		while(!(str=sc.nextLine()).equals("")) {
			fw.write(str+"\r\n");
		}
		
		while(!(str=sc.nextLine()).equals("")) {
			pw.println(str);
		}
		
		fw.close();
		pw.close();

	}

}
