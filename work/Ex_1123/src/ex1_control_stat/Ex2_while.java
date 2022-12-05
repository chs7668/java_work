package ex1_control_stat;

import java.util.Random;

public class Ex2_while {
	public static void main(String[] args) {
		//while : for문 보다는 간결한 문법을 지닌 반복문(선비교,후처리)
		//구조
		//while(조건식){
		// 조건식이 참 일 동안 반복할 명령
		//}
		int num = 3;
		while(num<5) {
			System.out.println("A");
			num++;
		}
		//while문 작성 요령
		//시작값을 갖는 변수 생성하기
		//몇번 반복할지 횟수를 정해준다.(조건식)
		//반복문이 종료될 수 있도록 시작값에 변화를 줘야한다 
		System.out.println("-----------------------");
		
		//do - while문 : 선처리 후 비교
		//제어문 중 유일하게 마지막에 ;을 가진다
		//구조
		//do{
		// 조건이 참일 동안 반복할 명령
		//}while(조건식);
		int n = 11;
		
		do {//조건이 맞지 않아도 무조건 한번은 실행 한다
			System.out.println(n);
		}while(n<=10);
		
		//for vs while
		//for문은 내가 반복하고자 하는 횟수를 정확하게 알 때
		//while문은 반복하고자 하는 횟수가 정확하지 않을 때도 사용
		
		//난수생성하기
		System.out.println("-----------------------");
		int random = new Random().nextInt(8)+2;
		
		while(random !=7) {
			System.out.println(random);
			random = new Random().nextInt(8)+2;
		}
		
		
		
		
		
		
	}

}
