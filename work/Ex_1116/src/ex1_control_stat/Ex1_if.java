package ex1_control_stat;

public class Ex1_if {
	public static void main(String[] args) {
		/*
		 * 제어문 : 프로그램의 흐름을 제어하는 문장
		 * 제어문은 조건문과 반복문으로 나눈다
		 * 조건문:if,switch
		 * 반복문:while,for
		 */
		
		//if문의 구조
		/*
		 * if(조건식){
		 * 		조건식이 참일 때 실행할 명령
		 * }
		 */
		//null : 어떠한 값으로도 초기화 되지 않은 상태, 내가 만들어서 사용할 예정이다 라는걸
		//컴파일러(jvm)에게 알려주는 용도의 키워드 이다.
		int n = 30;
		String str = null;
		
		if(n<100) {
			str = "n은 100보다 작습니다";
		}else if(n>100) {
			str = "n은 100보다 크다";
		}
		System.out.println(str);
		
		if(n%2 == 0) { //짝수,홀수 구할때
			System.out.println(n+"은 짝수입니다");
		}
		
		if(n % 5 == 0) {//n의 배수를 구할때
			System.out.println(n+"은 5의배수입니다");
		}
		
		System.out.println("-------------------");
		
		
		//if - else
		/*
		 * if(조건식){
		 * 		조건식이 참일때 실행할명령
		 * } else {
		 * 		조건식이 거짓일 때 실행할 명령
		 * }
		 */
		
		int i = 50;
		String str2 = null;
		
		if(i>100) {
			str2 = "i는 100보다 큽니다";
		}else {
			str2 = "i는 100보다 작습니다";
		} System.out.println(str2);
		
		System.out.println("-----------------------------");
		/*
		 * 변수 age에 나이를 대입하고, 30세 이상이면
		 * "30살 이상입니다. 라고 출력하고, 그렇지 않으면 "나이를 더 드셔야 겠네요"라고 출력하는
		 * if-else문을 구현한 후 마지막으로 "감사합니다"라는 문장을 출력하세요.
		 */
		
		
		int age = 32;
		String str3 = null;
		if(age>=30) {
			str3 = "30살 이상입니다.";
		}else {
			str3 = "나이를 더 드셔야 겠네요.";
		}
		System.out.println(str3);
		System.out.println("감사합니다.");
		
		String old = null;
		old = age >= 30 ? "30살 이상입니다" : "나이를 더 드셔야 겠네요.";
		System.out.println(old);
		
		
	}

}
