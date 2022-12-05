package ex3_casting;

public class Ex1_casting {
	public static void main(String[] args) {
		//형변환(캐스팅)
		//1. 프로모션(자동형변환)
		//-작은 자료형에 큰 자료형을 대입하는것(자동으로 바뀜)
		double d = 100.5;
		int n = 200;
		d=n;
		System.out.println("d="+d);
		
		char ch = 'A'; //2byte
		long l = 100;  //8byte
		l = ch;		   //
		System.out.println("l은="+l);
		
		//2. 디모션(강제형변환,명시적형변환)
		//-큰 자료형의 값을 작은 자료형에 대입하는것(자동으로 이루어지지 않습니다.)
		char c = 'B';
		int n1 = c+1;
		c = (char)n1; //int n1을 char n1으로 형변환
		System.out.println("c="+c); //'B'는 아스키코드로 66
		
		float f = 5.5f; // float는 4.xx byte
		int n2 = 0;		// int는 4byte로 int가 작다
		
		n2 = (int)f;   //실수에서 ->정수로 형변화을 할시 소수점 아래 숫자가 유실될 수 있다
		System.out.println("n2="+n2);
		
		byte b1= 100;
		byte b2= 20;
//		byte b3= b1+b2; //byte 끼리의 연산이 수행될 때 int형으로 값을 받도록 만듦
		int  b4= b1+b2;
		
		
	}
	
	
	
	
}
