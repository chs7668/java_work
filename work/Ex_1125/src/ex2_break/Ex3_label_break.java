package ex2_break;

public class Ex3_label_break {
	public static void main(String[] args) {
		//label : 특정 반복문에 이름표를 붙여 두 개이상의 반복문을 
		//제어할 수 있도록 하는 키워드
		
		//label은 항상 쌍으로 존재
		//label의 이름은 자기가 원하는대로 사용이 가능합니다
		
		//label은 자신을 포함하고 있는 상위 개념에게만 달 수 있습니다
		
		bb:for(int i=0; i<=3; i++) {
			for(int k=1; k<=10; k++) {
				System.out.printf("%d",k);
			}
			for(int j=1; j<10; j++) {
				if(j%2==0) {
					break bb;
				}
				System.out.printf("%d",j);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}

}
