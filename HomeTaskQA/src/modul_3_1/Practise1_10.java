package modul_3_1;

import java.util.Scanner;

public class Practise1_10 {

	public static void main(String[] args) {
		
							
		Scanner scanner = new Scanner(System.in);	
		System.out.print("Сколько целых чисел вы собираетесь ввести? ");
        int size = scanner.nextInt();
        int [] sourceNumbers = new int[size];
        
        System.out.print("Введите числа через пробел и нажмите \"Enter\": ");
        for (int i = 0; i < size; i++) {
        sourceNumbers[i] = scanner.nextInt();
        scanner.close();
       
        
         }	
	}
}
