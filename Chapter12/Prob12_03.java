//클래스의 응용-다중상속
interface Mammal{
    void child();
}

interface Fish{
    void move();
}

class Whale implements Fish, Mammal {
    public void child(){
        System.out.println("고래는 새끼를 낳습니다.");
    }

    public void move(){
        System.out.println("물고기는 헤엄치며 움직입니다.");
    }
}

public class Prob12_03 {
    public static void main(String[] args){

        Whale whale1 = new Whale();
        whale1.child();
        whale1.move();
    }
}
