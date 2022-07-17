//로또 숫자 자동 추첨
public class Prob09_03 {

	static short rand() {
		return (short) (Math.random() * 45 + 1);
	}

	public static void main(String[] args) {
		System.out.printf("** 로또 추첨을 시작합니다. **\n\n");
		System.out.printf("추첨된 로또번호 ==> ");
		int num[] = new int[6];
		char dupl='N';
		int n;
		
		for (int i = 0; i < 6;) {
			n = rand();
			
			for(int k=0;k<6;k++)
				if(num[k]==n)
					dupl='Y';
			
			if(dupl=='N')
				num[i++]=n;
			else
				dupl='N';
		}
		
	
		for (int i = 0; i < 6; i++) {
			System.out.printf(" %d ", num[i]);
		}

	}

}
