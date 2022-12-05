package Ex1_operator;

public class Ex6_operator {
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		
		//++a >= b || 2 + 7 <= b && 13 -b >=0 && (a += b) - (a % b) > 10;
		// 11 >= 12 || 9 <= 12 && 1 >= 0 && (23) - (9) > 10;
		// false || true && true && true
		// true && true && true
		// true && true
		// true 
		
		
		
		/*
		 * 과수원이 있다.
		 * 
		 * 배,사과,오렌지를 키우고 있는데 하루에 생산되는 양은 각각 5,7,5개
		 * 
		 * 과수원에서 하루에 생산되는 총 개수를 출력하고
		 * 시간당 전체 과일의 평균 생산 개수를 출력
		 * (평균값을 담는 변수는 float으로 할 것)
		 */
		
		int a2 = 5;
		int b2 = 7;
		int c2 = 5;
		
		int all =(a2+b2+c2);
		System.out.println("총 개수 : "+all);
		System.out.println("시간당 평균생산개수 : "+ all/24f);
		
		
		
		
		
	}

}
