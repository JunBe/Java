//private, public 접근 제어 수식어 활용 예

class Car5{
	private int speed=0;
	
	public void upSpeed(int value) {
		if(speed+value>200) {
			speed=200;
		}else {
			speed+=value;
		}
		System.out.println("현재 속도 ==>"+getSpeed());
	}
	
	public void downSpeed(int value) {
		if(speed-value<0) {
			speed=0;
		}else {
			speed-=value;
			
		}
		System.out.println("현재 속도 ==>"+getSpeed());
	}
	
	public int getSpeed() {
		return speed;
	}
	
	
}
public class Ex11_05 {

	public static void main(String[] args) {
		Car5 myCar1=new Car5();
		
		myCar1.upSpeed(100);
		myCar1.upSpeed(150);
		
		myCar1.downSpeed(50);
		myCar1.downSpeed(160);
	}

}
