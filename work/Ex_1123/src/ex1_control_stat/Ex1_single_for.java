package ex1_control_stat;

public class Ex1_single_for {
	public static void main(String[] args) {
		//���:���α׷��� �帧�� �����ϴ� ����
		// - ���ǹ� : if ,switch
		// - �ݺ��� : while, for
		
		// for : Ư�� ���๮�� ���ϴ¸�ŭ �ݺ��ϴ� ����
		// for(�ʱ��(����); ���ǽ�(�ʰ�,�̸�,�̻�,����); ������(�ַ�������){
		// 	���ǽ��� ���϶� �ݺ��� ���
		//}
		
		int num = 1;
		//1~3���� ����ϱ�
		for(int i=1; i<=3; i++) {
			System.out.println(num);
			num*=2;
		}
		
		for(int i=1; i<=3; i++) {
			System.out.println(i);
		}
		System.out.println("-------------------------------");
		//1~10���� ����ϴ� for�� �ۼ��ϱ�
		for(int i=0; i<10;  i++) {
			System.out.println(i+1);
		}
		System.out.println("------------------");
		//10���� 1���� �Ųٷ� ����ϴ� for�� �ۼ��ϱ�
		for(int i=10; i>0; i--) {
			System.out.println(i);
		}
		
		//1. �ݺ����� ����� �ݺ��Ұ��� Ȯ���ϰ� ���ϱ�
		//2, ��������(�ʱ�� i)�� ����� �� ������ ����ϱ�
		System.out.println("----------------");
		//1~5���� �� ��
		int sum=0;
		for(int i = 1; i<=5; i++) {
			sum+=i;
		}
		
		System.out.println(sum);
		
		System.out.println("------------------");
		//������ ����n�� ������ ������ �ϳ� �����ϰ� 1~n���� �� ����  for���� ���� ����ϱ�
		int sum2 = 0;
		int n = 7;
		for(int i=1; i<=n; i++) {
			sum2+=i;
		}
		System.out.println("1����"+n+"������ ����"+sum2+"�Դϴ�");
		
		//������ ���� dan ���� 2~9������ �������ް�
		//�ش� ��������  for���� �̿��Ͽ� ����ϼ���
		
		int dan = 7;
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}
		
		//1~10���� �ݺ��ϴ� ���忡�� 3�� ����� ����ϴ� for���� �ۼ��غ�����.
		//��°�� 3,6,9
		for(int i = 1; i<=10; i++) {
			if(i%3==0) {
			System.out.println(i);	
			}
			
		}
		
		System.out.println("----------------------");
		
		//1~20���� Ȧ���� ����ϴ� for�� �ۼ��ϱ�
		for(int i=1; i<=20; i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
