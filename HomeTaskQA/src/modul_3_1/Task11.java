package modul_3_1;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		
		
		try (Scanner scan = new Scanner(System.in)) {
		System.out.println("Введите коэффициент a, b, c через пробел: ");
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double x1;
		double x2;
		
		double discr = b * b - (4 * a * c);
		if (discr > 0) {
			x1 = (-b + Math.sqrt(discr))/ (2 * a);
			x2 = (-b - Math.sqrt(discr))/ (2 * a);
			System.out.println("Корни уравнения: \n" + "x1 = " + x1 + "\n x2 = " + x2);
		} else if (discr == 0) {
			x1 = -b / (2 * a);
			System.out.println("Корень x1 = " + x1);
		} else {
			System.out.println("Корней нет."); 
		}
		
		}
	}
}
					

		


		