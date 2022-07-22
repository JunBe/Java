//클래스의 기본-생성자 , 클래스변수 ,클래스 메소드 활용
class pet3 {
	private String name;
	private int month;
	static private int count = 0;

	String getName() {
		return this.name;
	}

	int getMonth() {
		return this.month;
	}

	void setName(String name) {
		this.name = name;
	}

	void setMonth(int month) {
		this.month = month;
	}

	pet3() {
		count++;
	}

	pet3(String name, int month) {
		this.name = name;
		this.month = month;
		count++;
	}

	static int getCount() {
		return count;
	}

	void move() {
		System.out.println(this.name + "가 움직입니다.");
	}

}

public class Prob11_03 {

	public static void main(String[] args) {
		pet3 Dog = new pet3("강아지", 8);
		pet3 Cat = new pet3();
		Cat.setName("고양이");
		Cat.setMonth(13);
		Dog.move();
		Cat.move();
		System.out.println(Dog.getName() + "는 " + Dog.getMonth() + "개월입니다.");
		System.out.println(Cat.getName() + "는 " + Cat.getMonth() + "개월입니다.");
		System.out.println("현재 우리집 애완동물 수는 " + pet3.getCount() + "마리입니다.");
	}

}
