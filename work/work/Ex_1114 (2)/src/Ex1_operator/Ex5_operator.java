package Ex1_operator;

public class Ex5_operator {
	public static void main(String[] args) {
		//증감연산자
		//1씩 증가시기커나, 1씩 감소시키는 연산자
		//선행증감, 후행증감
		// ++, --
		
		int a = 10;
		System.out.println("a : " + ++a);//11 선행증가 : 즉시 1 더해준다.
		System.out.println("a : " + a++);//11 후행증가 : 다음번에 사용할 때 1을 더해준다.(외상)
		System.out.println("a : " + a);//12
		
		int b = 20;
		System.out.println("b : " + --b);//19 선행 감소 : 즉시 1을 빼준다.
		System.out.println("b : " + b--);//19 후행 감소 : 다음번에 사용할 때 1을 빼준다.
		System.out.println("b : " + b);//18
		System.out.println("-----------------------------------");
		int c = 1;
		++c;//2
		++c;//3
		c++;//3(+1)
		++c;//5
		c++;//5(+1)
		c++;//6(+1)
		++c;//8
		//c의 값은?
		System.out.println("c : " + c);
		
		//삼항연산자
		//하나의 조건을 정의하여 조건이 참이경우 실행할 명령, 거짓일 경우 실행할 명령을 반환받는 연산자.
		// ? :
		int a2 = 10;
		int b2 = 15;
		boolean result; //논리형 변수 선언
		
		result = ++a2 >= b2 ? true : false;
		System.out.println("result : " + result);
		
		char result2;
		
		result2 = (a2+=1) >= b2 ? 'O' : 'X';
		System.out.println("result2 : " + result2);
		
		int result3;
	
		result3 = a2 <= b2 ? 1 : 0;
		System.out.println("result3 : " + result3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
