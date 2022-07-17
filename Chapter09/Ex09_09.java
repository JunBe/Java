//==와 equals()의 비교 
public class Ex09_09 {

	public static void main(String[] args) {
		String str1 = "Java Programming";
		String str2 = "Java Programming";
		String str3 = new String("Java Programming");

		System.out.println("원 문자열1 ==> [" + str1 + "]");
		System.out.println("원 문자열2 ==> [" + str2 + "]");
		System.out.println("원 문자열3 ==> [" + str3 + "]");

		System.out.println("문자열1==문자열2 결과 :\t" + (str1 == str2));
		System.out.println("문자열1.equals(문자열2) 결과 : " + str1.equals(str2));
		System.out.println("문자열1==문자열3 결과 :\t" + (str1 == str3));
		System.out.println("문자열1.equals(문자열3) 결과 : " + str1.equals(str3));
		//==은 문자열이 같아도 다른메모리에 있으면 false
		//equals는 문자열만 같으면 true
	}

}
