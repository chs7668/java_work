package ex2_String;

import java.util.Scanner;

public class Ex3_String {
	public static void main(String[] args) {
		//Ű���忡�� ���ڿ� Ư�����ڸ� ������ ���ĺ��� �������� �Է¹޽��ϴ�
		//�Է¹��� ���ڿ����� �ҹ��� a�� � �ִ��� �Ǻ��ϴ� ���α׷��� �ۼ��ϼ���
		//���
		//�Է� : qwerqwer
		//a�� ���� : 0
		Scanner sc=new Scanner(System.in);
//		int count=0;
//		System.out.print("���ĺ��� �Է��ϼ��� : ");
//		String ap =sc.next();
//		for(int i=0; i<ap.length(); i++) {
//			if(ap.charAt(i)=='a') {
//				count++;
//			}
//		}
//		System.out.println("a�� ���� : "+count);
		
		
		//ȸ����
		//������ �о �ڷ� �о �Ȱ��� ������ ���ڿ� �Ǻ��ϱ�
		//������� �丶��,�ⷯ��,������,12121
		//Ű���忡�� �Է¹��� �� ȸ�������� �ƴ��� �Ǻ��ϴ� ���α׷��� �����ϼ���
		
		System.out.print("���ڸ� �Է��ϼ��� : ");
		String str = sc.next();
		String str2="";
		int count=str.length()-1;
		for(int i=0; i<str.length(); i++) {
			str2+=str.charAt(count);
			count--;
		}
		if(str.equals(str2)) {
			System.out.printf("%s �� %s�� �������о �ڷ��о �����ϴ�",str,str2);
		}else {
			System.out.printf("%s �� %s�� �������о �ڷ��о �ٸ��ϴ�",str,str2);
		}
		
		
	}

}
