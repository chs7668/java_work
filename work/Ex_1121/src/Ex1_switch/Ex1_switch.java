package Ex1_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		//switch : 비교값과 조건값을 통해 결과를 출력하는 제어문
		/*
		 * switch(비교값){
		 * 		case 조건값:
		 * 			비교값과 조건값이 일치할 때 실행할 명령
		 * 		break;
		 * 		case 조건값:
		 * 			비교값과 조건값이 일치할 때 실행할 명령
		 * 		break;
		 * 		case 조건값:
		 * 			비교값과 조건값이 일치할 때 실행할 명령
		 * 		break;
		 * }
		 * */
		// 비교값과 조건값의 타입은 일치해야 한다.
		// 조건값은 중복될 수 없다.
		
		//특정 값을 바로 찾아들어가기 때문에 if문에 비해 처리속도가 빠르다.
		int n = 3;
		
		switch(n) {
		case 1:
			System.out.println("1. 게임하기");
			break; //switch를 빠져나오는 키워드
		case 2:
			System.out.println("2. 게임소개");
			break;
		case 3:
			System.out.println("3. 종료");
			break;
		default://비교값과 조건값이 하나도 일치하는게 없을 경우 실행
			System.out.println("잘못입력하셨습니다.");
			break;
		}
		
		int score = 80;
		
		/*
		 * switch(score) { case 100: System.out.println("성적은 A입니다."); break; case 99:
		 * System.out.println("성적은 A입니다."); break; case 98:
		 * System.out.println("성적은 A입니다."); break; case 97:
		 * System.out.println("성적은 A입니다."); break; case 96:
		 * System.out.println("성적은 A입니다."); break; case 95:
		 * System.out.println("성적은 A입니다."); break; case 94:
		 * System.out.println("성적은 A입니다."); break;
		 * 
		 * }
		 */
		
		//if문의 경우 범위를 지정해서 제어하는 데 유리하다.
		
		
		
		
		
		
		
		
	}
}
