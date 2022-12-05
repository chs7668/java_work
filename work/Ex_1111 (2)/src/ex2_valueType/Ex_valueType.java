package ex2_valueType;

public class Ex_valueType {
	public static void main(String[] args) {
		/*
		 * 정수형 : 소수점이 없는 숫자 ( -1, 0 , 1)
		 * - byte 1byte - -128 ~ 127
		 * - short 2byte - -32,768 ~ 32,767
		 * - int 4byte - -21억 ~ 21억 -> 일반적으로 많이쓰는 자료형
		 * - long 8byte - -900경 ~ 900경 -> 금융권, 증권가
		 * 
		 * 문자형 : 한글자
		 * - char 2byte
		 * 
		 * 실수형 : 소수점이 있는 숫자
		 * - float 4byte
		 * - double 8byte
		 * 
		 * 논리형 : boolen 1bit
		 * 
		 * 변수
		 * 
		 * 자료형 변수명; -> 변수의 선언
		 * 변수명 = 데이터; -> 변수의 대입
		 * 자료형 변수명 = 데이터; -> 변수의 초기화 (선언과 대입을 동시에)
		 * 
		 * 변수명선언 규칙
		 * 
		 * 1. 맨앞에 숫자가 들어가면 안된다.
		 * 2. _를 제외하고 특수기호를 쓰면 안된다(~, !, @, #, $ ...)
		 * 3. 이미 있는 키워드를 사용하면 안된다.(println, if,swith,for...)
		 * 4. 절대로 한글로는 짓지 말 것.
		 * 5. 첫글자는 소문자로 작성할 것
		 * 6. 의미있는 단어로 이름을 지을 것(키 -> height, 이름 -> name
		 * 숫자 -> num, number)
		 * */
		
		//논리형 변수
		//논리형은 true, false 즉, 참 혹은 거짓 두가지 값만 가지고 있습니다.
		boolean b1 = true;
		
		System.out.println("b1의 값 " + b1);
		
		b1 = false;
		
		//문자형 변수
		char ch = 'A'; //문자형은 홑따옴표 안에 넣어야 하며 두글자 이상 넣을수 없습니다.
		System.out.println("ch의 값 "+ch);
		
		char ch2 = 65 + 1; //아스키코드 65 : A , 97 : a
		System.out.println("ch2의 값 "+ch2);
		
		//정수형 변수
		//byte b = 128;//byte자료형의 표현범위를 벗어나므로 오류가 난다.
		//System.out.println("b의 값 " + b);
		
		short s = 32767;
		int i = 550;
		
		System.out.println("s의 값 " + s);
		System.out.println("i의 값 " + i);
		
		//실수형 변수
		float f = 3.14f;//java에서 실수는 기본적으로 double형으로 인식하기 때문에
					   //float자료형을 사용한다는 것을 명시해줘야 합니다. (3.14f)
		double d = 3.141592;
		
		System.out.println("f의 값 "+ f);
		System.out.println("d의 값 " + d);
		
		
	}	
}










