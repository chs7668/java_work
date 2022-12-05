package ex1_practice;

public class Ex3 {
	public static void main(String[] args) {
		//1. 변수 x가 10보다 크고 20보다 작을 때 변수 x를 출력하는 조건식을 완성하라
		
//		int x= 111;
//		if(x>10 && x<20) {
//			System.out.println(x);
//		}else {
//			System.out.println("10보다 작거나 20보다큽니다");
//		}

		//2. for문을 사용하여 0부터 10미만의 정수 중에서 짝수만을 작은 수부터 출력하시오.

//		for(int i=0; i<10; i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		//3. for문을 사용하여 0부터 10미만의 정수 중에서 짝수만을 작은 수부터 문자열로 출력하시오.
//		for(int i=0; i<10; i++) {
//			if(i%2==0) {
//				System.out.println(i+"");
//			}
//		}
		
		//4. for문을 사용하여 0부터 10미만의 정수 중에서 홀수만을 큰수부터 출력하시오.
//		for(int i=10; i>0; i--) {
//			if(i%2!=0) {
//				System.out.println(i);
//			}
//		}
		
		//5. while문을 사용하여 0 부터 10 미만의 정수 중에서 짝수만을 작은 수부터 출력하시오.
//		int n=0;
//		while(true) {
//			n++;
//			if(n>=10) {
//				break;
//			}
//			if(n%2==0) {
//				System.out.println(n);
//			}
//			
//		}
//		int a=0;
//		while(a<10) {
//			if(a%2==0) {
//				System.out.println(a);
//			}
//			a++;
//		}
		
		//6. while문을 사용하여 0 부터 10 미만의 정수 중에서 홀수만을 큰수부터 출력하시오.
//		int a=10;
//		while(a>0) {
//			if(a%2!=0) {
//				System.out.println(a);
//			}
//			a--;
//		}
		
		//7. for 문을 사용하여 0부터 10미만의 정수의 합을 출력하시오.
//		int sum=0;
//		for(int i=0; i<10; i++) {
//			System.out.printf("0부터 %d미만의 정수의합 : %d\n",i,sum);
//			sum+=i;
//		}
//		System.out.println("0부터 10미만의 정수의합 : "+sum);

		//8. 1부터 20 미만의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합을 구하시오.
//		int sum=0;
//		for(int i=0; i<20; i++) {
//			if(i%2==0 || i%3==0) {
//				continue;
//			}
//			sum+=i;
//		}
//		System.out.println("1부터 20 미만의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합 : "+sum);
//		int sum2=0;
//		for(int i=0; i<20; i++) {
//			if(i%2!=0 && i%3!=0) {
//				sum2+=i;
//			}
//		}
//		System.out.println("1부터 20 미만의 정수 중에서 2 또는 3의 배수가 아닌 수의 총합 : "+sum2);
		
		//9. 1부터 20 미만의 정수 중에서 2 또는 3의 배수인 수의 총합을 구하시오.
//		int sum=0;
//		for(int i=0; i<20; i++) {
//			if(i%2==0 || i%3==0) {
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
		
		//10. 두 개의 주사위를 던졌을 때, 눈의 합이 6이 되는 모든 경우의 수를 출력하시오.
//		for(int i=1; i<=6; i++) {
//			for(int j=1; j<=6; j++) {
//				if(i+j==6) {
//					System.out.printf("%d+%d=6\n",i,j);
//				}
//			}
//		}
		
		//11. 삼각형 출력하기 - pattern 1
		// 높이(line)가 5
		//*
		//**
		//***
		//****
		//*****
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//12. 삼각형 출력하기 - pattern 2
		//*****
		//****
		//***
		//**
		//*
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=(5-i)+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//13. 삼각형 출력하기 - pattern 3
		//*****
		// ****
		//  ***
		//   **
		//    *
//		for(int i=1; i<=5; i++) {
//			for(int k=1; k<i; k++) {        //for문1
//				System.out.print(" ");
//			}	
//			for(int j=1; j<=(5-i)+1; j++) { //for문2
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//별찍는 for문과 공백for문 2개쓰기 그리고 그두개를 5번쓰는 상위 for문
		//상위for문 for문1+for문2
		//상위for문 for문1+for문2
		//상위for문 for문1+for문2
		//상위for문 for문1+for문2
		//상위for문 for문1+for문2
		
		//문제1. arr 배열 중에서 인덱스가 1인 곳의 값을 출력해보자.    정답) 20
		  int[] arr = { 10, 20, 30, 50, 3, 60, -3 };
		  System.out.println(arr[1]);
		
		
	
		
		
	}

}
