package ex1_control_stat;

public class Ex2_if {

	public static void main(String[] args) {
		//if - else if , else
		/*
		 * if(���ǽ�1){
		 * ���ǽ�1�� ���� �� ������ ���
		 * } else if (���ǽ�2){
		 * ���ǽ�1�� �����̰� ���ǽ�2�� ���� �� ������ ���
		 * } else if (���ǽ�3){
		 * ���ǽ�1,2�� �����̰� ���ǽ�3�� ���� �� ������ ���
		 * } else {
		 * ��� ���ǽ��� �����ϰ�� ������ ���
		 * }
		 */
		
		int score = 70;
		
		if(score > 100) {
			System.out.println("100������ ������ �Է����ּ���");
		} else if (score>=90) {
			System.out.println("������ A�Դϴ�.");
		} else if (score>=80) {
			System.out.println("������ B�Դϴ�.");
		} else if (score>=70) {
			System.out.println("������ C�Դϴ�.");
		} else if (score>=60) {
			System.out.println("������ D�Դϴ�.");
		} else {
			System.out.println("������ F�Դϴ�.");
		}
		
		
		
		
		
		
		
		
	}

}
