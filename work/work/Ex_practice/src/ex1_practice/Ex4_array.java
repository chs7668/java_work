package ex1_practice;

import java.util.Scanner;

public class Ex4_array {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 50, 3, 60, -3 };
		Scanner sc=new Scanner(System.in);

		// 문제1. arr 배열 중에서 인덱스가 1인 곳의 값을 출력해보자. 정답) 20
//		System.out.println(arr[1]);
		// 문제2. arr 배열 중에서 값이 60인 곳의 인덱스를 출력해보자. 정답) 5
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i]==60) {
//				System.out.println(i);
//			}
//		}
		// 문제3. arr 배열 안의 모든 값을 더하고, 총합과 평균을 출력해보자
//		int sum=0;
//		for(int i=0; i<arr.length; i++) {
//			sum+=arr[i];
//		}
//		System.out.println("총합:"+sum+"평균:"+(sum/arr.length));
		// 문제4. arr 배열의 인덱스가 3인 곳은 출력하지 말고, 나머지만 출력해보자.
//		for(int i=0; i<arr.length; i++) { //ex1
//			if(arr[3]!=arr[i]) {
//				System.out.println(arr[i]);
//			}
//		}
//		for(int i=0; i<arr.length; i++) {  //ex2
//			if(i==3) {
//				continue;
//			}
//			System.out.println(arr[i]);
//		}

		// 문제5. arr 배열 안의 변경하고 싶은 값의 인덱스 번호를 입력받아,
		// 그 값을 1000으로 변경해보자.
		// 예) 인덱스: 3
		// {10, 20, 30, 1000, 3, 60, -3}
//		System.out.print("인덱스값을 입력하세요 : ");
//		int choice = sc.nextInt();
//		System.out.print("변경할 값을 입력하세요 : ");
//		arr[choice]=sc.nextInt();
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}

		// 문제6. 인덱스 번호 2개를 입력받아, 그 값을 서로 바꿔보자.
		// 예) 인덱스: 1 인덱스: 2
		// {10, 30, 20, 50, 3, 60, -3}
		int[] arr2={10, 30, 20, 50, 3, 60, -3};
//		System.out.print("첫번째 인덱스를 입력하세요 : ");
//		int index1=sc.nextInt();
//		System.out.print("두번째 인덱스를 입력하세요 : ");
//		int index2=sc.nextInt();
//		int change1=arr2[index1];
//		int change2=arr2[index2];
//		arr2[index1]=change2;
//		arr2[index2]=change1;
//		for(int i=0; i<arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
		//문제7. arr 배열의 요소에서 최대값과 최소값을 구해보자.
//		int max=0;
//		int min=0;
//		for(int i=0; i<arr2.length; i++) {
//			if(max<arr2[i]) {
//				max=arr2[i];
//			}
//			if(min>arr2[i]) {
//				min=arr2[i];
//			}
//		}
//		System.out.printf("최대값 : %d 최소값 : %d\n",max,min);
		//추가 문제8. char 배열을 생성하여, 알파벳 A~Z까지 대입 후,출력해보자.알파벳은 26개.
		//추가 문제9. 8번을 역순으로 출력해보자. Z~A
		//추가 문제10. hello를 입력받아 이를 olleh로 출력해보자.


		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
