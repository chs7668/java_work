package Ex1_operator;

public class Ex5_operator {
	public static void main(String[] args) {
		//����������
		//1�� �����ñ�Ŀ��, 1�� ���ҽ�Ű�� ������
		//��������, ��������
		// ++, --
		
		int a = 10;
		System.out.println("a : " + ++a);//11 �������� : ��� 1 �����ش�.
		System.out.println("a : " + a++);//11 �������� : �������� ����� �� 1�� �����ش�.(�ܻ�)
		System.out.println("a : " + a);//12
		
		int b = 20;
		System.out.println("b : " + --b);//19 ���� ���� : ��� 1�� ���ش�.
		System.out.println("b : " + b--);//19 ���� ���� : �������� ����� �� 1�� ���ش�.
		System.out.println("b : " + b);//18
		System.out.println("-----------------------------------");
		int c = 1;
		++c;//2
		++c;//3
		c++;//3(+1)
		++c;//5
		c++;//5(+1)
		c++;//6(+1)
		++c;//8
		//c�� ����?
		System.out.println("c : " + c);
		
		//���׿�����
		//�ϳ��� ������ �����Ͽ� ������ ���̰�� ������ ���, ������ ��� ������ ����� ��ȯ�޴� ������.
		// ? :
		int a2 = 10;
		int b2 = 15;
		boolean result; //���� ���� ����
		
		result = ++a2 >= b2 ? true : false;
		System.out.println("result : " + result);
		
		char result2;
		
		result2 = (a2+=1) >= b2 ? 'O' : 'X';
		System.out.println("result2 : " + result2);
		
		int result3;
	
		result3 = a2 <= b2 ? 1 : 0;
		System.out.println("result3 : " + result3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
