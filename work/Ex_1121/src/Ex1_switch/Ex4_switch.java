package Ex1_switch;

import java.util.Scanner;

public class Ex4_switch {
	public static void main(String[] args) {
		//���� ��� ������ ���� month�� �ϳ� �����
		//�ش� ���� ���ϱ��� �ִ��� switch���� �̿��ؼ� �ۼ��ϼ���
		//ex) 4�� �Ѵ��� 00�� �Դϴ�. 2���� 00�� �Դϴ�.
		
		int month = 1;
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month+"���� 31���Դϴ�"); break;
		case 2: System.out.println(month+"���� 28�� �Դϴ�"); break;
		case 4: case 6: case 9: case 11:
			System.out.println(month+"���� 30�� ���� �ֽ��ϴ�");
			break;
		}
		
		System.out.println("----------------------------");
		
		//�ΰ��� ������ �ʱ�ȭ �ϰ� (���ڴ� �����)
		//������(+,-,*,/) �ϳ��� �����ϴ� ������ �ʱ�ȭ �ϰ� switch������
		//������ �����ϴ� �ڵ带 �ۼ��غ���.
		// ��°�� : 5 + 7 = 12
		Scanner scanner = new Scanner(System.in);
		int a = 10;
		int b = 2;
		char ch = '+';
		
		switch(ch) {
		case '+': 
			System.out.println(a+"+"+b+"="+(a+b)); 
			break;
		case '-': 
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case '*': 
			System.out.println(a+"*"+b+"="+(a*b));
			break;
		case '/': 
			System.out.println(a+"/"+b+"="+(a/b));
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
