package ex2_array;

public class Ex1_array {
	public static void main(String[] args) {
		//배열(array) : 같은 자료형끼리 데이터를 모아둔 하나의 묶음
		//데이터의 효율적인 관리를 위해서 반드시 필요
		
		//정수형 변수-> 여러개가 필요하면 변수를 많이 만들어아 합니다
		int su1 = 1;
		int su2 = 2;
		int su3 = 3;
		int su4 = 4;
		
		//편하게 자원들을 관리하고 제어하기 위해서는
		//다음과 같은 배열을 생성한다
		//1) 배열 선언
		//자료형 [] 배열명;
		int[] ar;
		//2) 배열 생성
		ar = new int[4];
		//3) 배열 초기화
		int[]arr= {100,200,300,400};//초기화시 중괄호{} 넣은 데이터 개수 만큼
		//4) 생성 후 대입
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 300;
		ar[3] = 400;
		
		//배열의 출력
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println("---------------------");
		//배열의 출력2
		for(int i=0; i<4; i++) {
			
			System.out.println(ar[i]);
		}
		
		
//		ar[i] = i+4;
		
		
	}

}
