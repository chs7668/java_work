package ex1_practice;

public class Ex2_practice {
	public static void main(String[] args) {
		for(int i=1; i<=2; i++) {
			for(int j=1; j<=5; j++) {
				if(j%2==0) {
					continue;  //if문 조건식에 맞는수를 제외할수도있다
				}
				System.out.printf("%d ",j);
			}
		}
		
		
		
	}

}
