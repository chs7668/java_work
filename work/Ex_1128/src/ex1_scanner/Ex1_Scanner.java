package ex1_scanner;

import java.util.Scanner;

public class Ex1_Scanner {
	public static void main(String[] args) {
		//Scanner Ŭ���� : Ű���忡�� ���� ���� �Է¹޾� ������ ������ �� �ֵ��� �ϴ� Ŭ����
		Scanner sc = new Scanner(System.in);//scanner ����
		
		//Ű���忡�� intŸ���� ���� �Է¹ް� ���͸� ġ�� ����
		//num������ ����ڰ� �Է¹��� ���� ������ �ش�.
//		System.out.print("������ �Է��� �ּ��� : ");
//		int num = sc.nextInt();
//		System.out.println(num);
//		
//		System.out.print("���ڿ��� �Է��� �ּ��� : ");
//		String str = sc.next();
//		System.out.println(str);
		
		//Ű���忡�� �̸�,���̸� �Է¹ް� ����غ���
		
		//��°��
		//�̸� : ooo
		//���� : oo
		
//		String name;
//		int age;
//		
//		System.out.print("�̸��� �Է��� �ּ��� : ");
//		name = sc.next();
//		System.out.print("���̸� �Է��� �ּ��� : ");
//		age = sc.nextInt();
//		
//		System.out.printf("�̸� : %s\n",name);
//		System.out.printf("���� : %d\n",age);
		
		//Ű���忡�� ���� �Է¹ް�, �Է¹��� ���� �ش��ϴ� �������� ����غ�����.
		//2~9 �̿��� ���ڸ� �Է��� �� "2~9 ������ ���ڸ� �Է��ϼ���" ��� ����ϱ�
//		while(true) {
//			System.out.print("���� �Է��� �ּ��� : ");
//			int dan = sc.nextInt();
//			
//			if(dan < 2 || dan > 9) {
//				System.out.println("2~9������ ���ڸ� �Է��ϼ���");
//			} else {
//				for(int i = 1; i <=9; i++) {
//					System.out.printf("%d X %d = %d\n", dan, i, dan*i);
//				}
//				break;
//			}
//		}
		
		//Scanner�� ���ؼ� ���� n�� �Է¹޴´�.
		//�׸��� 1���� �Է¹��� ���� n������ ������ ����Ͽ� �� ����� ����ϴ� ���α׷��� �ۼ��ϼ���.
		//������� ���� 5�� �Է¹����� 1 + 2 + 3+ 4 + 5 �� �������� 15�� ����ؾ� �Ѵ�.
		
		//��°��
		//���� : 15
		System.out.print("������ �Է��� �ּ��� : ");
		int n = sc.nextInt();
		int total = 0;
		for(int i = 1; i <=n; i++) {
			total += i;
		}
		System.out.printf("1���� %d������ ���� %d�Դϴ�.",n,total);
		
		
		
		
		
	}
}
