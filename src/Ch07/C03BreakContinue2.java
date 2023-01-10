package Ch07;

public class C03BreakContinue2 {
	public static void main(String[] args) {
		
		int dan = 2;
		int i = 1;
		boolean flag = false;
		while(dan <= 9) {
			
			i=1;
			while( i<= 9) {
				System.out.printf("%d x %d = %d\n", dan, i, dan*i);
				
				// 7 * 7 에서 잠시 멈추고 다시 while문으로 들어감
				if(dan==7 && i ==7 ) {
					flag = true;
					break;
				}
				i++;				
			}
			System.out.println();
			
			//여기서 멈추고싶다면 조건을 다시 걸면된다, flag라는 boolean 변수를 하나 만들고 위에서 true값으로 받은 후 여기서 flag의 값이
			//true일 경우 멈추는 조건식을 달아주면 됨
			if(flag) {
				break;
			}
			
			dan++;
		}
		
		
		
		/**
		 * continue
		 * 반복 조건식으로 이동
		 */
		int j = 1;
		int sum2 = 0;
		while( j <= 10 ) {
			if(j%3==0) {
				j++;
				continue;	//근접한 반복문의 조건식으로 돌아감
			}
			System.out.println("j= " + j);
			sum2 += j;
			j++;
		}
		System.out.println("SUM = " + sum2);
		
		
	}
}
