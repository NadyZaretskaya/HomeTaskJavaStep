package modul_3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task02 {

	public static void main(String[] args) throws IOException {
		
		String sTime;
		int nTime;
		
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Укажите время в формате 24ч.: ");
		sTime = reader.readLine();
		nTime = Integer.parseInt(sTime);
		}
		
		if (nTime < 12 && nTime >= 5) {
			System.out.println ("Доброе утро");
		} else if (nTime >= 12 && nTime < 17) {
			System.out.println ("Добрый день");
		} else if (nTime >= 17 && nTime < 21) {
			System.out.println ("Добрый вечер");
		} else if (nTime >= 21 && nTime <= 24) {
			System.out.println ("Доброй ночи");
		} else if (nTime > 0 && nTime < 5) {
			System.out.println ("Доброй ночи");
		} else 
			System.out.println ("Вы ввели неправильное время. Введите цифру от 1 до 24.");
	}
 
}
