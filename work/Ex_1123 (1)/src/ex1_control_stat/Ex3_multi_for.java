package ex1_control_stat;

public class Ex3_multi_for {
	public static void main(String[] args) {
		//중첩 for문 : for문 안에 for문이 포함되어 있는 경우
		/*
		 * for(초기식;조건식;증감식){
		 * 		for(초기식;조건식;증감식){
		 * 			조건이 참일 때 반복할 명령
		 * 		}//inner for
		 * }//outer for
		 * */
		
		//2중 for문의 경우 해결해야 할 문제가 두 개 일 때 사용합니다.
		
		//구구단
		for(int i = 2; i<=9; i++) {
			for(int j = 2; j<=9; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
		}
		
		
		//1 2
		//1 2
		
		for(int i = 1; i <=2; i++) {
			for(int j = 1; j<=2; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		// 1 1 1 1
		// 1 1 1 1
		// 1 1 1 1
		// 1 1 1 1
		
		for(int i = 0; i<4; i++) {
			for(int j = 0; j <4; j++) {
				System.out.print(1+" ");
			}
			System.out.println();
		}
		
		// A B C D
		// A B C D
		// A B C D
		// A B C D
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
