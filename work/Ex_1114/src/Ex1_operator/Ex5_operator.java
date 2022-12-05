package Ex1_operator;

public class Ex5_operator {
	public static void main(String[] args) {
		//증감 연산자
		//1씩 증가시키거나 1씩감소시키는 연산자
		//선행증감,후행증감
		// ++,--
		
		int a = 10;
		System.out.println(a);
		System.out.println("a : "+ ++a);//선행증감:즉시 1더해준다  
		System.out.println(a);
		System.out.println("a : "+ a++);//후행증감:다음번에 사용할때 1을 더해준다
		System.out.println(a);
		System.out.println("a : "+ a);	//12
		
		int b = 20;
		System.out.println("b : "+ --b);//선행감소:즉시 1을뺀다
		System.out.println("b : "+ b--);//후행감소:다음번에 사용할때 1을 빼준다
		System.out.println("b : "+b);   //18
		System.out.println("----------------------------------");
		int c = 1;
		++c; //2
		++c; //3
		c++; //3
		++c; //5
		c++; //5
		c++; //6
		++c; //8
		//c의값? 
		System.out.println(c);
		
		//삼항연산자
		//하나의 조건을 정의하여 조건이 참일경우 실행할 명령, 거짓일 경우 실행할 명령을 반환받는 연산자.
		// ? :
		int a2 = 10;
		int b2 = 15;
		boolean result; //논리형 변수 선언
		
		result= ++a2>= b2 ? true : false; //참이면   앞쪽 :  거짓이면 :뒤쪽  
		System.out.println("result : "+result);
		
		char result2;
		
		result2 = (a2+1) >= b2 ? 'O' : 'X';
		System.out.println("result2 : "+result2);
		
		int result3 = a2 <= b2 ? 1 : 0;
		System.out.println("result3 : "+result3);
		
		
		
		
		
		
		
		
		
	}

}
