package modul_4_1;

public class Task01 {

	public static void main(String[] args) {
		
		int sum_ab = 0;
		int a = 1;
		int b = 0;
		System.out.println(sum_ab);
		
			
		while (sum_ab < 9_227_465) {
			sum_ab = a + b;
			a = b;
			b = sum_ab;
			System.out.println(sum_ab);
		}  
		
	}

}
