package Ex1_operator;

public class Ex6_operator {
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		
		//++a >= b || 2 + 7 <= b && 13 -b >=0 && (a += b) - (a % b) > 10;
		// 11 >= 12 || 9 <= 12 && 1 >= 0 && (23) - (9) > 10;
		// false || true && true && true
		// true && true && true
		// true && true
		// true 
		
		
		
		/*
		 * �������� �ִ�.
		 * 
		 * ��,���,�������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ���� ���� 5,7,5��
		 * 
		 * ���������� �Ϸ翡 ����Ǵ� �� ������ ����ϰ�
		 * �ð��� ��ü ������ ��� ���� ������ ���
		 * (��հ��� ��� ������ float���� �� ��)
		 */
		
		int a2 = 5;
		int b2 = 7;
		int c2 = 5;
		
		int all =(a2+b2+c2);
		System.out.println("�� ���� : "+all);
		System.out.println("�ð��� ��ջ��갳�� : "+ all/24f);
		
		
		
		
		
	}

}
