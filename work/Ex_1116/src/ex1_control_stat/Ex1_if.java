package ex1_control_stat;

public class Ex1_if {
	public static void main(String[] args) {
		/*
		 * ��� : ���α׷��� �帧�� �����ϴ� ����
		 * ����� ���ǹ��� �ݺ������� ������
		 * ���ǹ�:if,switch
		 * �ݺ���:while,for
		 */
		
		//if���� ����
		/*
		 * if(���ǽ�){
		 * 		���ǽ��� ���� �� ������ ���
		 * }
		 */
		//null : ��� �����ε� �ʱ�ȭ ���� ���� ����, ���� ���� ����� �����̴� ��°�
		//�����Ϸ�(jvm)���� �˷��ִ� �뵵�� Ű���� �̴�.
		int n = 30;
		String str = null;
		
		if(n<100) {
			str = "n�� 100���� �۽��ϴ�";
		}else if(n>100) {
			str = "n�� 100���� ũ��";
		}
		System.out.println(str);
		
		if(n%2 == 0) { //¦��,Ȧ�� ���Ҷ�
			System.out.println(n+"�� ¦���Դϴ�");
		}
		
		if(n % 5 == 0) {//n�� ����� ���Ҷ�
			System.out.println(n+"�� 5�ǹ���Դϴ�");
		}
		
		System.out.println("-------------------");
		
		
		//if - else
		/*
		 * if(���ǽ�){
		 * 		���ǽ��� ���϶� �����Ҹ��
		 * } else {
		 * 		���ǽ��� ������ �� ������ ���
		 * }
		 */
		
		int i = 50;
		String str2 = null;
		
		if(i>100) {
			str2 = "i�� 100���� Ů�ϴ�";
		}else {
			str2 = "i�� 100���� �۽��ϴ�";
		} System.out.println(str2);
		
		System.out.println("-----------------------------");
		/*
		 * ���� age�� ���̸� �����ϰ�, 30�� �̻��̸�
		 * "30�� �̻��Դϴ�. ��� ����ϰ�, �׷��� ������ "���̸� �� ��ž� �ڳ׿�"��� ����ϴ�
		 * if-else���� ������ �� ���������� "�����մϴ�"��� ������ ����ϼ���.
		 */
		
		
		int age = 32;
		String str3 = null;
		if(age>=30) {
			str3 = "30�� �̻��Դϴ�.";
		}else {
			str3 = "���̸� �� ��ž� �ڳ׿�.";
		}
		System.out.println(str3);
		System.out.println("�����մϴ�.");
		
		String old = null;
		old = age >= 30 ? "30�� �̻��Դϴ�" : "���̸� �� ��ž� �ڳ׿�.";
		System.out.println(old);
		
		
	}

}
