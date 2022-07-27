//추상 클래스의 예 2
abstract class Car9{
    int speed = 0;
    String color;

    abstract void upSpeed(int speed);

    abstract void work();
}

class Sedan9 extends Car9{

    void upSpeed(int speed){
        if(this.speed+speed>=150){
            this.speed = 150;
        }else {
            this.speed += speed;
        }
    }
    void work(){
        System.out.println("승용차가 사람을 태우고 있습니다.");
    }
}

class Truck9 extends Car9{

    void upSpeed(int speed){
        if(this.speed+speed>=130){
            this.speed = 130;
        }else {
            this.speed += speed;
        }
    }
    void work(){
        System.out.println("트럭이 짐을 싣고 있습니다.");
    }
}
public class Ex12_09 {
    public static void main(String[] args){
        Sedan9 sedan1 = new Sedan9();
        sedan1.work();
        Truck9 truck1 = new Truck9();
        truck1.work();
        sedan1.upSpeed(120);
        truck1.upSpeed(500);
        System.out.printf("세단의 속도는 %d \n",sedan1.speed);
        System.out.printf("트럭의 속도는 %d \n",truck1.speed);
    }
}

