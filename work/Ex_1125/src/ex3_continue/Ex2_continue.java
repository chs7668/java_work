package ex3_continue;

public class Ex2_continue {
	public static void main(String[] args) {
		int n =0;
		while(n<10) {
			n++;
			if(n%2!=0){
				//while������ continue�� ������ �Ǹ� ���ǽ����� �̵�
				continue;
			}
			System.out.println(n);
		}
		System.out.println("----------------------");
		
		n=0;
		
		w:while(n<10) {
			n++;
			
			switch(n) {
			case 1: System.out.println("switch�� 1�� ���İ�"); break w;
			//switch������ break�� �ݺ����� ���������°� �ƴ� switch���� �����Եȴ�
			case 2: System.out.println("switch�� 2�� ���İ�"); continue;
			//switch���� �ܵ����� ������� ���� continue�� ����� �� ����
			}
		}
		
		
		
		
		
		
		
		
	}

}
