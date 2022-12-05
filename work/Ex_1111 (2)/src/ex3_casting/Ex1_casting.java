package ex3_casting;

public class Ex1_casting {
	public static void main(String[] args) {
		//형변환(캐스팅)
		//1. 프로모션(자동형변환, 암시적 형변환)
		//- 작은 자료형에 큰 자료형을 대입하는 것(자동으로 바뀜)
		double d = 100.5; //8byte
		int n = 200; //4byte
		
		d = n;
		System.out.println("d= " + d);
		
		char ch = 'A';
		long l = 100; //8byte
		
		l = ch;
		
		System.out.println("l= " + l);
		
		//2. 디모션(강제형변환, 명시적형변환)
		//- 큰 자료형의 값을 작은 자료형에 대입하는 것(자동으로 이루어지지 않습니다.)
		char c = 'B'; //2byte
		int n1 = c + 1;
		
		c = (char)n1; //c는 2byte, n1 4byte
		System.out.println("c= " + c);
		
		float f = 5.5f; //4.xx byte
		int n2 = 0; //4byte
		
		n2 = (int)f; //실수 -> 정수로 형변환을 할 시 소수점 아래 숫자가 유실될 수 있습니다.
		System.out.println("n2= " +n2);
		
		byte b1 = 100;
		byte b2 = 20;
		//byte b3 = b1 + b2;
		int b4 = b1 + b2;
		//byte의 표현 범위가 127까지 밖에 되지 않다보니, byte끼리의 연산은 127을 넘어버릴
		//가능성이 높습니다. 이런 상황을 대비하여 java개발자들은 byte끼리의 연산이 수행될 때
		//int형으로 값을 받도록 만듦
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
