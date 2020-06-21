package modul_3_1;

import java.util.Scanner;

public class Dfghj {

	public static void main(String[] args) {
     
		
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print("Введите фразу: ");
			 String phrase = scanner.nextLine();
       		
			StringBuffer rev = new StringBuffer(phrase);
	        System.out.println(rev.reverse());
		
			
	}
	}
}
