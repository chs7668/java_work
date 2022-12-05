package ex1_control_stat;

import java.util.Scanner;
import java.util.Formatter;

public class Ex3_multi_for {
	public static void main(String[] args) {
		//중첩 for문 : for문 안에 for문이 포함되어 있는 경우
		/*
		 * for(초기식;조건식;증감식){
		 * 		for(초기식;조건식;증감식){
		 * 			조건이 참일 때 반복할 명령
		 * 		}//inner for
		 * }//outer for
		 * */
		
		//2중 for문의 경우 해결해야 할 문제가 두 개 일 때 사용합니다.
		
		//구구단
		for(int i = 2; i<=9; i++) {
			for(int j = 2; j<=9; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
		}
		
		
		//1 2
		//1 2
		
		for(int i = 1; i <=2; i++) {
			for(int j = 1; j<=2; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		// 1 1 1 1
		// 1 1 1 1
		// 1 1 1 1
		// 1 1 1 1
		
		for(int i = 0; i<4; i++) {
			for(int j = 0; j <4; j++) {
				System.out.print(1+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		// A B C D
		// A B C D
		// A B C D
		// A B C D
		int a = 64;
		for(int i=1; i<5; i++) {
			for(int j = 1; j<5; j++) {
				System.out.print((char)(a+j)+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		for(int i=1; i<=4; i++) {
			for(char j='A'; j<='D'; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//문제3. 0부터 10까지 모두 더한 값을 출력해보자.
		int sum=0;
		for(int i=0; i<=10; i++) {
			sum+=i;
		}
		System.out.println("1부터10까지더한 총합="+sum);
		
		System.out.println("-------------------------------");
		//문제4. 숫자를 5번 입력받고, 입력받을 때마다 더해지는 식을 작성해보자.
		/*
	    ex. 숫자를 입력하세요: 5	출력: 5
	   숫자를 입력하세요: 6	출력: 11
	   숫자를 입력하세요: 3	출력: 14
	   숫자를 입력하세요: 2	출력: 16
	   숫자를 입력하세요: 4	출력: 20
	    */
		
		/*
		Scanner scanner=new Scanner(System.in);
		int sum2=0;
		for(int i=0; i<5; i++) {
			System.out.print("숫자를 입력하세요:");
			int num=scanner.nextInt();
			sum2+=num;
			System.out.println(sum2);
		}
		*/
		
	
	   System.out.println("-------------------------");
	   //문제5. 0부터 20까지 짝수만 출력해보자.
	   for(int i=0; i<=20; i++) {
		   if(i%2==0) {
			   System.out.println(i);

		   }
		   
	   }
	   System.out.println("--------------------------");
	   
	   //문제1. 사용자로부터 숫자 한개를 입력받아 1부터 그 숫자까지의 합을 구해보자.
	   //ex) 입력받은 숫자 : 5              
	   //1부터 5까지의 합 : 15
	   /*
	   Scanner scanner=new Scanner(System.in);
	   int sum3=0;
	   System.out.print("숫자를 입력하세요:");
	   int num3=scanner.nextInt();
	   
	   for(int i=1; i<=num3; i++) {
		   sum3+=i;
	   }
	   System.out.println("1부터 "+num3+"까지의 합:"+(sum3));
	   */
	   
	   //문제2. 주민등록번호를 입력받아 남성 또는 여성 판단해보자.
	   //1900년대 태어난 남자 1    /    2000년대 태어난 남자 3
	   //1900년대 태어난 여자 2    /    2000년대 태어난 여자 4
	   /*Scanner scanner=new Scanner(System.in);
	   System.out.print("주민등록번호 뒷자리 첫번째자리를 입력해주세요:");
	   int num4=scanner.nextInt();
	   switch(num4) {
	   case 1: case 3:
		   System.out.println("주민등록번호: xxxxxx-"+num4+"xxxxxx:남자입니다");
		   break;
	   case 2: case 4:
		   System.out.println("주민등록번호: xxxxxx-"+num4+"xxxxxx:여자입니다");
		   break;
	   default:
	   System.out.println("잘못입력하셨습니다");
	   }
	   */
	   //문제3. 영희가 은행에 500원(원금)을 입금했다. 
	   //하루에 1원씩 이자가 붙는다. 5일 후(일수) 잔액은 얼마가 되어 있을까?
	   /*int money=500;
	   for(int i=0; i<5; i++) {
		   money++;
	   }
	   System.out.println("5일후 잔액:"+money);
	   */
	   //문제4. 위의 문제에서 원금과 예치 일수를 입력받아 처리해보자.
	   Scanner scanner=new Scanner(System.in);
	   System.out.print("원금을 입력하세요:");
	   int money2=scanner.nextInt();
	   System.out.print("예치 일수를 입력하세요:");
	   int day=scanner.nextInt();
	   for(int i=0; i<day; i++) {
		   money2++;
	   }
	   System.out.println(money2);
	   System.out.printf("%d일후 잔액:%d",day,money2);
	   scanner.close();
	   
	   
	
	   
	   
		
		
		
		
		
		
		
	}
}
