import java.util.Scanner;

//배열을 활용한 큐
public class Prob08_03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] queue = new int[5];
		int rear = 0;
		char carName = 'A';
		int select = 9;
		while (select != 3) {
			System.out.printf("<1> 자동차 넣기 <2> 자동차 빼기 <3> 끝 : ");
			select = s.nextInt();
			switch (select) {
			case 1:
				if (rear >= 5) {
					System.out.printf("터널이 꽉 찼습니다.\n");
				} else {
					queue[rear] = carName;
					System.out.printf(" %c 자동차가 터널에 들어감 \n", queue[rear]);
					rear++;
					carName++;

				}
				break;
			case 2:
				if (rear <= 0) {
					System.out.printf("터널에 차가 없습니다\n");
				} else {
					rear--;
					System.out.printf(" %c 자동차가 터널에서 빠짐 \n", queue[0]);
					for (int i = 0; i < rear; i++) {
						queue[i] = queue[i + 1];
					}

				}
				break;
			case 3:
				System.out.printf("현재 터널에 %d대 있음\n", rear);
				System.out.printf("프로그램을 종료합니다\n");
				break;
			default:
				System.out.printf("잘못 입력했습니다. 다시 입력하세요 \n");

			}
		}

	}

}
