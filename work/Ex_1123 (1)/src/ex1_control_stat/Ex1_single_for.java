package ex1_control_stat;

public class Ex1_single_for {
	public static void main(String[] args) {
		//제어문 : 프로그램의 흐름을 제어하는 문장
		// - 조건문 : if, switch
		// - 반복문 : while, for
		
		// for : 특정 수행문을 원하는만큼 반복하는 문장
		// for(초기식(변수); 조건식(초과,미만,이상,이하); 증감식(후행)){
		//	 조건식이 참일 때 반복할 명령
		//}
		
		//1~3까지 출력하기 System.out.println(); -> 출력문 반복 작성
		
		for(int i = 0; i <= 2; i++) {
			
			System.out.println(i+1);
			
		}
		System.out.println("---------------------");
		//1~10까지 출력하는 for문 작성하기
		for(int i = 1; i <=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("---------------------");
		//10부터 1까지 거꾸로 출력하는 for문 작성하기
		int number2 = 10;
		for(int i = 0; i <= 9; i++) {
			System.out.println(number2);
			number2--;
		}
		
		//1. 내가 몇번을 반복할건지 확실하게 정하기 
		//2. 지역변수(초기식 i)를 사용할 수 있으면 사용하기 (사용해도 되고 안해도 되고)
		
		System.out.println("------------------------");
		
		//1~5까지 총 합을 for문을 통해 출력하기
		int sum = 0; //총 합을 담을 변수
		
		for(int i = 1; i<=5; i++) {
			sum += i; //sum = sum + i
		}
		
		System.out.println("1~5까지의 총 합 : " + sum);
		
		System.out.println("------------------------");
		//정수형 변수 n 에 임의의 정수를 하나 대입하고
		//1~n까지 총 합을 for문을 통해 출력하기
		int n = 3;
		int total = 0; //1~n까지의 총 합을 담아줄 변수
		
		for(int i = 1; i <= n; i++) {
			total += i; //total = total + i
		}
		System.out.println("1~"+n+"까지의 합 : " + total);
		System.out.println("------------------------");
		//정수형 변수 dan 에다 2~9 사이의 정수를 받고
		//해당 구구단을 for문을 이용하여 출력하세요.
		//출력결과
		//2
		//4
		//6
		//8
		//10
		//12
		//14
		//16
		//18
		
		int dan = 5; //구구단 2~9 *연산을 8번 해야된다.
		for(int i = 2; i<=9; i++) {
			System.out.println(dan +"x"+ i+"="+(dan*i));
		}
		
		System.out.println("------------------------");
		//1~10까지 반복하는 문장에서 3의 배수만 출력하는 for문을 작성해보세요.
		//출력결과
		//3
		//6
		//9
		
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("------------------------");
		
		//1~20까지 홀수만 출력하는 for문 작성하기
		for(int i = 1; i<=20; i++) {
			if(i % 2 !=0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
