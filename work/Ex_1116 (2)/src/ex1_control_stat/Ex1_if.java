package ex1_control_stat;

public class Ex1_if {
	public static void main(String[] args) {
		/*
		 * ��� : ���α׷��� �帧�� �����ϴ� ����
		 * 
		 * ���ǹ��� �ݺ������� ������.
		 * 
		 * ���ǹ� : if, switch
		 * �ݺ��� : while, for
		 * 
		 * */
		
		//if���� ����
		/*
		 * if(���ǽ�){
		 * 		���ǽ��� ���� �� ������ ���
		 * }
		 * */
		//null : ��� �����ε� �ʱ�ȭ ���� ���� ����, ���� ���� ����� �����̴� ��°�
		//�����Ϸ�(jvm)���� �˷��ִ� �뵵�� Ű���� �̴�.
		int n = 50;
		String str = null;
		
		if(n > 100) {
			str = "n�� 100���� �۽��ϴ�.";
		}
		System.out.println(str);
		
		
		if(n % 2 == 0) {//¦�� Ȧ���� �Ǻ��� ��
			System.out.println(n+"�� ¦�� �Դϴ�.");
		}
		
		if(n % 5 == 0) {//N�� ����� ���� ��
			System.out.println(n+"�� 5�� ����Դϴ�.");
		}
		
		
		System.out.println("-------------------------------");
		
		
		//if - else
		/*
		 * if(���ǽ�){
		 * 		���ǽ��� ���� �� ������ ���
		 * } else {
		 * 		���ǽ��� ������ �� ������ ���
		 * }
		 * */
		
		int i = 50;
		String str2 = null;
		
		if(i > 100) {
			str = "i�� 100���� Ů�ϴ�.";
		} else {
			str = "i�� 100���� �۽��ϴ�.";
		}
		System.out.println(str);
		
		
		if(++i >= 50) {
			str = "i�� 50�̻��� ��";
		} else {
			str = "i�� 50�̸��� ��";
		}
		System.out.println(i);
		System.out.println(str);
		
		System.out.println("---------------------------------------");
		/*
		 * ���� age�� ���̸� �����ϰ�, 30�� �̻��̸�
		 * "30�� �̻��Դϴ�." ��� ����ϰ�, �׷��� ������ "���̸� �� ��ž� �ڳ׿�"��� ����ϴ�
		 * if-else���� ������ �� ���������� "�����մϴ�" ��� ������ ����غ�����.
		 * */
		int age = 25;
		String str3 = null;
		if(age >= 30) {
			str3 = "30�� �̻��Դϴ�.";
		} else {
			str3 = "�� ��ž� �ڳ׿�";
		}
		System.out.println(str3);
		
		
		System.out.println("�����մϴ�.");
		
		//�� �ڵ带 ���׿����ڷ� �����ϱ�.
		
		int age2 = 26;
		String str4 = age2 >= 30 ? "30�� �̻��Դϴ�" : " �� ��ž� �ڳ׿�";
		
		System.out.println(str4);
		
		
		
		
		
		
		
		
	}
}
