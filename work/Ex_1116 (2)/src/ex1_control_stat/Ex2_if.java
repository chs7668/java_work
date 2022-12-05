package ex1_control_stat;

public class Ex2_if {
	public static void main(String[] args) {
		//if , else if , else
		/*
		 * if(조건식1){
		 * 	조건식1이 참일 때 실행할 명령
		 * } else if(조건식2){
		 * 	조건식1이 거짓이고 조건식2가 참일 때 실행할 명령
		 * }else if(조건식3){
		 * 	조건식1,2이 거짓이고 조건식3가 참일 때 실행할 명령
		 * }else if(조건식4){
		 * 	조건식1,2,3이 거짓이고 조건식4가 참일 때 실행할 명령
		 * } else {
		 * 	조건식1과 2가 모두 거짓일 때 실행할 명령
		 * }
		 * */
		
		int score = 59; //점수를 담을 변수를 70으로 초기화
		
		if(score > 100) {
			System.out.println("100이하의 점수를 입력해주세요");
		} else if(score >= 90) {
			System.out.println("성적은 A입니다.");
		} else if(score >= 80) {
			System.out.println("성적은 B입니다.");
		} else if(score >= 70) {
			System.out.println("성적은 C입니다.");
		} else if(score >= 60) {
			System.out.println("성적은 D입니다.");
		} else {
			System.out.println("성적은 F입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
