package Ex1_operator;

public class Ex3_operator {

	public static void main(String[] args) {
		//비교 연산자
		//비교연산자는 변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자
		//그러므로 결과값은 반드시 true,false로만 반환 된다.
		
		int n1 = 10;
		int n2 = 20;
		boolean result= n1 <n2;  
		System.out.println("n1 < n2="+result);
		
		result = n1 > n2;
		System.out.println("n1 > n2="+result);
		
		result = n1 == n2;
		System.out.println("n1 == n2="+result);
		
		result = n1 != n2;
		System.out.println("n1 != n2="+result);
		
		// < : 작다
		// > : 크다
		// <=, >= 는 항상 꺽쇠가 =보다 먼저온다
		// == : 같다
		// != : 같지 않다
		
		//논리 연산자
		//비교 연산자를 통한 연산이 2개 이상 필요할 때 사용합니다
		int a = 5;
		int b = 10;
		
		result = a > b && a != b;
		System.out.println("a는 b보다 크고 a는 b와같지않다"+result);
		//&&는 and를뜻하고 앞뒤가 두개다 true이어야 true값을 출력한다
		
		result = (a+b) <10 && (a+=2) > 5;
		System.out.println("a+b가10보다 작고 a+2는 5보다작다="+result);
		System.out.println("a의 값 : "+a); 
		//앞이 false라서 뒤에 (a+=2)가 실행하지 않는다
		
		// ||은 or의 뜻 둘중에 하나라도 참이면 나오면 true
		result = b == 5 || (a += 2) > 5 ;
		System.out.println(result);
		System.out.println("a의 값 : "+a);
		System.out.println(!result);
		
		
		
		
		
		
		
		
		
	}

}
