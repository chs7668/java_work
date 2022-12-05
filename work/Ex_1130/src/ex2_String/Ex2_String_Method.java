package ex2_String;

public class Ex2_String_Method {
	public static void main(String[] args) {
		//메서드(함수)는 어떤 작업을 수행하기 위한 명령문의 집합이다
		//메서드를 사용하는 가장큰 이유는 반복적으로 사용되는 코드를 줄이기 위해서이다
		//자주 사용되는 내용의 코드를 메서드로 작성해두고 필요할 때마다 호출만 하면 된다
		//클래스에는 변수와 함수만올수있다?
		
		String str="Hong Gil Dong";
		
		//length() : 문자열의 길이를 셀 때 사용하고 값을 int값으로 반환합니다
		System.out.println("문자열의 str의 길이"+str.length());
		//indexof() : 소괄호 안에서 글자를 처음으로 만나는 위치의 index값을 받습니다
		int index=str.indexOf('G');
		System.out.println("맨 처음 만나는 G의 위치 : "+index); //index라서 0부터시작
		index=str.indexOf("Dong");
		System.out.println("맨 처음 만나는 Dong의 위치 : "+index);
		
		//lastindexOf() : 글자를 거꾸로 찾는다.
		index =str.lastIndexOf('o');
		System.out.println("마지막 문자 o의 위치 : "+index);
		
		//charAt() : 인덱스 번호를 갖고 해당 인덱스에 해당하는 글자를 가져온다
		char c =str.charAt(5);
		System.out.println("추출한 문자 : "+c);
		
		//substring() : 출력하고 싶은 부분의 인덱스를 적어서 문자열 잘라내기
		String str2 =str.substring(0,5);
		//str.substring(여기부터,5미만까지),0번부터 5글자 가져오기
		System.out.println("0번째 부터 5미만의 인덱스까지의 문자열  : "+str2);
		
		//.equalsIgnoreCase() : 대소문자를 무시하고 알파벳이 같으면 참
		String exam ="APPLE";
//		String exam=str.toLowerCase();
		if(exam.equalsIgnoreCase("apple")) { 
			System.out.println("exam은 apple입니다");
		}else {
			System.out.println("exam은 apple이 아닙니다");
		}
		
		//trim() : 문자열 앞뒤의 의미없는 공백을 제거
		String id ="  abc ";
		if((id.trim()).equals("abc")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		//Integer.parseInt() : 문자열 숫자를 정수형숫자로 바꾸어줌
		String number ="1";
		System.out.println(number+10);
		System.out.println(Integer.parseInt(number)+10);
		System.out.println(Integer.parseInt("10")+10);
		
		//split() : 소괄호 안에 기준으로 문자열을 분할
		String arr[]=str.split("g");
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d] : %s\n",i,arr[i]);
		}
		
		//기본자료형의 wrapper 클래스
		//int->Integer
		//char->Charater
		//boolean->Boolean
		//byte->Byte
		//short->
		//float->
		//long->
		//double->
		
	}

}
