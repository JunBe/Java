class Book{
    Book(){
        System.out.println("Book 클래스 생성자~~ (파라미터 없음)");
    }
    Book(String str){
        this();
        System.out.println("Book 클래스 생성자 --> "+str);
    }
}

class ComputerBook extends Book{
    ComputerBook(String str){
        super(str);
        System.out.println("ComputerBook 클래스 생성자~~");
    }
}
public class dasd {
    public static void main(String[] args){
        ComputerBook sedan1 = new ComputerBook("굿 자바");
    }
}
