package ex2_String;

import java.util.Scanner;

public class Ex3_String {
	public static void main(String[] args) {
		//Ű���忡�� ���ڿ� Ư�����ڸ� ������ ���ĺ��� �������� �Է¹޽��ϴ�.
		//�Է¹��� ���ڿ����� �ҹ��� a�� � �ִ��� �Ǻ��ϴ� ���α׷��� �ۼ��ϼ���.
		//���
		//�Է� : qwerqwer
		//a�� ���� : 0
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("���ڿ��� �Է��� �ּ��� : ");
//		String rnd = sc.next();
//		
//		int count = 0;
//		
//		for(int i = 0; i <rnd.length(); i++) {
//			if(rnd.charAt(i) == 'a') {
//				count++;
//			}
//		}
//		System.out.println("a�� ���� : " + count);
		
		//ȸ����
		//������ �о  �ڷ� �о �Ȱ��� ������ ���ڿ� �Ǻ��ϱ�
		//������� �丶��, �ⷯ��, ������ ,���˺�, 12121
		//Ű���忡�� �Է¹��� �� ȸ������ �ƴ��� �Ǻ��ϴ� ���α׷��� �����ϼ���.
		System.out.print("���ڸ� �Է��ϼ��� : ");
		String str =sc.next(); //�����ٶ� 123321
		String str2 ="";
		int count=str.length()-1; //str�� �Է¹��� ������ ���̸� �˱����� ����
								  //�ε����� ����Ҷ� 0���� �б⶧���� -1�� �ش�
		for(int i=0; i<str.length(); i++) {
			str2+=str.charAt(count); //str2�� str�� �����Ǳ��� �� ������ �������ε�����ȣ ����ϰ� ����
			count--;				 //��:str�� "�����ٶ�"�� �Է�������� charAt(4-1)�� str�� 3�� �ε������� "��"������ϰ� str2�� �����Ѵ�
									 //�׸��� count�� -1���ְ� �ݺ��ϸ� str2���� "��ٳ���"�� �����Ҽ��ִ�
		}
		if(str.equals(str2)) {					//�Է¹��� ����str�� str���ڷ� �о� �����ص� str2�� equals�� ������ ���Ѵ�
			System.out.println("ȸ���� �Դϴ�");		//String�� �ּҰ� �� equals�� �����
		}else {
			System.out.println("ȸ������ �ƴմϴ�");
		}
		
		
		
		
		
	}
}
