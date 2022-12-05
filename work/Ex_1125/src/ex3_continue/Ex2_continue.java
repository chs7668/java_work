package ex3_continue;

public class Ex2_continue {
	public static void main(String[] args) {
		int n =0;
		while(n<10) {
			n++;
			if(n%2!=0){
				//while문에서 continue를 만나게 되면 조건식으로 이동
				continue;
			}
			System.out.println(n);
		}
		System.out.println("----------------------");
		
		n=0;
		
		w:while(n<10) {
			n++;
			
			switch(n) {
			case 1: System.out.println("switch문 1번 거쳐감"); break w;
			//switch문에서 break는 반복문을 빠져나가는게 아닌 switch문만 나가게된다
			case 2: System.out.println("switch문 2번 거쳐감"); continue;
			//switch문만 단독으로 사용했을 때는 continue를 사용할 수 없다
			}
		}
		
		
		
		
		
		
		
		
	}

}
