package ex1_practice;

public class Ex3 {
	public static void main(String[] args) {
		//1. ���� x�� 10���� ũ�� 20���� ���� �� ���� x�� ����ϴ� ���ǽ��� �ϼ��϶�
		
//		int x= 111;
//		if(x>10 && x<20) {
//			System.out.println(x);
//		}else {
//			System.out.println("10���� �۰ų� 20����Ů�ϴ�");
//		}

		//2. for���� ����Ͽ� 0���� 10�̸��� ���� �߿��� ¦������ ���� ������ ����Ͻÿ�.

//		for(int i=0; i<10; i++) {
//			if(i%2==0) {
//				System.out.println(i);
//			}
//		}
		
		//3. for���� ����Ͽ� 0���� 10�̸��� ���� �߿��� ¦������ ���� ������ ���ڿ��� ����Ͻÿ�.
//		for(int i=0; i<10; i++) {
//			if(i%2==0) {
//				System.out.println(i+"");
//			}
//		}
		
		//4. for���� ����Ͽ� 0���� 10�̸��� ���� �߿��� Ȧ������ ū������ ����Ͻÿ�.
//		for(int i=10; i>0; i--) {
//			if(i%2!=0) {
//				System.out.println(i);
//			}
//		}
		
		//5. while���� ����Ͽ� 0 ���� 10 �̸��� ���� �߿��� ¦������ ���� ������ ����Ͻÿ�.
//		int n=0;
//		while(true) {
//			n++;
//			if(n>=10) {
//				break;
//			}
//			if(n%2==0) {
//				System.out.println(n);
//			}
//			
//		}
//		int a=0;
//		while(a<10) {
//			if(a%2==0) {
//				System.out.println(a);
//			}
//			a++;
//		}
		
		//6. while���� ����Ͽ� 0 ���� 10 �̸��� ���� �߿��� Ȧ������ ū������ ����Ͻÿ�.
//		int a=10;
//		while(a>0) {
//			if(a%2!=0) {
//				System.out.println(a);
//			}
//			a--;
//		}
		
		//7. for ���� ����Ͽ� 0���� 10�̸��� ������ ���� ����Ͻÿ�.
//		int sum=0;
//		for(int i=0; i<10; i++) {
//			System.out.printf("0���� %d�̸��� �������� : %d\n",i,sum);
//			sum+=i;
//		}
//		System.out.println("0���� 10�̸��� �������� : "+sum);

		//8. 1���� 20 �̸��� ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�.
//		int sum=0;
//		for(int i=0; i<20; i++) {
//			if(i%2==0 || i%3==0) {
//				continue;
//			}
//			sum+=i;
//		}
//		System.out.println("1���� 20 �̸��� ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ���� : "+sum);
//		int sum2=0;
//		for(int i=0; i<20; i++) {
//			if(i%2!=0 && i%3!=0) {
//				sum2+=i;
//			}
//		}
//		System.out.println("1���� 20 �̸��� ���� �߿��� 2 �Ǵ� 3�� ����� �ƴ� ���� ���� : "+sum2);
		
		//9. 1���� 20 �̸��� ���� �߿��� 2 �Ǵ� 3�� ����� ���� ������ ���Ͻÿ�.
//		int sum=0;
//		for(int i=0; i<20; i++) {
//			if(i%2==0 || i%3==0) {
//				sum+=i;
//			}
//		}
//		System.out.println(sum);
		
		//10. �� ���� �ֻ����� ������ ��, ���� ���� 6�� �Ǵ� ��� ����� ���� ����Ͻÿ�.
//		for(int i=1; i<=6; i++) {
//			for(int j=1; j<=6; j++) {
//				if(i+j==6) {
//					System.out.printf("%d+%d=6\n",i,j);
//				}
//			}
//		}
		
		//11. �ﰢ�� ����ϱ� - pattern 1
		// ����(line)�� 5
		//*
		//**
		//***
		//****
		//*****
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//12. �ﰢ�� ����ϱ� - pattern 2
		//*****
		//****
		//***
		//**
		//*
//		for(int i=1; i<=5; i++) {
//			for(int j=1; j<=(5-i)+1; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//13. �ﰢ�� ����ϱ� - pattern 3
		//*****
		// ****
		//  ***
		//   **
		//    *
//		for(int i=1; i<=5; i++) {
//			for(int k=1; k<i; k++) {        //for��1
//				System.out.print(" ");
//			}	
//			for(int j=1; j<=(5-i)+1; j++) { //for��2
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		//����� for���� ����for�� 2������ �׸��� �׵ΰ��� 5������ ���� for��
		//����for�� for��1+for��2
		//����for�� for��1+for��2
		//����for�� for��1+for��2
		//����for�� for��1+for��2
		//����for�� for��1+for��2
		
		//����1. arr �迭 �߿��� �ε����� 1�� ���� ���� ����غ���.    ����) 20
		  int[] arr = { 10, 20, 30, 50, 3, 60, -3 };
		  System.out.println(arr[1]);
		
		
	
		
		
	}

}
