package ex1_control_stat;

public class Ex3_multi_for {
	public static void main(String[] args) {
		//��øfor�� : for�� �ȿ� for���� ���ԵǾ� �ִ� ���
		/*
		 * for(�ʱ��;���ǽ�;������){
		 * 		for(�ʱ��;���ǽ�;������){
		 * 			������ ���� �� �ݺ��� ���
		 * 		}//inner for
		 * }//outer for
		 * */
		
		//2�� for���� ��� �ذ��ؾ� �� ������ �� ���϶� ���
		
		//������
		for(int i=2; i<=9; i++) {
			for(int j=2; j<=9; j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
			System.out.println();
		}
		
		//1 2
		//1 2
		
		for(int i = 1; i<=2; i++) {
			for(int j = 1; j<=2; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		//1 1 1 1
		//1 1 1 1
		//1 1 1 1
		//1 1 1 1
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				System.out.print(1+" ");
			}
			System.out.println();
		}
		System.out.println("----------------------");
		//A B C D
		//A B C D
		//A B C D
		//A B C D
		int a = 64;
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=4; j++) {
				System.out.print((char)(a+j)+" ");
			}
			System.out.println();
		}
		System.out.println("-------------------------");
		//A B C D
		//E F G H
		//I J K L
		char ch = 'A';
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(ch++ +" ");
			
			}
			System.out.println();
		}
		
		System.out.println("-------------------------");
		
		// * * * *
		// * * * *
		// * * * *
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		System.out.println("------------------------");
		
		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------------------"); 
		//        *
		//      * *
		//    * * *
		//  * * * *
		//* * * * *
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-(i+1); j++) {
				System.out.print(" ");
			}
			for(int k=0; k<=i; k++) {
				System.out.print("*");
			}
		System.out.println();
		}
		System.out.println("----------------------------------");
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-(i+1); j++) {
				System.out.print(" ");
			}
			for(int k=0; k<(i*2+1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
