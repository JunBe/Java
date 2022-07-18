import java.io.IOException;

//System.in.read() 사용 예
public class Ex10_08 {

	public static void main(String[] args) {
		String userName = "hanbit";
		String input = "";
		int key;

		try {
			System.out.print("이름 ==> ");
			while ((key = System.in.read()) != 13) {
				if (key >= '0' && key <= '9') {
					continue;
				} else {
					input += Character.toString((char) key);
				}
			}

			if (userName.equals(input))
				System.out.println(input + "님 어서오세요~~");
			else
				System.out.println(input + "님 등록이 안되었습니다 ~~");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
