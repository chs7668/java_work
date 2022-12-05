package ex1_scanner;

import java.util.Scanner;

public class Ex1_Scanner {
	public static void main(String[] args) {
		//Scanner 클래스 : 키보드에서 값을 직접 입력받아 변수에 저장할 수 있도록 하는 클래스
		Scanner sc =new Scanner(System.in); //scanner 정의
		
		//키보드에서 int타입의 값을 입력받고 엔터를 치는 순간
		//num변수에 사용자가 입력받은 값을 대입해 준다.
//		System.out.print("정수를 입력해주세요:");
//		int num=sc.nextInt();
//		System.out.println(num);
//		System.out.print("문자열을 입력해주세요:");
//		String str = sc.next();
//		System.out.println(str);
		
		//키보드에서 이름,나이를 입력받고 출력해보기
		//출력결과
		//이름: ooo
		//나이: oo
		
//		System.out.print("이름을 입력해주세요 : ");
//		String name=sc.next();
//		System.out.print("나이를 입력해주세요 : ");
//		int age = sc.nextInt();
//		System.out.println("이름 : "+name);
//		System.out.println("나이 : "+age+"살");
		
		//키보드에서 값을 입력받고, 입력받은 수에 해당하는 구구단을 출력해보세요.
		//2~9 이외의 숫자를 입력할시 "2~9사이의 숫자만 입력하세요" 라고 출력하기
//		System.out.print("단을 입력하세요 : ");
//		int dan= sc.nextInt();
//		if(dan >= 2 && dan <= 9) {
//			for(int i=1; i<=9; i++) {
//				System.out.printf("%d X %d = %d\n",dan,i,dan*i);
//			}
//			
//		}else {
//			System.out.println("2~9사이의 숫자만 입력하세요");
//		}
//		System.out.print("첫번째 숫자를입력하세요 : ");
//		int num1=sc.nextInt();
//		if(num1<2 || num1>9) {
//			System.out.println("2~9사이의 숫자만 입력하세요");
//		}
//		System.out.print("두번째 숫자를 입력하세요 : ");
//		int num2=sc.nextInt();
//		if(num2<2 || num2>9) {
//			System.out.println("2~9사이의 숫자만 입력하세요");
//		}
//		int sum=num1*num2;
//		System.out.printf("%d*%d=%d",num1,num2,sum);
		
//		System.out.print("첫번째 숫자를입력하세요 : ");
//		int num1=sc.nextInt();
//		System.out.print("두번째 숫자를 입력하세요 : ");
//		int num2=sc.nextInt();
//		if(num1 >= 2 && num1 <= 9 && num2 >= 2 && num2<=9) {
//			System.out.printf("%d x %d = %d",num1,num2,(num1*num2));
//		}else {
//			System.out.println("2~9사이의 숫자만 입력하세요");
//		}
		System.out.println("------------------------------------");
		
		//Scanner를 통해서 정수 n을 입력받는다.
		//그리고 1부터 입력받은 정수 n까지의 총합을 계산하여 그 결과를 출력하는 프로그램을 작성하세요
		//예를들어 정수 5를 입력받으면 1+2+3+4+5의 연산결과인 15를 출력
		int sum=0;
		System.out.print("정수를 입력하세요 : ");
		int n =sc.nextInt();
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.printf("1부터 %d까지의 총합은 : %d\n",n,sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
