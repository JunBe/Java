//매개변수 전달 방법(값의 전달)
public class Ex09_17 {
	static void func1(int a) {
		a=a+1;
		System.out.printf("전달받은 a ==> %d\n",a);
	}
	public static void main(String[] args) {
		int a=10;
		
		func1(a);
		System.out.printf("func1() 실행 후의 a ==> %d\n",a);
		
	}

}
