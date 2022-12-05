package ex2_array;

public class Ex2_array {
	public static void main(String[] args) {
		char[] ch;
		ch = new char[4];
//		char[] ch = new char[4];
		
		ch[0] = 'J';
		ch[1] = 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		//배열 내용 출력
		for(int i =0; i<ch.length; i++) {
			System.out.printf("ch[%d] : %c\n",i,ch[i]);
		}
		
		String[] str = new String[3];
		str[0] = "hello";
		
		for(int i = 0; i<str.length; i++) {
			System.out.println(str[i]);
		}
		System.out.println(ch); //문자형 배열의 이름으로 출력시 내용이 잘 출력된다
		System.out.println(str);//문자열 배열의 이름으로 출력시 내용이 이상하게 나오는 모습을 볼 수있다
		
		
	}

}
