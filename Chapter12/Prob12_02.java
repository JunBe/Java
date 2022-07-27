class Pet2{
    String Type = "애완동물";
    void move() {
        System.out.println("슈퍼클래스 move() : " + this.Type + "이 움직입니다");
    }
}

class Dog2 extends Pet2{
    void move() {
        System.out.println("서브클래스 move() : " + this.Type + "가 움직입니다");
    }
}

class Bird2 extends Pet2{
    void move() {
        System.out.println("서브클래스 move() : " + this.Type + "가 날아갑니다");

    }
}

public class Prob12_02 {
    public static void main(String[] args){
        Pet2 pet1 = new Pet2();
        pet1.move();
        Dog2 dog1 = new Dog2();
        dog1.Type = "강아지";
        dog1.move();
        Bird2 bird1 = new Bird2();
        bird1.Type = "새";
        bird1.move();
    }
}
