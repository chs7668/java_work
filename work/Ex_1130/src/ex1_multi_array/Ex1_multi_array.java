package ex1_multi_array;

public class Ex1_multi_array {
	public static void main(String[] args) {
		
		int test[][] = new int [2][3];
		
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
		
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
		
		//System.out.println(test[0][0]);
		
		for(int i =0; i <test.length; i++) {
			for(int j = 0; j< test[i].length; j++) {
				System.out.print(test[i][j]+ " ");
			}
			System.out.println();
		}
		
		System.out.println("--------------------------------");
		String[][] java = {{"????","java:90","android:100"},
						   {"ö??","java:100","android:80", "jsp:100"}
						  };
		
		for(int i = 0; i < java.length; i++) {
			for(int j = 0; j <java[i].length; j++) {
				System.out.print(java[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("--------------------------------");
		int num[][] = new int[2][];
		num[0] = new int[3];
		num[1] = new int[2];
		int n = 0;
		
		for(int i = 0; i<num.length; i++) {
			for(int j = 0; j <num[i].length; j++) {
				System.out.print((num[i][j]= n+=100) + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
