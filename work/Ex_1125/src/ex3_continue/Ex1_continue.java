package ex3_continue;

public class Ex1_continue {
	public static void main(String[] args) {
		//continue문 : 반복문내에서 continue문을 만나면 가장 가까이 있는 반복문의 증감식으로 올라갑니다.
		for(int i = 1; i<=2; i++) {
			for(int j = 1; j<=5;j++) {
				if(j % 2 ==0) {
					continue;
				}
				
				System.out.printf("%d ",j);
			}
			System.out.println();
		}
	}
}
