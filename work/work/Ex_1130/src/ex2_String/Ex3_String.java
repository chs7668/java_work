package ex2_String;

import java.util.Scanner;

public class Ex3_String {
	public static void main(String[] args) {
		//키보드에서 숫자와 특수문자를 제외한 알파벳을 무작위로 입력받습니다.
		//입력받은 문자열에서 소문자 a가 몇개 있는지 판별하는 프로그램을 작성하세요.
		//결과
		//입력 : qwerqwer
		//a의 개수 : 0
		
		Scanner sc = new Scanner(System.in);
//		System.out.print("문자열을 입력해 주세요 : ");
//		String rnd = sc.next();
//		
//		int count = 0;
//		
//		for(int i = 0; i <rnd.length(); i++) {
//			if(rnd.charAt(i) == 'a') {
//				count++;
//			}
//		}
//		System.out.println("a의 개수 : " + count);
		
		//회문수
		//앞으로 읽어도  뒤로 읽어도 똑같이 읽히는 문자열 판별하기
		//예를들어 토마토, 기러기, 스위스 ,별똥별, 12121
		//키보드에서 입력받은 후 회문인지 아닌지 판별하는 프로그램을 구현하세요.
		System.out.print("문자를 입력하세요 : ");
		String str =sc.next(); //가나다라 123321
		String str2 ="";
		int count=str.length()-1; //str에 입력받은 문자의 길이를 알기위한 변수
								  //인덱스로 출력할때 0부터 읽기때문에 -1을 준다
		for(int i=0; i<str.length(); i++) {
			str2+=str.charAt(count); //str2에 str의 문자의길이 즉 문자의 마지막인덱스번호 출력하고 대입
			count--;				 //예:str에 "가나다라"를 입력했을경우 charAt(4-1)로 str의 3번 인덱스값인 "라"를출력하고 str2에 대입한다
									 //그리고 count에 -1을주고 반복하면 str2에는 "라다나가"로 대입할수있다
		}
		if(str.equals(str2)) {					//입력받은 문자str과 str을뒤로 읽어 대입해둔 str2를 equals로 내용을 비교한다
			System.out.println("회문수 입니다");		//String은 주소값 비교 equals는 내용비교
		}else {
			System.out.println("회문수가 아닙니다");
		}
		
		
		
		
		
	}
}
