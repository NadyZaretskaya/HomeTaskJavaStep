package modul_3_1;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
				
		int ticketNum;
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print("Введите номер билета: ");
        		ticketNum = scanner.nextInt();
        	}
		
		if (ticketNum / 100000 + (ticketNum / 10000) % 10 + (ticketNum / 1000) % 10 == 
				(ticketNum / 100) % 10 + (ticketNum / 10) % 10 + ticketNum % 10) {
			System.out.print("Ваш билет счастливый!");
		} else
			System.out.print("Ваш билет не счастливый. Вам повезет в следующий раз!");
	}
 
}
