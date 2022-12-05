package Ex1_operator;

public class Ex2_operator {
	public static void main(String[] args) {
		//대입연산자
		// = 특정값을 변수에 전달하여 기억시킬 때 사용하는 연산자
		
		int n1 = 10; //n1이라는 int형 변수에 10이라는 정수를 대입함.
		int n2 = 7;
		
		System.out.println("=연산자 : n1 = " + n1 + ", n2= " + n2);
		
		int n3 = 5;
		int n4 = 9;
		
		System.out.println("+=연산자: n3 += n4 " + (n3+=n4));//n3 = n3 + n4;
		System.out.println("n3의 값 : " + n3);
		int n5 = 10;
		int n6 = 3;
		
		System.out.println("-=연산자: n5 -= n6 " + (n5-=n6));//n5 = n5 - n6;
		
		int n7 = 12;
		int n8 = 5;
		
		System.out.println("/=연산자: n7 /= n8 " + (n7 /= n8));//n7 = n7 / n8
		
	}

}
