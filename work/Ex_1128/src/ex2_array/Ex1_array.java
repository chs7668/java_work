package ex2_array;

public class Ex1_array {
	public static void main(String[] args) {
		//�迭(array) : ���� �ڷ������� �����͸� ��Ƶ� �ϳ��� ����
		//�������� ȿ������ ������ ���ؼ� �ݵ�� �ʿ�
		
		//������ ����-> �������� �ʿ��ϸ� ������ ���� ������ �մϴ�
		int su1 = 1;
		int su2 = 2;
		int su3 = 3;
		int su4 = 4;
		
		//���ϰ� �ڿ����� �����ϰ� �����ϱ� ���ؼ���
		//������ ���� �迭�� �����Ѵ�
		//1) �迭 ����
		//�ڷ��� [] �迭��;
		int[] ar;
		//2) �迭 ����
		ar = new int[4];
		//3) �迭 �ʱ�ȭ
		int[]arr= {100,200,300,400};//�ʱ�ȭ�� �߰�ȣ{} ���� ������ ���� ��ŭ
		//4) ���� �� ����
		ar[0] = 100;
		ar[1] = 200;
		ar[2] = 300;
		ar[3] = 400;
		
		//�迭�� ���
		System.out.println(ar[0]);
		System.out.println(ar[1]);
		System.out.println(ar[2]);
		System.out.println(ar[3]);
		System.out.println("---------------------");
		//�迭�� ���2
		for(int i=0; i<4; i++) {
			
			System.out.println(ar[i]);
		}
		
		
//		ar[i] = i+4;
		
		
	}

}
