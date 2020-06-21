package modul_4_1;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		System.out.println("Введите Ваше число:");
		try (Scanner scanner = new Scanner(System.in)) {
			int number = scanner.nextInt();
			String strNumber = String.valueOf(number);
			
			if (isPalindrom(strNumber)) {
			System.out.println("Yes");
			} else 
				System.out.println("No");
			
		}
	}
	private static boolean isPalindrom(String strNumber) {
		return strNumber.equals(new StringBuilder().append(strNumber).reverse().toString());
	}
	
}
		/* 	Integernt reverseNumber = Integer.reverse(number);
			if(number.equals(reverseNumber)) {
			*/