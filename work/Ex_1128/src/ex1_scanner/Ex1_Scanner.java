package ex1_scanner;

import java.util.Scanner;

public class Ex1_Scanner {
	public static void main(String[] args) {
		//Scanner Ŭ���� : Ű���忡�� ���� ���� �Է¹޾� ������ ������ �� �ֵ��� �ϴ� Ŭ����
		Scanner sc =new Scanner(System.in); //scanner ����
		
		//Ű���忡�� intŸ���� ���� �Է¹ް� ���͸� ġ�� ����
		//num������ ����ڰ� �Է¹��� ���� ������ �ش�.
//		System.out.print("������ �Է����ּ���:");
//		int num=sc.nextInt();
//		System.out.println(num);
//		System.out.print("���ڿ��� �Է����ּ���:");
//		String str = sc.next();
//		System.out.println(str);
		
		//Ű���忡�� �̸�,���̸� �Է¹ް� ����غ���
		//��°��
		//�̸�: ooo
		//����: oo
		
//		System.out.print("�̸��� �Է����ּ��� : ");
//		String name=sc.next();
//		System.out.print("���̸� �Է����ּ��� : ");
//		int age = sc.nextInt();
//		System.out.println("�̸� : "+name);
//		System.out.println("���� : "+age+"��");
		
		//Ű���忡�� ���� �Է¹ް�, �Է¹��� ���� �ش��ϴ� �������� ����غ�����.
		//2~9 �̿��� ���ڸ� �Է��ҽ� "2~9������ ���ڸ� �Է��ϼ���" ��� ����ϱ�
//		System.out.print("���� �Է��ϼ��� : ");
//		int dan= sc.nextInt();
//		if(dan >= 2 && dan <= 9) {
//			for(int i=1; i<=9; i++) {
//				System.out.printf("%d X %d = %d\n",dan,i,dan*i);
//			}
//			
//		}else {
//			System.out.println("2~9������ ���ڸ� �Է��ϼ���");
//		}
//		System.out.print("ù��° ���ڸ��Է��ϼ��� : ");
//		int num1=sc.nextInt();
//		if(num1<2 || num1>9) {
//			System.out.println("2~9������ ���ڸ� �Է��ϼ���");
//		}
//		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
//		int num2=sc.nextInt();
//		if(num2<2 || num2>9) {
//			System.out.println("2~9������ ���ڸ� �Է��ϼ���");
//		}
//		int sum=num1*num2;
//		System.out.printf("%d*%d=%d",num1,num2,sum);
		
//		System.out.print("ù��° ���ڸ��Է��ϼ��� : ");
//		int num1=sc.nextInt();
//		System.out.print("�ι�° ���ڸ� �Է��ϼ��� : ");
//		int num2=sc.nextInt();
//		if(num1 >= 2 && num1 <= 9 && num2 >= 2 && num2<=9) {
//			System.out.printf("%d x %d = %d",num1,num2,(num1*num2));
//		}else {
//			System.out.println("2~9������ ���ڸ� �Է��ϼ���");
//		}
		System.out.println("------------------------------------");
		
		//Scanner�� ���ؼ� ���� n�� �Է¹޴´�.
		//�׸��� 1���� �Է¹��� ���� n������ ������ ����Ͽ� �� ����� ����ϴ� ���α׷��� �ۼ��ϼ���
		//������� ���� 5�� �Է¹����� 1+2+3+4+5�� �������� 15�� ���
		int sum=0;
		System.out.print("������ �Է��ϼ��� : ");
		int n =sc.nextInt();
		for(int i=1; i<=n; i++) {
			sum+=i;
		}
		System.out.printf("1���� %d������ ������ : %d\n",n,sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
