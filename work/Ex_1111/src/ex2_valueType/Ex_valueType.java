package ex2_valueType;

public class Ex_valueType {
	public static void main(String[] args) {
		boolean b1 = true;
		System.out.println("b1�� ��="+b1);
		b1=false;
		
		//������ ����
		char ch = 'a'; //�ڷ��� ������ = '����'
		System.out.println("���� ch�ǰ�="+ch);
		
		//������ ����
		byte b = 127;	//byte�ڷ����� ǥ������ (-128~127)
		System.out.println(b);
		
		//�Ǽ��� ����
		float f = 3.14159265f;
		System.out.println("f�� ��="+f);
		double d = 3.14159265;
		System.out.println("d�� ��="+d);
	}
	
}
/*
 * ������:�Ҽ����� ���� ����(-1,0,1)
 * -byte  1byte	-128~ 127
 * -short 2byte	-32,768 ~ 32,767
 * -int	 4byte	-21��~21��
 * -long	 8byte	-900��~900��
 * 
 * ������:�ѱ���
 * -char 1byte
 * 
 * �Ǽ���:�Ҽ����� �ִ� ����
 * -float 4byte
 * -double 8byte
 * 
 * ����:boolen 1bit
 * 
 * ����
 * �ڷ��� ������; ->������ ����
 */