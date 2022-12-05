package ex2_break;

public class Ex1_break {
	public static void main(String[] args) {
		//break문 : 반복문 내에서 break문을 만나게 되면 가장가까운 반복문을 빠져나갈 때 사용합니다.
		
		//1)break 문 밑에는 다른 문장이 올 수 없다.
		//2)break 문은 반복문 안에서만 사용할 수 있다.
		
		for(int i = 1; i <=2;i++) {
			for(int j = 1; j<=5; j++) {
				if(j % 2 == 0) {
					break;
					
				}
				System.out.printf("%d ",j);
			}
			System.out.println();
		}
	}
}
