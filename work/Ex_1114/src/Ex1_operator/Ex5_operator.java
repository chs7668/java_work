package Ex1_operator;

public class Ex5_operator {
	public static void main(String[] args) {
		//���� ������
		//1�� ������Ű�ų� 1�����ҽ�Ű�� ������
		//��������,��������
		// ++,--
		
		int a = 10;
		System.out.println(a);
		System.out.println("a : "+ ++a);//��������:��� 1�����ش�  
		System.out.println(a);
		System.out.println("a : "+ a++);//��������:�������� ����Ҷ� 1�� �����ش�
		System.out.println(a);
		System.out.println("a : "+ a);	//12
		
		int b = 20;
		System.out.println("b : "+ --b);//���న��:��� 1������
		System.out.println("b : "+ b--);//���న��:�������� ����Ҷ� 1�� ���ش�
		System.out.println("b : "+b);   //18
		System.out.println("----------------------------------");
		int c = 1;
		++c; //2
		++c; //3
		c++; //3
		++c; //5
		c++; //5
		c++; //6
		++c; //8
		//c�ǰ�? 
		System.out.println(c);
		
		//���׿�����
		//�ϳ��� ������ �����Ͽ� ������ ���ϰ�� ������ ���, ������ ��� ������ ����� ��ȯ�޴� ������.
		// ? :
		int a2 = 10;
		int b2 = 15;
		boolean result; //���� ���� ����
		
		result= ++a2>= b2 ? true : false; //���̸�   ���� :  �����̸� :����  
		System.out.println("result : "+result);
		
		char result2;
		
		result2 = (a2+1) >= b2 ? 'O' : 'X';
		System.out.println("result2 : "+result2);
		
		int result3 = a2 <= b2 ? 1 : 0;
		System.out.println("result3 : "+result3);
		
		
		
		
		
		
		
		
		
	}

}
