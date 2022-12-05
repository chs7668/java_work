package ex1_multi_array;

public class Ex2_multi_array {
	public static void main(String[] args) {
		// 아래 2차원 배열의 요소들의 총합,평균을 구하여 출력하세요
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
				count++;			//실행할때마다 하나씩증가해 배열안의 요소개수로 쓸수있음
			}
		}
		avg=sum/count;
		System.out.print("총합 : " + sum + "평균 : "+avg);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
