package ex1_practice;

import javax.swing.JOptionPane;

public class Ex1_practice {
	public static void main(String[] args) {
		String menu = "*** �ڸ��� ������ġ ***\n";
		menu += "1. ġ�� ������ġ\n";
		menu += "2. ������ ������ġ\n";
		menu += "3. �丶�� ������ġ\n";
		menu += "4. ����\n";

		// 4. ���Ḧ ���� ����: exit = -1�� �Ǹ� ����
		int exit = 0;

		while (true) { // exit=-1; �Ǳ� ������ ���� �ݺ�
			int choice = Integer.parseInt(JOptionPane.showInputDialog(menu + "��ȣ�� �����ϼ���."));

			switch (choice) {
			case 1:
				System.out.println("ġ�� ������ġ");
				break;

			case 2:
				System.out.println("������ ������ġ");
				break;

			case 3:
				System.out.println("�丶�� ������ġ");
				
				break;

			case 4:
				exit = -1;
				System.out.println("���α׷� ����");
				break;

			default:
				System.out.println("1~3���� �Է��ϼ���!");
				// break; ��������!
				// ������ ���������� switch���� Ż���ϱ� �����̴�.

			} // switch

			// while ������ Ż���ϱ� ���� break;
			if (exit == -1) {
				break;
			}
		} // while

	} // main()
} // class