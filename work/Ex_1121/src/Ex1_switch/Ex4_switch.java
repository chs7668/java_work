package Ex1_switch;

public class Ex4_switch {
	public static void main(String[] args) {
		//���� ��� ������ ���� month�� �ϳ� �����
		//�ش� ���� ���ϱ��� �ִ��� switch���� �̿��ؼ� �ۼ��ϼ���.
		//ex) 4�� �Ѵ��� oo�� �Դϴ�. , 2���� oo�� �Դϴ�.
		
		int month = 5;
		
		switch(month) {
		case 1: case 3: case 5: case 7:
		case 8: case 10: case 12:
			System.out.println(month + "���� 31�ϱ��� �ֽ��ϴ�.");
			break;
		case 2:
			System.out.println(month + "���� 28�ϱ��� �ֽ��ϴ�.");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(month + "���� 30�ϱ��� �ֽ��ϴ�.");
			break;
		}
		
		System.out.println("----------------------------------------------");
		
		//�ΰ��� ������ �ʱ�ȭ �ϰ�(���ڴ� �����)
		//������(+,-,*,/) �ϳ��� �����ϴ� ������ �ʱ�ȭ �ϰ� switch������
		//������ �����ϴ� �ڵ带 �ۼ��غ���.
		// ��°�� : 5 + 7 = 12
		
		int a = 5; //�ʱ�ȭ : ���� + ����
		int b = 7;
		
		char ch = '/';
		//String str = "+";
		
		switch(ch) {
		case '+':
			System.out.println(a + "+" + b + "="+(a+b));
			break;
		case '-':
			System.out.println(a + "-" + b + "="+(a-b));
			break;
		case '*':
			System.out.println(a + "*" + b + "="+(a*b));
			break;
		case '/':
			System.out.println(a + "/" + b + "="+(a/b));
			break;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
