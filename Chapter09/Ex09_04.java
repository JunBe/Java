//indexOf(), lastIndexOf() 사용 예
public class Ex09_04 {

	public static void main(String[] args) {
		String str = "Java를 공부하는 중, Java는 재밌어요";

		System.out.printf("제일 처음 나오는 Java 위치 ==>");
		System.out.println(str.indexOf("Java"));
		System.out.printf("마지막에 나오는 Java 위치 ==>");
		System.out.println(str.lastIndexOf("Java"));

	}

}
