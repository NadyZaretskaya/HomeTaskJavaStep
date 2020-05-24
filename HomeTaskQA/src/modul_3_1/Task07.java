package modul_3_1;

import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
		char nChar;
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Введите цифру, букву русского или английского языка: ");
			nChar = scanner.next().trim().charAt(0);
			}
		 
		if( (nChar>='a' && nChar<='z') || (nChar>='A' && nChar<='Z')) {
		    System.out.println("Буква латинского алфавита");
		} else if( (nChar>='а' && nChar<='я') || (nChar>='А' && nChar<='Я')) {
		    System.out.println("Буква кирилического алфавита");    
		}else if( nChar>='0' && nChar<='9') {
		    System.out.println("Цифра");
		} else
		    System.out.println("Невозможно определить");
		
	}
}


