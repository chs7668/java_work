package ex2_String;

public class Ex2_String_Method {
	public static void main(String[] args) {
		//�޼���(�Լ�)�� � �۾��� �����ϱ� ���� ��ɹ��� �����̴�
		//�޼��带 ����ϴ� ����ū ������ �ݺ������� ���Ǵ� �ڵ带 ���̱� ���ؼ��̴�
		//���� ���Ǵ� ������ �ڵ带 �޼���� �ۼ��صΰ� �ʿ��� ������ ȣ�⸸ �ϸ� �ȴ�
		//Ŭ�������� ������ �Լ����ü��ִ�?
		
		String str="Hong Gil Dong";
		
		//length() : ���ڿ��� ���̸� �� �� ����ϰ� ���� int������ ��ȯ�մϴ�
		System.out.println("���ڿ��� str�� ����"+str.length());
		//indexof() : �Ұ�ȣ �ȿ��� ���ڸ� ó������ ������ ��ġ�� index���� �޽��ϴ�
		int index=str.indexOf('G');
		System.out.println("�� ó�� ������ G�� ��ġ : "+index); //index�� 0���ͽ���
		index=str.indexOf("Dong");
		System.out.println("�� ó�� ������ Dong�� ��ġ : "+index);
		
		//lastindexOf() : ���ڸ� �Ųٷ� ã�´�.
		index =str.lastIndexOf('o');
		System.out.println("������ ���� o�� ��ġ : "+index);
		
		//charAt() : �ε��� ��ȣ�� ���� �ش� �ε����� �ش��ϴ� ���ڸ� �����´�
		char c =str.charAt(5);
		System.out.println("������ ���� : "+c);
		
		//substring() : ����ϰ� ���� �κ��� �ε����� ��� ���ڿ� �߶󳻱�
		String str2 =str.substring(0,5);
		//str.substring(�������,5�̸�����),0������ 5���� ��������
		System.out.println("0��° ���� 5�̸��� �ε��������� ���ڿ�  : "+str2);
		
		//.equalsIgnoreCase() : ��ҹ��ڸ� �����ϰ� ���ĺ��� ������ ��
		String exam ="APPLE";
//		String exam=str.toLowerCase();
		if(exam.equalsIgnoreCase("apple")) { 
			System.out.println("exam�� apple�Դϴ�");
		}else {
			System.out.println("exam�� apple�� �ƴմϴ�");
		}
		
		//trim() : ���ڿ� �յ��� �ǹ̾��� ������ ����
		String id ="  abc ";
		if((id.trim()).equals("abc")) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
		//Integer.parseInt() : ���ڿ� ���ڸ� ���������ڷ� �ٲپ���
		String number ="1";
		System.out.println(number+10);
		System.out.println(Integer.parseInt(number)+10);
		System.out.println(Integer.parseInt("10")+10);
		
		//split() : �Ұ�ȣ �ȿ� �������� ���ڿ��� ����
		String arr[]=str.split("g");
		for(int i=0; i<arr.length; i++) {
			System.out.printf("arr[%d] : %s\n",i,arr[i]);
		}
		
		//�⺻�ڷ����� wrapper Ŭ����
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
