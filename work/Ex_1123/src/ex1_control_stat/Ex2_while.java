package ex1_control_stat;

import java.util.Random;

public class Ex2_while {
	public static void main(String[] args) {
		//while : for�� ���ٴ� ������ ������ ���� �ݺ���(����,��ó��)
		//����
		//while(���ǽ�){
		// ���ǽ��� �� �� ���� �ݺ��� ���
		//}
		int num = 3;
		while(num<5) {
			System.out.println("A");
			num++;
		}
		//while�� �ۼ� ���
		//���۰��� ���� ���� �����ϱ�
		//��� �ݺ����� Ƚ���� �����ش�.(���ǽ�)
		//�ݺ����� ����� �� �ֵ��� ���۰��� ��ȭ�� ����Ѵ� 
		System.out.println("-----------------------");
		
		//do - while�� : ��ó�� �� ��
		//��� �� �����ϰ� �������� ;�� ������
		//����
		//do{
		// ������ ���� ���� �ݺ��� ���
		//}while(���ǽ�);
		int n = 11;
		
		do {//������ ���� �ʾƵ� ������ �ѹ��� ���� �Ѵ�
			System.out.println(n);
		}while(n<=10);
		
		//for vs while
		//for���� ���� �ݺ��ϰ��� �ϴ� Ƚ���� ��Ȯ�ϰ� �� ��
		//while���� �ݺ��ϰ��� �ϴ� Ƚ���� ��Ȯ���� ���� ���� ���
		
		//���������ϱ�
		System.out.println("-----------------------");
		int random = new Random().nextInt(8)+2;
		
		while(random !=7) {
			System.out.println(random);
			random = new Random().nextInt(8)+2;
		}
		
		
		
		
		
		
	}

}
