//클래스 변수 활용 예
class Car10 {
	int speed;
	String color;
	static int count = 0;
	String CAR_TYPE;
	Car10() {
		count++;
		CAR_TYPE="승용차";
	}
}

public class Ex11_10 {

	public static void main(String[] args) {
		Car10 myCar1 = new Car10();
		System.out.println("현재 생산된 자동차 숫자 ==> " + myCar1.count);

		Car10 myCar2 = new Car10();
		System.out.println("현재 생산된 자동차 숫자 ==> " + myCar2.count);

		Car10 myCar3 = new Car10();
		System.out.println("현재 생산된 자동차 숫자 ==> " + myCar3.count);

	}

}
