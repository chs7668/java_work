package ex2_array;

import java.util.Random;

public class Ex3_array {
	public static void main(String[] args) {
		//�迭 arr�� ����ִ� ��� ���� ���� ����ϼ���
		//��� : oo
//		int sum=0;
//		int [] arr= {10,20,30,40,50};
//		for(int i=0; i<arr.length; i++) {
//			sum+=arr[i];
//		}
//		System.out.println("��� : "+sum);
		
		//�߻��� ���� money�� �������� �ٲٸ� �� ������ ��� �ʿ�����
		//�Ǵ��ϴ� �ڵ带 �ۼ��ϼ���.
		//�ݾ��� 10~5000�� ���� 1���ڸ� ���ڴ� 0���θ����
		//������ �������� ������ ����ϼ���
		//4170
		//500�� : 8
		//100�� : 1
		//50�� : 1
		//10�� : 2
		//1.10~5000������ ��������(1�� �ڸ��� 0�̵Ǵ� ��� �����ϱ�)
		//2.������ ����ִ� �迭 �����
		//3.���� ���ϴ� ������, �������� ���ϴ� �����⸦ Ȱ��
		int money = new Random().nextInt(5000)+10;
		money/=10;
		money*=10;
		int [] arr= {500,100,50,10};
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+"�� : "+money/arr[i]);
			money%=arr[i];
		}
		
		
		
		
		
}
}
