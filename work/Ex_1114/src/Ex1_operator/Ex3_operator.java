package Ex1_operator;

public class Ex3_operator {

	public static void main(String[] args) {
		//�� ������
		//�񱳿����ڴ� ������ ����� ���� ���Ͽ� ���� ������ �Ǵ��ϴ� ������
		//�׷��Ƿ� ������� �ݵ�� true,false�θ� ��ȯ �ȴ�.
		
		int n1 = 10;
		int n2 = 20;
		boolean result= n1 <n2;  
		System.out.println("n1 < n2="+result);
		
		result = n1 > n2;
		System.out.println("n1 > n2="+result);
		
		result = n1 == n2;
		System.out.println("n1 == n2="+result);
		
		result = n1 != n2;
		System.out.println("n1 != n2="+result);
		
		// < : �۴�
		// > : ũ��
		// <=, >= �� �׻� ���谡 =���� �����´�
		// == : ����
		// != : ���� �ʴ�
		
		//�� ������
		//�� �����ڸ� ���� ������ 2�� �̻� �ʿ��� �� ����մϴ�
		int a = 5;
		int b = 10;
		
		result = a > b && a != b;
		System.out.println("a�� b���� ũ�� a�� b�Ͱ����ʴ�"+result);
		//&&�� and�����ϰ� �յڰ� �ΰ��� true�̾�� true���� ����Ѵ�
		
		result = (a+b) <10 && (a+=2) > 5;
		System.out.println("a+b��10���� �۰� a+2�� 5�����۴�="+result);
		System.out.println("a�� �� : "+a); 
		//���� false�� �ڿ� (a+=2)�� �������� �ʴ´�
		
		// ||�� or�� �� ���߿� �ϳ��� ���̸� ������ true
		result = b == 5 || (a += 2) > 5 ;
		System.out.println(result);
		System.out.println("a�� �� : "+a);
		System.out.println(!result);
		
		
		
		
		
		
		
		
		
	}

}
