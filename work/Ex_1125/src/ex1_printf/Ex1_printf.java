package ex1_printf;

public class Ex1_printf {
	public static void main(String[] args) {
		
		//printf�� f�� format�̶�� ���� ���� �ֽ��ϴ�.
		//���Ĺ���
		//1) %d : �������� �Է¹����� ���
		//2) %c : �������� �Է¹����� ���
		//3) %s : ���ڿ��� �Է¹����� ���
		//4) %f : �Ǽ����� �Է¹����� ���
		
		int a=10;
		int b=23;
		System.out.printf("%d+%d=%d\n",a,b,a+b);
		int age=27;
		//���� ���̴� 27�� �Դϴ�.
		System.out.printf("���� ���̴� %d���Դϴ�\n",age);
		//���� ���̴� 27���̰� Ű�� 170�Դϴ�.
		int tall=170;
		System.out.printf("���� ���̴� %d���̰� Ű�� %d�Դϴ�.\n",age,tall);
		//���� �������� AB���Դϴ�.
		String blood = "AB";
		System.out.printf("���� �������� %s���Դϴ�.\n",blood);
		//�������� 3.141592�Դϴ�
		float pi = 3.141592f;
		System.out.printf("�������� %.3f�Դϴ�",pi);  //f�տ� �Ҽ��� ??�ڸ����� ǥ���ϰ������.??(����)���տ� ���δ�  
		
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
				System.out.printf("%05d ",count2++); //d�տ� ����
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
