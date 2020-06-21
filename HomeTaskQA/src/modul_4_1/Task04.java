package modul_4_1;

//import java.util.Arrays;

public class Task04 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i = 1; i < 1_000_000; i++) {
			sum = 0;
				for (int j = 1; j < i; j++) {
					if(i%j==0)
						sum +=j;
										 
				} if (sum == i) {
				System.out.println(i);
					} 
		} 
	} 
}

