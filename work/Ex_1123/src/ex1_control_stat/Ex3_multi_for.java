package ex1_control_stat;

import java.util.Scanner;
import java.util.Formatter;

public class Ex3_multi_for {
	public static void main(String[] args) {
		//��ø for�� : for�� �ȿ� for���� ���ԵǾ� �ִ� ���
		/*
		 * for(�ʱ��;���ǽ�;������){
		 * 		for(�ʱ��;���ǽ�;������){
		 * 			������ ���� �� �ݺ��� ���
		 * 		}//inner for
		 * }//outer for
		 * */
		
		//2�� for���� ��� �ذ��ؾ� �� ������ �� �� �� �� ����մϴ�.
		
		//������
		for(int i = 2; i<=9; i++) {
			for(int j = 2; j<=9; j++) {
				System.out.println(i + "x" + j + "=" + (i*j));
			}
		}
		
		
		//1 2
		//1 2
		
		for(int i = 1; i <=2; i++) {
			for(int j = 1; j<=2; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		// 1 1 1 1
		// 1 1 1 1
		// 1 1 1 1
		// 1 1 1 1
		
		for(int i = 0; i<4; i++) {
			for(int j = 0; j <4; j++) {
				System.out.print(1+" ");
			}
			System.out.println();
		}
		System.out.println("--------------------");
		// A B C D
		// A B C D
		// A B C D
		// A B C D
		int a = 64;
		for(int i=1; i<5; i++) {
			for(int j = 1; j<5; j++) {
				System.out.print((char)(a+j)+" ");
			}
			System.out.println();
		}
		System.out.println("---------------------------");
		for(int i=1; i<=4; i++) {
			for(char j='A'; j<='D'; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//����3. 0���� 10���� ��� ���� ���� ����غ���.
		int sum=0;
		for(int i=0; i<=10; i++) {
			sum+=i;
		}
		System.out.println("1����10�������� ����="+sum);
		
		System.out.println("-------------------------------");
		//����4. ���ڸ� 5�� �Է¹ް�, �Է¹��� ������ �������� ���� �ۼ��غ���.
		/*
	    ex. ���ڸ� �Է��ϼ���: 5	���: 5
	   ���ڸ� �Է��ϼ���: 6	���: 11
	   ���ڸ� �Է��ϼ���: 3	���: 14
	   ���ڸ� �Է��ϼ���: 2	���: 16
	   ���ڸ� �Է��ϼ���: 4	���: 20
	    */
		
		/*
		Scanner scanner=new Scanner(System.in);
		int sum2=0;
		for(int i=0; i<5; i++) {
			System.out.print("���ڸ� �Է��ϼ���:");
			int num=scanner.nextInt();
			sum2+=num;
			System.out.println(sum2);
		}
		*/
		
	
	   System.out.println("-------------------------");
	   //����5. 0���� 20���� ¦���� ����غ���.
	   for(int i=0; i<=20; i++) {
		   if(i%2==0) {
			   System.out.println(i);

		   }
		   
	   }
	   System.out.println("--------------------------");
	   
	   //����1. ����ڷκ��� ���� �Ѱ��� �Է¹޾� 1���� �� ���ڱ����� ���� ���غ���.
	   //ex) �Է¹��� ���� : 5              
	   //1���� 5������ �� : 15
	   /*
	   Scanner scanner=new Scanner(System.in);
	   int sum3=0;
	   System.out.print("���ڸ� �Է��ϼ���:");
	   int num3=scanner.nextInt();
	   
	   for(int i=1; i<=num3; i++) {
		   sum3+=i;
	   }
	   System.out.println("1���� "+num3+"������ ��:"+(sum3));
	   */
	   
	   //����2. �ֹε�Ϲ�ȣ�� �Է¹޾� ���� �Ǵ� ���� �Ǵ��غ���.
	   //1900��� �¾ ���� 1    /    2000��� �¾ ���� 3
	   //1900��� �¾ ���� 2    /    2000��� �¾ ���� 4
	   /*Scanner scanner=new Scanner(System.in);
	   System.out.print("�ֹε�Ϲ�ȣ ���ڸ� ù��°�ڸ��� �Է����ּ���:");
	   int num4=scanner.nextInt();
	   switch(num4) {
	   case 1: case 3:
		   System.out.println("�ֹε�Ϲ�ȣ: xxxxxx-"+num4+"xxxxxx:�����Դϴ�");
		   break;
	   case 2: case 4:
		   System.out.println("�ֹε�Ϲ�ȣ: xxxxxx-"+num4+"xxxxxx:�����Դϴ�");
		   break;
	   default:
	   System.out.println("�߸��Է��ϼ̽��ϴ�");
	   }
	   */
	   //����3. ���� ���࿡ 500��(����)�� �Ա��ߴ�. 
	   //�Ϸ翡 1���� ���ڰ� �ٴ´�. 5�� ��(�ϼ�) �ܾ��� �󸶰� �Ǿ� ������?
	   /*int money=500;
	   for(int i=0; i<5; i++) {
		   money++;
	   }
	   System.out.println("5���� �ܾ�:"+money);
	   */
	   //����4. ���� �������� ���ݰ� ��ġ �ϼ��� �Է¹޾� ó���غ���.
	   Scanner scanner=new Scanner(System.in);
	   System.out.print("������ �Է��ϼ���:");
	   int money2=scanner.nextInt();
	   System.out.print("��ġ �ϼ��� �Է��ϼ���:");
	   int day=scanner.nextInt();
	   for(int i=0; i<day; i++) {
		   money2++;
	   }
	   System.out.println(money2);
	   System.out.printf("%d���� �ܾ�:%d",day,money2);
	   scanner.close();
	   
	   
	
	   
	   
		
		
		
		
		
		
		
	}
}
