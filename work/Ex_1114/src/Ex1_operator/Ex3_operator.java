package Ex1_operator;

public class Ex3_operator {
	public static void main(String[] args) {
		//�񱳿�����
		//�񱳿����ڴ� ������ ����� ���� ���Ͽ� ���� ������ �Ǵ��ϴ� ������
		//�׷��Ƿ� ������� �ݵ�� true, false�θ� ��ȯ �ȴ�.
		
		int n1 = 10;
		int n2 = 20;
		boolean result;
		result = n1 < n2;
		System.out.println("n1 < n2 : " + result);
		
		result = n1 > n2;
		System.out.println("n1 > n2 : " + result);
		
		// < : �۴�
		// > : ũ��
		// <=, >= �� �׻� ���谡 =���� �����ɴϴ�.
		// == : ����.
		// != : ���� �ʴ�.
		
		result = n1 == n2;
		System.out.println("n1 == n2 : " + result);
		
		result = n1 != n2;
		System.out.println("n1 != n2 : " + result);
		
		
		//�� ������
		//�� �����ڸ� ���� ������ 2�� �̻� �ʿ��� �� ����մϴ�.
		int a = 5;
		int b = 10;
		
		result = a < b && a != b;
		System.out.println("&&������ : " + result);
		
		//&&�� and�� ���ϰ�
		//�� && �� -> ��
		//�� && ���� -> ����
		//���� && �� -> ����  ���ʿ����� false�� �� ���ʿ����� �������� �ʰ� �Ѿ��.
		//���� && ���� -> ����
		
		result = (a+b) < 10 && (a+=2) > 5;
		System.out.println(result);
		System.out.println("a�� �� : " + a);
		
		// ||�� or�� ��
		// �� || �� -> ��
		// �� || ���� -> ��
		// ���� || �� -> ��
		// ���� || ���� -> ����
		
		result = (a += 2) > 5 || b == 5;
		System.out.println(result);
		System.out.println("a�� �� : " + a);
		
		// !
		// not�� ��
		// true -> false
		// false -> true
		System.out.println(!result);
		
		
		
		
		
		
	}
}
