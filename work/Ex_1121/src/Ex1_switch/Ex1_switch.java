package Ex1_switch;

public class Ex1_switch {
	public static void main(String[] args) {
		//switch : �񱳰��� ���ǰ��� ���� ����� ����ϴ� ���
		/*
		 * switch(�񱳰�){
		 * 		case ���ǰ�:
		 * 			�񱳰��� ���ǰ��� ��ġ�� �� ������ ���
		 * 		break;
		 * 		case ���ǰ�:
		 * 			�񱳰��� ���ǰ��� ��ġ�� �� ������ ���
		 * 		break;
		 * 		case ���ǰ�:
		 * 			�񱳰��� ���ǰ��� ��ġ�� �� ������ ���
		 * 		break;
		 */
		//�񱳰��� ���ǰ��� Ÿ���� ����������
		//���ǰ��� �ߺ��ɼ� ����
		//switch���� if������ �ӵ��� �� ������
		int n = 1;
		
		switch(n) {
		case 1: System.out.println("1. �����ϱ�");
		break; //switch�� ���������� Ű����
		case 2: System.out.println("2. ���ӼҰ�");
		break;
		case 3: System.out.println("3. ����");
		break;
		default: //�񱳰��� ���ǰ��� �ϳ��� ��ġ�ϴ°� ���� ��� ����
			System.out.println("�߸��Է��ϼ̽��ϴ�");
			break;
		}
				
	
	
	
	}
}
