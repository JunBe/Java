//인터페이스 다중 상속의 예
interface Car11{
    void work();
}

interface Cannon{
    void fire();
}

interface MachineGun{
    void shoot();
}

class Tank implements Car11,Cannon,MachineGun{
    public void work(){
        System.out.println("탱크가 앞으로 굴러갑니다.");
    }

    public void fire(){
        System.out.println("탱크에서 대포를 발사합니다.");
    }

    public void shoot(){
        System.out.println("탱크에서 기관총이 나갑니다.");
    }
}
public class Ex12_11 {
    public static void main(String[] args) {
        Tank tank1 = new Tank();
        tank1.work();
        tank1.fire();
        tank1.shoot();
    }

}
