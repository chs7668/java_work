package ex2_valueType;

public class Ex_valueType {
	public static void main(String[] args) {
		/*
		 * ������ : �Ҽ����� ���� ���� ( -1, 0 , 1)
		 * - byte 1byte - -128 ~ 127
		 * - short 2byte - -32,768 ~ 32,767
		 * - int 4byte - -21�� ~ 21�� -> �Ϲ������� ���̾��� �ڷ���
		 * - long 8byte - -900�� ~ 900�� -> ������, ���ǰ�
		 * 
		 * ������ : �ѱ���
		 * - char 2byte
		 * 
		 * �Ǽ��� : �Ҽ����� �ִ� ����
		 * - float 4byte
		 * - double 8byte
		 * 
		 * ���� : boolen 1bit
		 * 
		 * ����
		 * 
		 * �ڷ��� ������; -> ������ ����
		 * ������ = ������; -> ������ ����
		 * �ڷ��� ������ = ������; -> ������ �ʱ�ȭ (����� ������ ���ÿ�)
		 * 
		 * �������� ��Ģ
		 * 
		 * 1. �Ǿտ� ���ڰ� ���� �ȵȴ�.
		 * 2. _�� �����ϰ� Ư����ȣ�� ���� �ȵȴ�(~, !, @, #, $ ...)
		 * 3. �̹� �ִ� Ű���带 ����ϸ� �ȵȴ�.(println, if,swith,for...)
		 * 4. ����� �ѱ۷δ� ���� �� ��.
		 * 5. ù���ڴ� �ҹ��ڷ� �ۼ��� ��
		 * 6. �ǹ��ִ� �ܾ�� �̸��� ���� ��(Ű -> height, �̸� -> name
		 * ���� -> num, number)
		 * */
		
		//���� ����
		//������ true, false ��, �� Ȥ�� ���� �ΰ��� ���� ������ �ֽ��ϴ�.
		boolean b1 = true;
		
		System.out.println("b1�� �� " + b1);
		
		b1 = false;
		
		//������ ����
		char ch = 'A'; //�������� Ȭ����ǥ �ȿ� �־�� �ϸ� �α��� �̻� ������ �����ϴ�.
		System.out.println("ch�� �� "+ch);
		
		char ch2 = 65 + 1; //�ƽ�Ű�ڵ� 65 : A , 97 : a
		System.out.println("ch2�� �� "+ch2);
		
		//������ ����
		//byte b = 128;//byte�ڷ����� ǥ�������� ����Ƿ� ������ ����.
		//System.out.println("b�� �� " + b);
		
		short s = 32767;
		int i = 550;
		
		System.out.println("s�� �� " + s);
		System.out.println("i�� �� " + i);
		
		//�Ǽ��� ����
		float f = 3.14f;//java���� �Ǽ��� �⺻������ double������ �ν��ϱ� ������
					   //float�ڷ����� ����Ѵٴ� ���� �������� �մϴ�. (3.14f)
		double d = 3.141592;
		
		System.out.println("f�� �� "+ f);
		System.out.println("d�� �� " + d);
		
		
	}	
}










