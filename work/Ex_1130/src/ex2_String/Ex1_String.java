package ex2_String;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		// ��� �ڹ� ���α׷��� Class���� ���·� �̷���� �ִ�
		// ��ǥ���� Ŭ����StringŬ������ ���ؼ� �˾ƺ���
		// Ŭ������ import�� ��������� StringŬ������ import�� ��������ʴ´�(���־��⿡)

		// String Ŭ������ �ΰ��� Ư¡�� ���� �ֽ��ϴ�
		// 1)��ü ���� ����� �ΰ���(�Ͻ���,�����)
		// 2)�� �� ������ ���ڿ��� ������ ������ �ʴ´�.(�Һ��� Ư¡)

		String s1 = "abc"; // �Ͻ��� ��ü ����                     //String�� �ڷ���ó�� ���    //�迭�� ��ü
		String s2 = "abc"; 							
		//     ��ü
		
		// �Ͻ��� ��ü ������ �� �� �̹� �տ� ���� ���ڿ��� ������
		// �Ͻ��� ��ü�� �ִٸ� �ռ� ������ ��ü�� �ּҸ� �����Ѵ�				
		
		// 	  stack����           heap����
		//		s1			"abc"		�Ͻ�����ü�� �����ּҸ� ����
		//		s2						������ ���� �ּҵ� ����,������ ���⿡ �ּҰ� ����
		//		s3			"abc"		�������ü�� new�� �Ἥ �Ź� ���θ����
		//		s4			"abc"		������ ������ �ּҴ� �ٸ���
		
		// == �����ڴ� �⺻�ڷ����� ���� ���� ���� ���Ѵ�
		// ��ü���� �񱳸� �� ���� �ּҸ� ���ϴ� �����ڷ� ����� �ٲ��										
		if (s1 == s2) {
			System.out.println("s1�� s2�� �ּҰ� ����");
		} else {
			System.out.println("s1�� s2�� �ּҰ� �ٸ���");
		}
		
		//����� ��ü ���� :���� ��� Ŭ������ ��ü�� �����ϴ� ��
		String s3 =new String("abc"); //����� ��ü ����
		String s4 =new String("abc"); //new
		
		if (s3 == s4) {
			System.out.println("s3�� s4�� �ּҰ� ����");
		} else {
			System.out.println("s3�� s4�� �ּҰ� �ٸ���");
		}
		
		if(s1.equals(s2)) {   //()�� ������ �Լ�
			System.out.println("s1�� s2�� ������ �����ϴ�");
		}else {
			System.out.println("s1�� s2�� ������ �ٸ��ϴ�");
		}
		System.out.println("-----------------------------");
		Scanner sc = new Scanner(System.in);        //Ŭ���� ��ü�� = new(���Ӱ� heap������) Scanner(Ŭ������ ����)(System.in){ǥ���Է���ġ���� �Է¹ްڴ�}
		
		String s5 =sc.next();
		if(s5==s1) {
			System.out.println("s5�� s1�� �ּҰ� �����ϴ�");
		}else {
			System.out.println("s5�� s1�� �ּҰ� �ٸ��ϴ�");
		}
		if(s1.equals(s5)) {
			System.out.println("s5�� s1�� �ּҰ� �����ϴ�");
		}else {
			System.out.println("s5�� s1�� �ּҰ� �ٸ��ϴ�");
		}
		System.out.println("--------------------------");
		
		//�Һ��� Ư¡
		//ó���� �ȳ� �̶�� ���� �޸� ������ �Ҵ��� �Ǵµ� "�ϼ���"�� �ٴ¼���
		//"�ȳ�" �ڿ� �ٴ°� �ƴ� "�ȳ��ϼ���"��� �ϴ� �޸𸮸� ���Ӱ� �Ҵ� �޴´�
		//�����ִ� "�ȳ�"�� JVM�� GC(������ �÷���)�� �������� ���� ������� �ʴ� ������ �޸𸮸� �ֿ�����
 		String greet="�ȳ�";
		greet +="�ϼ���";
		System.out.println(greet);   //heap������ "�ȳ�"+"�ϼ���"�� �ƴ� "�ȳ�"    "�ȳ��ϼ���"�� �߰�����
		
		
		
		
		
		
		
		
		
		
		

	}
}
