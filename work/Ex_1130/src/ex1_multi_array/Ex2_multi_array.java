package ex1_multi_array;

public class Ex2_multi_array {
	public static void main(String[] args) {
		// �Ʒ� 2���� �迭�� ��ҵ��� ����,����� ���Ͽ� ����ϼ���
		int arr[][] = { { 1, 2, 3, 4, 5 }, 
				{ 6, 7, 8, 9, 10 }, 
				{ 11, 12, 13, 14, 15 },
				{ 16, 17, 18, 19, 20 } };
		int count=0;
		int sum = 0;
		double avg =0.0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum+=arr[i][j];
				count++;			//�����Ҷ����� �ϳ��������� �迭���� ��Ұ����� ��������
			}
		}
		avg=sum/count;
		System.out.print("���� : " + sum + "��� : "+avg);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
