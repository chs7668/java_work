package Ex1_operator;

public class Ex4_operator {
	public static void main(String[] args) {
		//비트 연산자
		/*
		 * 논리 연산자와 유사하지만 bit단위(2진수)의 연산만 가능하다.
		 * */
		//true -> 1
		//false -> 0
		
		int a = 10; //1010
		int b = 7;  //0111
		
		//1010
		//0111
		//0010 결과
		
		int c = a & b; //논리곱(and) - 2진수로 바꿨을 때 두 값이 모두 1일 때만 결과가 1 이외에는 0
		System.out.println("c : " + c);
		
		int a2 = 12; //1100
		int b2 = 8;  //1000
		
		//1100
		//1000
		//1100
		
		int c2 = a2 | b2; //논리합(or) - 2진수로 둘중 하나라도 1이면 1 나머지는 0
		System.out.println("c2 : " + c2);
		
		System.out.println("-----------------------------------------");
		
		//시프트 연산자
		//bit단위의 연산을 수행하지만 오른쪽 혹은 왼쪽으로 이동시켜 값에대한 변화를 준다.
		
		int a3 = 12; //1100
		int b3 = 2;  //0010
		
		int c3 = a3 >> b3; //a를 b만큼 오른쪽으로 이동
		System.out.println("c3 : " + c3);
		
		int d = c3 << b3; //c3를 b만큼 왼쪽으로 이동
		System.out.println("d : " + d);
		
		char ch = 'F'; //1000110
		int num = 1;
		char ch_result = (char)(ch >> num);
		System.out.println("ch_result :" + ch_result);
		
		
	}
}
