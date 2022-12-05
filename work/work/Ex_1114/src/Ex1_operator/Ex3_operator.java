package Ex1_operator;

public class Ex3_operator {
	public static void main(String[] args) {
		//비교연산자
		//비교연산자는 변수나 상수의 값을 비교하여 참과 거짓을 판단하는 연산자
		//그러므로 결과값은 반드시 true, false로만 반환 된다.
		
		int n1 = 10;
		int n2 = 20;
		boolean result;
		result = n1 < n2;
		System.out.println("n1 < n2 : " + result);
		
		result = n1 > n2;
		System.out.println("n1 > n2 : " + result);
		
		// < : 작다
		// > : 크다
		// <=, >= 는 항상 꺽쇠가 =보다 먼저옵니다.
		// == : 같다.
		// != : 같지 않다.
		
		result = n1 == n2;
		System.out.println("n1 == n2 : " + result);
		
		result = n1 != n2;
		System.out.println("n1 != n2 : " + result);
		
		
		//논리 연산자
		//비교 연산자를 통한 연산이 2개 이상 필요할 때 사용합니다.
		int a = 5;
		int b = 10;
		
		result = a < b && a != b;
		System.out.println("&&연산자 : " + result);
		
		//&&는 and를 뜻하고
		//참 && 참 -> 참
		//참 && 거짓 -> 거짓
		//거짓 && 참 -> 거짓  앞쪽연산이 false일 때 뒤쪽연산을 수행하지 않고 넘어간다.
		//거짓 && 거짓 -> 거짓
		
		result = (a+b) < 10 && (a+=2) > 5;
		System.out.println(result);
		System.out.println("a의 값 : " + a);
		
		// ||은 or의 뜻
		// 참 || 참 -> 참
		// 참 || 거짓 -> 참
		// 거짓 || 참 -> 참
		// 거짓 || 거짓 -> 거짓
		
		result = (a += 2) > 5 || b == 5;
		System.out.println(result);
		System.out.println("a의 값 : " + a);
		
		// !
		// not의 뜻
		// true -> false
		// false -> true
		System.out.println(!result);
		
		
		
		
		
		
	}
}
