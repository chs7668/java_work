package Ex1_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		//switch : 비교값과 조건값을 통해 결과를 출력하는 제어문
		/*
		 * switch(비교값){
		 * 		case 조건값:
		 * 			비교값과 조건값이 일치할 떄 실행할 명령
		 * 		break;
		 * 		case 조건값:
		 * 			비교값과 조건값이 일치할 떄 실행할 명령
		 * 		break;
		 * 		case 조건값:
		 * 			비교값과 조건값이 일치할 떄 실행할 명령
		 * 		break;
		 */
		//비교값과 조건값의 타입은 같을수없다
		//조건값은 중복될수 없다
		//switch문이 if문보다 속도가 더 빠르다
		int n = 1;
		
		switch(n) {
		case 1: System.out.println("1. 게임하기");
		break; //switch를 빠져나오는 키워드
		case 2: System.out.println("2. 게임소개");
		break;
		case 3: System.out.println("3. 종료");
		break;
		default: //비교값과 조건값이 하나도 일치하는게 없을 경우 실행
			System.out.println("잘못입력하셨습니다");
			break;
		}
				
	
	
	
	}
}
