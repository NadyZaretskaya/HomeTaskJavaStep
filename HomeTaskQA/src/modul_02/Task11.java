package modul_02;

import java.util.Scanner;

public class Task11 {
	
	static int seconds;
	static int secInMinute = 60;
	static int secInHour = 3_600;
	static int secInDay = 86_400;
			
	public static void main(String[] args) {
		
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Сколько секунд осталось до нового года?");
			seconds = scanner.nextInt();
		}
			int sec, minutes, hours, days;
			days = seconds / secInDay;
			hours = seconds % secInDay / secInHour;
			minutes = seconds % secInHour / secInMinute;
			sec = seconds % secInMinute;
		
			System.out.println("До Нового Года осталось " + days + " дней " + hours + " часов " +  minutes + " минут " + sec + " секунд ");
			 
	}

}
