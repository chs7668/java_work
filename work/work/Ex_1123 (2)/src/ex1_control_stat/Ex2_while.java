package ex1_control_stat;

import java.util.Random;

public class Ex2_while {
	public static void main(String[] args) {
		//while : for�� ���ٴ� ������ ������ ���� �ݺ���(����, ��ó��)
		//����
		//while(���ǽ�){
		//	���ǽ��� �� �� ���� �ݺ��� ���
		//}
		
		int num = 3; 
		
		while(num <5) {
			System.out.println('a');
			num++;
		}
		
		//while�� �ۼ� ���
		//1. ���۰��� ���� ���� �����ϱ�
		//2. ��� �ݺ����� Ƚ���� �����ش�.(���ǽ�)
		//3. �ݺ����� ����� �� �ֵ��� ���۰��� ��ȭ�� ��� �մϴ�.
		
		/*
		 * while(true) { System.out.println(1); }
		 */
		
		
		System.out.println("---------------------------------------");
		
		//do - while�� : ��ó�� �� ��
		//��� �� �����ϰ� �������� ;�� ������.
		//����
		//do{
		//	������ ���� ���� �ݺ��� ���
		//}while(���ǽ�);
		
		int n = 11;
		
		do {//������ ���� �ʾƵ� ������ �ѹ��� ������ �մϴ�.
			System.out.println(n);
		}while(n<=10);
		
		//for vs while
		//for���� ���� �ݺ��ϰ��� �ϴ� Ƚ���� ��Ȯ�ϰ� �� �� ����մϴ�.
		//while���� �ݺ��ϰ��� �ϴ� Ƚ���� ��Ȯ���� ���� ���� ����մϴ�.
		
		System.out.println("----------------------------------------");
		
		//���� �����ϱ�(2~9������ ����)
		int random = new Random().nextInt(8) + 2;
		
		while(random != 7) {
			System.out.println(random);
			random = new Random().nextInt(8) + 2;
		}
		
	}
}
