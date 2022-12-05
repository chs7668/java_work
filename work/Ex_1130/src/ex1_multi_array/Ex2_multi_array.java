package ex1_multi_array;

public class Ex2_multi_array {
	public static void main(String[] args) {
		//아래 2차원 배열의 요소들의 총합,평균을 구하여 출력하세요
		int arr[][] = {{1,2,3,4,5},
					   {6,7,8},
					   {11},
					   {16,17,18,19}
					   };
		int count = 0;
		int total = 0;
		double avg = 0.0;
		for(int i = 0; i <arr.length; i++) {
			for(int j = 0; j <arr[i].length; j++) {
				total+= arr[i][j];
				count++;
			}
		}
		avg = total/count;
		System.out.println("총합 : " + total);
		System.out.println("평균 : " + avg);
		
		
	}
}
