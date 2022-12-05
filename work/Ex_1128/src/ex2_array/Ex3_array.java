package ex2_array;

import java.util.Random;

public class Ex3_array {
	public static void main(String[] args) {
		//배열 arr에 담겨있는 모든 값의 합을 출력하세요
		//결과 : oo
//		int sum=0;
//		int [] arr= {10,20,30,40,50};
//		for(int i=0; i<arr.length; i++) {
//			sum+=arr[i];
//		}
//		System.out.println("결과 : "+sum);
		
		//발생된 난수 money를 동전으로 바꾸면 각 동전이 몇개씩 필요한지
		//판단하는 코드를 작성하세요.
		//금액은 10~5000원 까지 1의자리 숫자는 0으로만든다
		//가능한 적은수의 동전을 사용하세요
		//4170
		//500원 : 8
		//100원 : 1
		//50원 : 1
		//10원 : 2
		//1.10~5000원까지 난수생성(1의 자리는 0이되는 방법 생각하기)
		//2.동전의 담겨있는 배열 만들기
		//3.몫을 구하는 나누기, 나머지를 구하는 나누기를 활용
		int money = new Random().nextInt(5000)+10;
		money/=10;
		money*=10;
		int [] arr= {500,100,50,10};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+"원 : "+money/arr[i]);
			money%=arr[i];
		}
		
		
		
		
		
}
}
