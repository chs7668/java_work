package ex2_String;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		//��� �ڹ� ���α׷��� Class���� ���·� �̷�����ֽ��ϴ�.
		//��ǥ���� Ŭ���� StringŬ������ ���ؼ� �˾ƺ����� �ϰڽ��ϴ�.
		
		//String Ŭ������ �ΰ��� Ư¡�� ���� �ֽ��ϴ�.
		//1)��ü ���� ����� �ΰ���(�Ͻ���,�����)
		//2)�� �� ������ ���ڿ��� ������ ������ �ʴ´�.(�Һ��� Ư¡)
		
		String s1 = "abc"; //�Ͻ��� ��ü ����
		String s2 = "abc";
		
		//�Ͻ��� ��ü ������ �� �� �̹� �տ� ���� ���ڿ��� ������
		//�Ͻ��� ��ü�� �ִٸ� �ռ� ������ ��ü�� �ּҸ� �����Ѵ�.
		
		//����� ��ü ���� :���� ��� Ŭ������ ��ü�� �����ϴ� ��
		
		String s3 = new String("abc"); //����� ��ü ����
		String s4 = new String("abc");
		
		//== �����ڴ� �⺻�ڷ����� ���� ���� ���� ���Ѵ�.
		//��ü���� �񱳸� �� ���� �ּҸ� ���ϴ� �����ڷ� ����� �ٲ�ϴ�.
		if(s1 == s2) {
			System.out.println("s1�� s2�� �ּҰ� �����ϴ�.");
		} else {
			System.out.println("s1�� s2�� �ּҰ� �ٸ��ϴ�.");
		}
		System.out.println("-----------------------------------");
		if(s3 == s4) {
			System.out.println("s3�� s4�� �ּҰ� �����ϴ�.");
		} else {
			System.out.println("s3�� s4�� �ּҰ� �ٸ��ϴ�.");
		}
		
		System.out.println("-----------------------------------");
		if(s1.equals(s2)) {
			System.out.println("s1�� s2�� ������ �����ϴ�.");
		} else {
			System.out.println("s1�� s2�� ������ �ٸ��ϴ�.");
		}
		System.out.println("-----------------------------------");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��Է� : ");
		String s5 = sc.next();
		
		
		if(s5 == s1) {
			System.out.println("s5�� s1�� �ּҰ� �����ϴ�.");
		} else {
			System.out.println("s5�� s1�� �ּҰ� �ٸ��ϴ�.");
		}
		System.out.println("-----------------------------------");
		
		//�Һ��� ��Ģ
		//ó���� �ȳ� �̶�� ���� �޸� ������ �Ҵ��� �Ǵµ� "�ϼ���"�� �ٴ� ����
		//"�ȳ�" �ڿ� �ٴ°� �ƴ� "�ȳ��ϼ���"��� �ϴ� �޸𸮸� ���Ӱ� �Ҵ� �޴´�.
		//�����ִ� "�ȳ�"�� JVM�� GC�� �������� ���� ������� �ʴ� ������ �޸𸮸� �ֿ�����.
		String greet = "�ȳ�";
		greet += "�ϼ���";
		System.out.println(greet);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
