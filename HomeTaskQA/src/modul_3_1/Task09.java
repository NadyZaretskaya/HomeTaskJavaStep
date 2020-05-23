package modul_3_1;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		
		double x1, y1, x2, y2;
		
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print("Введите координаты начала отрезка (x1 y1): ");
        		x1 = scanner.nextDouble();
        		y1 = scanner.nextDouble();
        		
        	System.out.print("Введите координаты окончания отрезка (x2 y2): ");
        		x2 = scanner.nextDouble();
        		y2 = scanner.nextDouble();
				}
		if (y1 < y2 && x1 != x2) {
			System.out.print("Подъем");
		} else if (y1 > y2 && x1 != x2) {
			System.out.print("Спуск");
		} else if (y1 == y2 && x1 != x2) {
			System.out.print("Ровная дорога");
		} else if (y1 != y2 && x1 == x2) {
			System.out.print("Отвесная дорога");
		} else
			System.out.print("Отвесная дорога");
		
	}
}
