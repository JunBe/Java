//오류 메시지 직접 만들기
public class Ex10_04 {

	public static void main(String[] args) {
		int a = 100, b = 0;
		int result;
		try {
			if (b == 0)
				throw new Exception("0으로 나누려고요? 안됩니다.");
			else if (a == 0)
				throw new Exception("0은 나눠도 0입니다.");
			result = a / b;
		} catch (Exception e) {
			System.out.print("발생 오류 ==> ");
			System.out.println(e.getMessage());
		}
	}

}
