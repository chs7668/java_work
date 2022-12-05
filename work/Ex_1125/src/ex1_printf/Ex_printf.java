package ex1_printf;

public class Ex_printf {
	public static void main(String[] args) {
		int su1 = 10;
		int su2 = 7;
		System.out.println(su1+"+"+su2+"="+(su1+su2));
		
		//printf의 f는 format이라는 뜻을 갖고 있습니다.
		//형식문자
		//1) %d : 정수형을 입력받을 때 사용합니다.
		//2) %c : 문자형을 입력받을 때 사용합니다.
		//3) %s : 문자열을 입력받을 때 사용합니다.
		//4) %f : 실수형을 입력받을 때 사용합니다.
		
		System.out.printf("%d+%d=%d\n",su1,su2,(su1+su2));
		
		int age= 25;
		//저의 나이는 25살 입니다.
		System.out.printf("저의 나이는 %d살 입니다.\n",age);
		
		//저의 나이는 25살이고 키는 170입니다.
		System.out.printf("저의 나이는 %d살 이고 키는 %d입니다.\n",age,170);
		
		//저의 혈액형은 AB형입니다.
		System.out.printf("저의 혈액형은 %s형입니다.\n","AB");
		
		//원주율은 3.141592입니다.
		System.out.printf("원주율은 %.1f입니다.\n",3.141592);
		
		//저의 나이는 25살이고 
		//키는 170이고 
		//혈액형은 AB형입니다.
		System.out.printf("저의 나이는 %d살이고\n키는 %d이고\n혈액형은%s입니다.",age,170,"AB");
		
		
		System.out.println("------------------------------------------------");
		// 1 2  3  4
		// 5 6  7  8
		// 9 10 11 12
		
		int count = 1;
		for(int i = 0; i <3; i++) {
			for(int j = 0; j <4; j++) {
				System.out.printf("%04d ",count++);
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
