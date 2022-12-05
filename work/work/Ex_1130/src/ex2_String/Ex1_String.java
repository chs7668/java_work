package ex2_String;

import java.util.Scanner;

public class Ex1_String {
	public static void main(String[] args) {
		//모든 자바 프로그램은 Class파일 형태로 이루어져있습니다.
		//대표적인 클래스 String클래스에 대해서 알아보도록 하겠습니다.
		
		//String 클래스는 두가지 특징을 갖고 있습니다.
		//1)객체 생성 방법이 두가지(암시적,명시적)
		//2)한 번 생성된 문자열의 내용은 변하지 않는다.(불변의 특징)
		
		String s1 = "abc"; //암시적 객체 생성
		String s2 = "abc";
		
		//암시적 객체 생성을 할 때 이미 앞에 같은 문자열로 생성된
		//암시적 객체가 있다면 앞서 생성된 객체의 주소를 재사용한다.
		
		//명시적 객체 생성 :거의 모든 클래스가 객체를 생성하는 법
		
		String s3 = new String("abc"); //명시적 객체 생성
		String s4 = new String("abc");
		
		//== 연산자는 기본자료형을 비교할 때는 값을 비교한다.
		//객체끼리 비교를 할 때는 주소를 비교하는 연산자로 기능이 바뀝니다.
		if(s1 == s2) {
			System.out.println("s1과 s2는 주소가 같습니다.");
		} else {
			System.out.println("s1과 s2는 주소가 다릅니다.");
		}
		System.out.println("-----------------------------------");
		if(s3 == s4) {
			System.out.println("s3과 s4는 주소가 같습니다.");
		} else {
			System.out.println("s3과 s4는 주소가 다릅니다.");
		}
		
		System.out.println("-----------------------------------");
		if(s1.equals(s2)) {
			System.out.println("s1과 s2의 내용이 같습니다.");
		} else {
			System.out.println("s1과 s2의 내용이 다릅니다.");
		}
		System.out.println("-----------------------------------");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열입력 : ");
		String s5 = sc.next();
		
		
		if(s5 == s1) {
			System.out.println("s5와 s1의 주소가 같습니다.");
		} else {
			System.out.println("s5와 s1의 주소가 다릅니다.");
		}
		System.out.println("-----------------------------------");
		
		//불변의 법칙
		//처음에 안녕 이라고 적힌 메모리 영역에 할당이 되는데 "하세요"가 붙는 순간
		//"안녕" 뒤에 붙는게 아닌 "안녕하세요"라고 하는 메모리를 새롭게 할당 받는다.
		//남아있는 "안녕"은 JVM의 GC가 힙영역을 돌며 사용하지 않는 쓰레기 메모리를 주워간다.
		String greet = "안녕";
		greet += "하세요";
		System.out.println(greet);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
