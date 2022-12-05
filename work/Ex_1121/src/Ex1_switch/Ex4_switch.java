package Ex1_switch;

import java.util.Scanner;

public class Ex4_switch {
	public static void main(String[] args) {
		//달을 담는 정수형 변수 month를 하나 만들고
		//해당 달이 몇일까지 있는지 switch문을 이용해서 작성하세요
		//ex) 4월 한달은 00일 입니다. 2월은 00일 입니다.
		
		int month = 1;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month+"월은 31일입니다"); break;
		case 2: System.out.println(month+"월은 28일 입니다"); break;
		case 4: case 6: case 9: case 11:
			System.out.println(month+"월은 30일 까지 있습니다");
			break;
		}
		
		System.out.println("----------------------------");
		
		//두개의 정수를 초기화 하고 (숫자는 맘대로)
		//연산자(+,-,*,/) 하나를 저장하는 변수를 초기화 하고 switch문으로
		//정수를 연산하는 코드를 작성해보자.
		// 출력결과 : 5 + 7 = 12
		Scanner scanner = new Scanner(System.in);
		int a = 10;
		int b = 2;
		char ch = '+';
		
		switch(ch) {
		case '+': 
			System.out.println(a+"+"+b+"="+(a+b)); 
			break;
		case '-': 
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case '*': 
			System.out.println(a+"*"+b+"="+(a*b));
			break;
		case '/': 
			System.out.println(a+"/"+b+"="+(a/b));
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
