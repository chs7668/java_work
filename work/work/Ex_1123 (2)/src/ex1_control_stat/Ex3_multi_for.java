package ex1_control_stat;

public class Ex3_multi_for {
	public static void main(String[] args) {
		//��ø for�� : for�� �ȿ� for���� ���ԵǾ� �ִ� ���
		/*
		 * for(�ʱ��;���ǽ�;������){
		 * 		for(�ʱ��;���ǽ�;������){
		 * 			������ ���� �� �ݺ��� ���
		 * 		}//inner for
		 * }//outer for
		 * */
		
		//2�� for���� ��� �ذ��ؾ� �� ������ �� �� �� �� ����մϴ�.
		
		//������
		for(int i = 2; i<=9; i++) {
			for(int j = 2; j<=9; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
		}
		
		
		//1 2
		//1 2
		
		for(int i = 1; i <=2; i++) {
			for(int j = 1; j<=2; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		// 1 1 1 1
		// 1 1 1 1
		// 1 1 1 1
		// 1 1 1 1
		
		for(int i = 0; i<4; i++) {
			for(int j = 0; j <4; j++) {
				System.out.print(1+" ");
			}
			System.out.println();
		}
		
		// A B C D
		// A B C D
		// A B C D
		// A B C D
		

		
		for(int i = 0; i <4; i++) {
			for(int j = 65; j<69; j++) {
				System.out.print((char)j+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		
		// A B C D
		// E F G H
		// I J K L
		
		char ch = 'A';
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j <4; j++) {
				System.out.print(ch++ +" ");
			}
			System.out.println();
		}
		
		// * * * *
		// * * * *
		// * * * *
		
		char ch2='*';
		for(int i= 0; i<3; i++) {
			for(int j =0; j<4; j++) {
				System.out.print(ch2+" ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		//*
		//* *
		//* * *
		//* * * *
		//* * * * *
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------");
		
		//        *
		//      * *
		//    * * *
		//  * * * *
		//* * * * *
		
		for(int i = 0; i <5; i++) {
			for(int j= 0; j <5 -(i+1); j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
