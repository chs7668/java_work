package ex3_casting;

public class Ex1_casting {
	public static void main(String[] args) {
		//����ȯ(ĳ����)
		//1. ���θ��(�ڵ�����ȯ, �Ͻ��� ����ȯ)
		//- ���� �ڷ����� ū �ڷ����� �����ϴ� ��(�ڵ����� �ٲ�)
		double d = 100.5; //8byte
		int n = 200; //4byte
		
		d = n;
		System.out.println("d= " + d);
		
		char ch = 'A';
		long l = 100; //8byte
		
		l = ch;
		
		System.out.println("l= " + l);
		
		//2. ����(��������ȯ, ���������ȯ)
		//- ū �ڷ����� ���� ���� �ڷ����� �����ϴ� ��(�ڵ����� �̷������ �ʽ��ϴ�.)
		char c = 'B'; //2byte
		int n1 = c + 1;
		
		c = (char)n1; //c�� 2byte, n1 4byte
		System.out.println("c= " + c);
		
		float f = 5.5f; //4.xx byte
		int n2 = 0; //4byte
		
		n2 = (int)f; //�Ǽ� -> ������ ����ȯ�� �� �� �Ҽ��� �Ʒ� ���ڰ� ���ǵ� �� �ֽ��ϴ�.
		System.out.println("n2= " +n2);
		
		byte b1 = 100;
		byte b2 = 20;
		//byte b3 = b1 + b2;
		int b4 = b1 + b2;
		//byte�� ǥ�� ������ 127���� �ۿ� ���� �ʴٺ���, byte������ ������ 127�� �Ѿ����
		//���ɼ��� �����ϴ�. �̷� ��Ȳ�� ����Ͽ� java�����ڵ��� byte������ ������ ����� ��
		//int������ ���� �޵��� ����
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
