package Ex1_operator;

public class Ex4_operator {
	public static void main(String[] args) {
		//��Ʈ ������
		/*
		 * �� �����ڿ� ���������� bit����(2����)�� ���길 �����ϴ�
		 *
		 */
		//true-> 1
		//false->0
		int a = 10;  //1010
		int b = 7;	 //0111
				//�����  0010
		int c = a&b; //����(and)
		System.out.println("c�ǰ�="+c);
		
		int a2= 12;  //1100   
		int b2= 8;	 //1000
					 //1100
		int c2 =  a2 | b2; // ����(or) - 2������ ���� �ϳ��� 1�̸� 1 �Ѵ� 0�̸� 0
		System.out.println("c2="+c2);
		System.out.println("---------------------------------------");
		
		//����Ʈ ������
		//bit����(2����)�� ������ ���������� ������ Ȥ�� �������� �̵����� �������� ��ȭ�� �ش�.
		
		int a3 = 12; //1100
		int b3 = 3;  //0011
		
		int c3 = a3 >> b3; //a��b��ŭ ���������� �̵����Ѷ�
		System.out.println("c3="+c3);
		
		int d = c3 << b3;  //c3�� b��ŭ �������� �̵�
		System.out.println("d="+d);
		
		char ch = 'F'; //1000110
		int num = 1;
		char ch_result = (char)(ch >> num);
		System.out.println("ch_result ="+ch_result);
				
		
		
		
		
		
		
		
		
		
	
	}

}
