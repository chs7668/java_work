package ex1_control_stat;

public class Ex2_if {

	public static void main(String[] args) {
		//if - else if , else
		/*
		 * if(조건식1){
		 * 조건식1이 참일 때 실행할 명령
		 * } else if (조건식2){
		 * 조건식1이 거짓이고 조건식2가 참일 때 실행할 명령
		 * } else if (조건식3){
		 * 조건식1,2이 거짓이고 조건식3가 참일 때 실행할 명령
		 * } else {
		 * 모든 조건식이 거짓일경우 실행할 명령
		 * }
		 */
		
		int score = 70;
		
		if(score > 100) {
			System.out.println("100이하의 점수를 입력해주세요");
		} else if (score>=90) {
			System.out.println("성적은 A입니다.");
		} else if (score>=80) {
			System.out.println("성적은 B입니다.");
		} else if (score>=70) {
			System.out.println("성적은 C입니다.");
		} else if (score>=60) {
			System.out.println("성적은 D입니다.");
		} else {
			System.out.println("성적은 F입니다.");
		}
		
		
		
		
		
		
		
		
	}

}
