package ex2_valueType;

public class Ex_valueType {
	public static void main(String[] args) {
		boolean b1 = true;
		System.out.println("b1의 값="+b1);
		b1=false;
		
		//문자형 변수
		char ch = 'a'; //자료형 변수명 = '문자'
		System.out.println("문자 ch의값="+ch);
		
		//정수형 변수
		byte b = 127;	//byte자료형의 표현범위 (-128~127)
		System.out.println(b);
		
		//실수형 변수
		float f = 3.14159265f;
		System.out.println("f의 값="+f);
		double d = 3.14159265;
		System.out.println("d의 값="+d);
	}
	
}
/*
 * 정수형:소수점이 없는 숫자(-1,0,1)
 * -byte  1byte	-128~ 127
 * -short 2byte	-32,768 ~ 32,767
 * -int	 4byte	-21억~21억
 * -long	 8byte	-900경~900경
 * 
 * 문자형:한글자
 * -char 1byte
 * 
 * 실수형:소수점이 있는 숫자
 * -float 4byte
 * -double 8byte
 * 
 * 논리형:boolen 1bit
 * 
 * 변수
 * 자료형 변수명; ->변수의 선언
 */