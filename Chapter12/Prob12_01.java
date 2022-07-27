//클래스의 응용-상속
class Pet{
    String Type = "애완동물";
    int weight;

    void move(){
        System.out.println(this.Type + "이 움직입니다.");
    }
}

class Dog extends Pet {
    String name;
    String Type="강아지";

    Dog(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    void produce() {
        System.out.println(this.Type + "의 이름은 " + this.name + "이고, 몸무게는 " + this.weight + "kg입니다.");
    }
}

class Bird extends Pet{
    String Type = "앵무새";
    void move(){
        System.out.println("새의 종류는 " + this.Type + "고, 날 수 있습니다");
    }
}

public class Prob12_01 {
    public static void main(String[] args){
        Pet pet1 = new Pet();
        pet1.move();
        pet1.move();
        Dog dog1 = new Dog("누렁이",10);
        dog1.produce();
        Bird bird1=new Bird();
        bird1.move();


    }

}
