package ex2_break;

public class Ex3_label_break {
	public static void main(String[] args) {
		//label : Ư�� �ݺ����� �̸�ǥ�� �ٿ� �� �� �̻��� �ݺ�����
		//������ �� �ֵ��� �ϴ� Ű����
		
		//label�� �׻� ������ �����մϴ�.
		//label�� �̸��� �ڱⰡ ���ϴ´�� ����� �����մϴ�.
		
		//label�� �ڽ��� �����ϰ� �ִ� ���� ���信�Ը� �� �� �ֽ��ϴ�.
		
		happy:for(int i = 1; i<=3; i++) {
			
			for(int k = 1; k<=10; k++) {
				System.out.printf("%d ",k);
			}
			
			for(int j = 1; j<=10; j++) {
				if(j % 2 == 0) {
					break happy;
				}
				System.out.printf("%d ",j);
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
