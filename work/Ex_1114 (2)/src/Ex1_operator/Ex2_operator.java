package Ex1_operator;

public class Ex2_operator {
	public static void main(String[] args) {
		//���Կ�����
		// = Ư������ ������ �����Ͽ� ����ų �� ����ϴ� ������
		
		int n1 = 10; //n1�̶�� int�� ������ 10�̶�� ������ ������.
		int n2 = 7;
		
		System.out.println("=������ : n1 = " + n1 + ", n2= " + n2);
		
		int n3 = 5;
		int n4 = 9;
		
		System.out.println("+=������: n3 += n4 " + (n3+=n4));//n3 = n3 + n4;
		System.out.println("n3�� �� : " + n3);
		int n5 = 10;
		int n6 = 3;
		
		System.out.println("-=������: n5 -= n6 " + (n5-=n6));//n5 = n5 - n6;
		
		int n7 = 12;
		int n8 = 5;
		
		System.out.println("/=������: n7 /= n8 " + (n7 /= n8));//n7 = n7 / n8
		
	}

}
