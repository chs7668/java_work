package ex1_printf;

public class Ex1_printf {
	public static void main(String[] args) {
		
		//printf의 f는 format이라는 뜻을 갖고 있습니다.
		//형식문자
		//1) %d : 정수형을 입력받을때 사용
		//2) %c : 문자형을 입력받을때 사용
		//3) %s : 문자열을 입력받을때 사용
		//4) %f : 실수형을 입력받을때 사용
		
		int a=10;
		int b=23;
		System.out.printf("%d+%d=%d\n",a,b,a+b);
		int age=27;
		//저의 나이는 27살 입니다.
		System.out.printf("저의 나이는 %d살입니다\n",age);
		//저의 나이는 27살이고 키는 170입니다.
		int tall=170;
		System.out.printf("저의 나이는 %d살이고 키는 %d입니다.\n",age,tall);
		//저의 혈액형은 AB형입니다.
		String blood = "AB";
		System.out.printf("저의 혈액형은 %s형입니다.\n",blood);
		//원주율은 3.141592입니다
		float pi = 3.141592f;
		System.out.printf("원주율은 %.3f입니다",pi);  //f앞에 소수점 ??자리까지 표기하고싶으면.??(숫자)를앞에 붙인다  
		
		System.out.println("------------------------");
		// 1 2  3 4
		// 5 6  7 8
		// 9 10 11 12
		
		System.out.printf("%d %d %d %d\n%d %d %d %d\n%d %d %d %d\n",1,2,3,4,5,6,7,8,9,10,11,12);
		
		int count =1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%d ",count++);
			}
			System.out.println();
		}
		
		int count2 =1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.printf("%05d ",count2++); //d앞에 숫자
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
