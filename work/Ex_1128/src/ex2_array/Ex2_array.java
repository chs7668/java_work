package ex2_array;

public class Ex2_array {
	public static void main(String[] args) {
		char[] ch;
		ch = new char[4];
//		char[] ch = new char[4];
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		//�迭 ���� ���
		for(int i =0; i<ch.length; i++) {
			System.out.printf("ch[%d] : %c\n",i,ch[i]);
		}
		
		String[] str = new String[3];
		str[0] = "hello";
		
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println(ch); //������ �迭�� �̸����� ��½� ������ �� ��µȴ�
		System.out.println(str);//���ڿ� �迭�� �̸����� ��½� ������ �̻��ϰ� ������ ����� �� ���ִ�
		
		
	}

}
