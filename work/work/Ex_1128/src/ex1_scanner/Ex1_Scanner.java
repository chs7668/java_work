package ex1_scanner;

import java.util.Scanner;

public class Ex1_Scanner {
	public static void main(String[] args) {
		//Scanner 클래스 : 키보드에서 값을 직접 입력받아 변수에 저장할 수 있도록 하는 클래스
		Scanner sc = new Scanner(System.in);//scanner 정의
		
		//키보드에서 int타입의 값을 입력받고 엔터를 치는 순간
		//num변수에 사용자가 입력받은 값을 대입해 준다.
//		System.out.print("정수를 입력해 주세요 : ");
//		int num = sc.nextInt();
//		System.out.println(num);
//		
//		System.out.print("문자열을 입력해 주세요 : ");
//		String str = sc.next();
//		System.out.println(str);
		
		//키보드에서 이름,나이를 입력받고 출력해보기
		
		//출력결과
		//이름 : ooo
		//나이 : oo
		
//		String name;
//		int age;
//		
//		System.out.print("이름을 입력해 주세요 : ");
//		name = sc.next();
//		System.out.print("나이를 입력해 주세요 : ");
//		age = sc.nextInt();
//		
//		System.out.printf("이름 : %s\n",name);
//		System.out.printf("나이 : %d\n",age);
		
		//키보드에서 값을 입력받고, 입력받은 수에 해당하는 구구단을 출력해보세요.
		//2~9 이외의 숫자를 입력할 시 "2~9 사이의 숫자만 입력하세요" 라고 출력하기
//		while(true) {
//			System.out.print("단을 입력해 주세요 : ");
//			int dan = sc.nextInt();
//			
//			if(dan < 2 || dan > 9) {
//				System.out.println("2~9사이의 숫자만 입력하세요");
//			} else {
//				for(int i = 1; i <=9; i++) {
//					System.out.printf("%d X %d = %d\n", dan, i, dan*i);
//				}
//				break;
//			}
//		}
		
		//Scanner를 통해서 정수 n을 입력받는다.
		//그리고 1부터 입력받은 정수 n까지의 총합을 계산하여 그 결과를 출력하는 프로그램을 작성하세요.
		//예를들어 정수 5를 입력받으면 1 + 2 + 3+ 4 + 5 의 연산결과인 15를 출력해야 한다.
		
		//출력결과
		//총합 : 15
		System.out.print("정수를 입력해 주세요 : ");
		int n = sc.nextInt();
		int total = 0;
		for(int i = 1; i <=n; i++) {
			total += i;
		}
		System.out.printf("1부터 %d까지의 합은 %d입니다.",n,total);
		
		
		
		
		
	}
}
