package Ex1_switch;

public class Ex3_switch {
	public static void main(String[] args) {
		//switch문의 비교값으로 사용 가능한 자료형
		//1) 정수 ( byte,short,int)
		//2) 문자형(char)
		//3) 문자열(String)
		
		String str = "박";//한글자도 문자열로 표현이 가능하다.
		
		switch(str) {
		case "박":
			System.out.println("박길동");
			
		case "이":
			System.out.println("이길동");
			
		case "독고":
			System.out.println("독고길동");
		
		case "홍":
			System.out.println("홍길동");
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
