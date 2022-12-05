package Ex1_switch;

public class Ex2_switch {
	public static void main(String[] args) {
		
		char ch = 'A';
		
		switch(ch) {
		case 'A':
			System.out.println("점수는 100~90점 사이입니다.");
			break;
		case 'B':
			System.out.println("점수는 89~80점 사이입니다.");
			break;
		case 'C':
			System.out.println("점수는 79~70점 사이입니다.");
			break;
		case 'D':
			System.out.println("점수는 69~60점 사이입니다.");
			break;
		case 'F':
			System.out.println("점수는 59점 이하입니다.");
			break;
		}
	}
}
