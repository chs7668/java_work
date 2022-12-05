package ex1_control_stat;

public class Ex1_single_for {
	public static void main(String[] args) {
		//제어문:프로그램의 흐름을 제어하는 문장
		// - 조건문 : if ,switch
		// - 반복문 : while, for
		
		// for : 특정 수행문을 원하는만큼 반복하는 문장
		// for(초기식(변수); 조건식(초과,미만,이상,이하); 증감식(주로후행사용){
		// 	조건식이 참일때 반복할 명령
		//}
		
		int num = 1;
		//1~3까지 출력하기
		for(int i=1; i<=3; i++) {
			System.out.println(num);
			num*=2;
		}
		
		for(int i=1; i<=3; i++) {
			System.out.println(i);
		}
		System.out.println("-------------------------------");
		//1~10까지 출력하는 for문 작성하기
		for(int i=0; i<10;  i++) {
			System.out.println(i+1);
		}
		System.out.println("------------------");
		//10부터 1까지 거꾸로 출력하는 for문 작성하기
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
		
		//1. 반복문은 몇번을 반복할건지 확실하게 정하기
		//2, 지역변수(초기식 i)를 사용할 수 있으면 사용하기
		System.out.println("----------------");
		//1~5까지 총 합
		int sum=0;
		for(int i = 1; i<=5; i++) {
			sum+=i;
		}
		
		System.out.println(sum);
		
		System.out.println("------------------");
		//정수형 변수n에 임의의 정수를 하나 대입하고 1~n까지 총 합을  for문을 통해 출력하기
		int sum2 = 0;
		int n = 7;
		for(int i=1; i<=n; i++) {
			sum2+=i;
		}
		System.out.println("1부터"+n+"까지의 합은"+sum2+"입니다");
		
		//정수형 변수 dan 에다 2~9사이의 정수를받고
		//해당 구구단을  for문을 이용하여 출력하세요
		
		int dan = 7;
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		
		//1~10까지 반복하는 문장에서 3의 배수만 출력하는 for문을 작성해보세요.
		//출력결과 3,6,9
		for(int i = 1; i<=10; i++) {
			if(i%3==0) {
			System.out.println(i);	
			}
			
		}
		
		System.out.println("----------------------");
		
		//1~20까지 홀수만 출력하는 for문 작성하기
		for(int i=1; i<=20; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
