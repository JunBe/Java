class pet2 {
	private int month;
	private String name;

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

	pet2(String name, int month) {
		this.name = name;
		this.month = month;
	}

}

public class Prob11_02 {

	public static void main(String[] args) {
		pet2 Dog = new pet2("강아지", 8);
		pet2 Cat = new pet2("고양이", 13);
		Dog.move();
		Cat.move();
		System.out.println(Dog.getName() + "는 " + Dog.getMonth() + "개월입니다");
		System.out.println(Cat.getName() + "는 " + Cat.getMonth() + "개월입니다");

	}

}
