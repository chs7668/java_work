package ex3_casting;

public class Ex1_casting {
	public static void main(String[] args) {
		//����ȯ(ĳ����)
		//1. ���θ��(�ڵ�����ȯ)
		//-���� �ڷ����� ū �ڷ����� �����ϴ°�(�ڵ����� �ٲ�)
		double d = 100.5;
		int n = 200;
		d=n;
		System.out.println("d="+d);
		
		char ch = 'A'; //2byte
		long l = 100;  //8byte
		l = ch;		   //
		System.out.println("l��="+l);
		
		//2. ����(��������ȯ,���������ȯ)
		//-ū �ڷ����� ���� ���� �ڷ����� �����ϴ°�(�ڵ����� �̷������ �ʽ��ϴ�.)
		char c = 'B';
		int n1 = c+1;
		c = (char)n1; //int n1�� char n1���� ����ȯ
		System.out.println("c="+c); //'B'�� �ƽ�Ű�ڵ�� 66
		
		float f = 5.5f; // float�� 4.xx byte
		int n2 = 0;		// int�� 4byte�� int�� �۴�
		
		n2 = (int)f;   //�Ǽ����� ->������ ����ȭ�� �ҽ� �Ҽ��� �Ʒ� ���ڰ� ���ǵ� �� �ִ�
		System.out.println("n2="+n2);
		
		byte b1= 100;
		byte b2= 20;
//		byte b3= b1+b2; //byte ������ ������ ����� �� int������ ���� �޵��� ����
		int  b4= b1+b2;
		
		
	}
	
	
	
	
}
