//public 접근 제어 수식어 사용 예
class Car4 {
	private String color;
	private int speed;

	protected void upSpeed(int value) {
		speed += value;

	}

	protected void downSpeed(int value) {
		speed -= value;
	}

	protected String getColor() {
		return color;
	}

	protected int getSpeed() {
		return speed;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	protected void setSpeed(int speed) {
		this.speed = speed;
	}
}
public class Ex11_04 {

	public static void main(String[] args) {
		Car4 myCar1=new Car4();
		myCar1.setColor("빨강");
		myCar1.setSpeed(0);
		
		myCar1.upSpeed(30);
		System.out.println("자동차1의 색상은 "+myCar1.getColor()+"이며, 현재속도는 "+myCar1.getSpeed()+"km 입니다.");
		

	}

}
