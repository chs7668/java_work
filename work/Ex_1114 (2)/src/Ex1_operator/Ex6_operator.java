package Ex1_operator;

public class Ex6_operator {
	public static void main(String[] args) {
		int a = 10;
		int b = 12;
		//											a = a + b
		//++a >= b || 2 + 7 <= b && 13 - b >= 0 && (a += b) - (a % b) > 10;
		// 11 >= 12 ||  9 <= 12 && 1 >= 0 && 23 - 11 > 10
		// false || true && true && true
		// true && true && true
		// true && true
		// true
		
		/*
		 * �������� �ִ�.
		 * 
		 * ��, ���, �������� Ű��� �ִµ� �Ϸ翡 ����Ǵ� ���� ����
		 * 5,7,5��
		 * 
		 * ���������� �Ϸ翡 ����Ǵ� �� ������ ����ϰ�
		 * �ð��� ��ü ������ ��� ���� ������ ���
		 * (��հ��� ��� ������ float���� �� ��)
		 * */
		
		int pear = 5;
		int apple = 7;
		int orange = 5;
		
		int total = pear + apple + orange;
		float avg = (float)total / 24; // ���� / ���� -> ����
								// ���� / �Ǽ� , �Ǽ� / ���� -> �Ǽ�
		System.out.println("�Ϸ翡 ����Ǵ� ������ �� : " + total + "��");
		
		System.out.println("�ð��� ��� ���� ���� : " + avg + "��");
		
		
		
		
		
		
		
		
		
		
		
		
	}
}

