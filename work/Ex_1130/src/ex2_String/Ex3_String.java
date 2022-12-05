package ex2_String;

import java.util.Scanner;

public class Ex3_String {
	public static void main(String[] args) {
		//키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받습니다
		//입력받은 문자열에서 소문자 a가 몇개 있는지 판별하는 프로그램을 작성하세요
		//결과
		//입력 : qwerqwer
		//a의 개수 : 0
		Scanner sc=new Scanner(System.in);
//		int count=0;
//		System.out.print("알파벳을 입력하세요 : ");
//		String ap =sc.next();
//		for(int i=0; i<ap.length(); i++) {
//			if(ap.charAt(i)=='a') {
//				count++;
//			}
//		}
//		System.out.println("a의 개수 : "+count);
		
		
		//회문수
		//앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 문자열 판별하기
		//예를들어 토마토,기러기,스위스,12121
		//키보드에서 입력받은 후 회문수인지 아닌지 판별하는 프로그램을 구현하세요
		
		System.out.print("문자를 입력하세요 : ");
		String str = sc.next();
		String str2="";
		int count=str.length()-1;
		for(int i=0; i<str.length(); i++) {
			str2+=str.charAt(count);
			count--;
		}
		if(str.equals(str2)) {
			System.out.printf("%s 와 %s는 앞으로읽어도 뒤로읽어도 같습니다",str,str2);
		}else {
			System.out.printf("%s 와 %s는 앞으로읽어도 뒤로읽어도 다릅니다",str,str2);
		}
		
		
	}

}
