class pet {
	int month;
	String name;

	int getMonth() {
		return month;
	}

	String getName() {
		return name;
	}

	private void setMonth(int month) {
		this.month = month;
	}
	
	void move() {
		System.out.println(this.name+"가 움직입니다.");
	}

	pet(String name, int month) {
		this.name = name;
		this.month = month;
	}

}

public class Prob11_01 {

	public static void main(String[] args) {
		pet Dog = new pet("강아지", 8);
		pet Cat = new pet("고양이", 13);
		Dog.move();
		Cat.move();
		System.out.println(Dog.name + "는 " + Dog.getMonth() + "개월입니다");
		System.out.println(Cat.name + "는 " + Cat.getMonth() + "개월입니다");
	}

}
