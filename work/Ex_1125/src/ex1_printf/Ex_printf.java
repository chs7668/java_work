package ex1_printf;

public class Ex_printf {
	public static void main(String[] args) {
		int su1 = 10;
		int su2 = 7;
		System.out.println(su1+"+"+su2+"="+(su1+su2));
		
		//printf�� f�� format�̶�� ���� ���� �ֽ��ϴ�.
		//���Ĺ���
		//1) %d : �������� �Է¹��� �� ����մϴ�.
		//2) %c : �������� �Է¹��� �� ����մϴ�.
		//3) %s : ���ڿ��� �Է¹��� �� ����մϴ�.
		//4) %f : �Ǽ����� �Է¹��� �� ����մϴ�.
		
		System.out.printf("%d+%d=%d\n",su1,su2,(su1+su2));
		
		int age= 25;
		//���� ���̴� 25�� �Դϴ�.
		System.out.printf("���� ���̴� %d�� �Դϴ�.\n",age);
		
		//���� ���̴� 25���̰� Ű�� 170�Դϴ�.
		System.out.printf("���� ���̴� %d�� �̰� Ű�� %d�Դϴ�.\n",age,170);
		
		//���� �������� AB���Դϴ�.
		System.out.printf("���� �������� %s���Դϴ�.\n","AB");
		
		//�������� 3.141592�Դϴ�.
		System.out.printf("�������� %.1f�Դϴ�.\n",3.141592);
		
		//���� ���̴� 25���̰� 
		//Ű�� 170�̰� 
		//�������� AB���Դϴ�.
		System.out.printf("���� ���̴� %d���̰�\nŰ�� %d�̰�\n��������%s�Դϴ�.",age,170,"AB");
		
		
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
