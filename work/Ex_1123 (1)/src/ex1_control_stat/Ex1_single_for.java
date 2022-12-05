package ex1_control_stat;

public class Ex1_single_for {
	public static void main(String[] args) {
		//��� : ���α׷��� �帧�� �����ϴ� ����
		// - ���ǹ� : if, switch
		// - �ݺ��� : while, for
		
		// for : Ư�� ���๮�� ���ϴ¸�ŭ �ݺ��ϴ� ����
		// for(�ʱ��(����); ���ǽ�(�ʰ�,�̸�,�̻�,����); ������(����)){
		//	 ���ǽ��� ���� �� �ݺ��� ���
		//}
		
		//1~3���� ����ϱ� System.out.println(); -> ��¹� �ݺ� �ۼ�
		
		for(int i = 0; i <= 2; i++) {
			
			System.out.println(i+1);
			
		}
		System.out.println("---------------------");
		//1~10���� ����ϴ� for�� �ۼ��ϱ�
		for(int i = 1; i <=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("---------------------");
		//10���� 1���� �Ųٷ� ����ϴ� for�� �ۼ��ϱ�
		int number2 = 10;
		for(int i = 0; i <= 9; i++) {
			System.out.println(number2);
			number2--;
		}
		
		//1. ���� ����� �ݺ��Ұ��� Ȯ���ϰ� ���ϱ� 
		//2. ��������(�ʱ�� i)�� ����� �� ������ ����ϱ� (����ص� �ǰ� ���ص� �ǰ�)
		
		System.out.println("------------------------");
		
		//1~5���� �� ���� for���� ���� ����ϱ�
		int sum = 0; //�� ���� ���� ����
		
		for(int i = 1; i<=5; i++) {
			sum += i; //sum = sum + i
		}
		
		System.out.println("1~5������ �� �� : " + sum);
		
		System.out.println("------------------------");
		//������ ���� n �� ������ ������ �ϳ� �����ϰ�
		//1~n���� �� ���� for���� ���� ����ϱ�
		int n = 3;
		int total = 0; //1~n������ �� ���� ����� ����
		
		for(int i = 1; i <= n; i++) {
			total += i; //total = total + i
		}
		System.out.println("1~"+n+"������ �� : " + total);
		System.out.println("------------------------");
		//������ ���� dan ���� 2~9 ������ ������ �ް�
		//�ش� �������� for���� �̿��Ͽ� ����ϼ���.
		//��°��
		//2
		//4
		//6
		//8
		//10
		//12
		//14
		//16
		//18
		
		int dan = 5; //������ 2~9 *������ 8�� �ؾߵȴ�.
		for(int i = 2; i<=9; i++) {
			System.out.println(dan +"x"+ i+"="+(dan*i));
		}
		
		System.out.println("------------------------");
		//1~10���� �ݺ��ϴ� ���忡�� 3�� ����� ����ϴ� for���� �ۼ��غ�����.
		//��°��
		//3
		//6
		//9
		
		for(int i = 1; i <= 10; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("------------------------");
		
		//1~20���� Ȧ���� ����ϴ� for�� �ۼ��ϱ�
		for(int i = 1; i<=20; i++) {
			if(i % 2 !=0) {
				System.out.println(i);
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
