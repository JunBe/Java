//자동차 클래스 생성 및 사용 예 2
class Car2 {
	String color;
	int speed;

	void upSpeed(int value) {
		speed += value;

	}

	void downSpeed(int value) {
		speed -= value;
	}

	String getColor() {
		return color;
	}

	int getSpeed() {
		return speed;
	}
}

public class Ex11_02 {

	public static void main(String[] args) {
		Car2 myCar1 = new Car2();
		myCar1.color = "빨강";
		myCar1.speed = 0;

		myCar1.upSpeed(30);
		System.out.println("자동차1의 색상은 " + myCar1.color + "이며, 현재속도는 " + myCar1.speed + "km 입니다.");
		System.out.println("자동차1의 색상은 " + myCar1.getColor() + "이며, 현재속도는 " + myCar1.getSpeed() + "km 입니다.");

	}

}
