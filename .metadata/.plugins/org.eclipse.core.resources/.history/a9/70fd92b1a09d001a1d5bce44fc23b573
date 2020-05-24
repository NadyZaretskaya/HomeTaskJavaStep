package modul_3_1;

import java.util.Scanner;

public class Task04 {
	
	public static void main(String[] args)  {
		
		double xCoordinate;
		double yCoordinate;
		
		try (Scanner scanner = new Scanner(System.in)){
			System.out.println("Укажите координату точки по оси Х: ");
				xCoordinate = scanner.nextDouble();
			System.out.println("Укажите координату точки по оси Y: ");
				yCoordinate = scanner.nextDouble();
			}	
		if (xCoordinate > 0.0 && yCoordinate > 0.0) {
			System.out.println("Точка находится в I четверти.");
		} else if (xCoordinate > 0.0 && yCoordinate < 0.0) {
			System.out.println("Точка находится в IV четверти.");
		} else if (xCoordinate < 0.0 && yCoordinate < 0.0) {
			System.out.println("Точка находится в III четверти.");
		} else if (xCoordinate < 0.0 && yCoordinate > 0.0) {
			System.out.println("Точка находится в II четверти.");
		} else if (xCoordinate > 0.0 && yCoordinate == 0.0) {
			System.out.println("Точка находится на оси X между I и IV четвертями.");
		} else if (xCoordinate < 0.0 && yCoordinate == 0.0) {
			System.out.println("Точка находится на оси X между II и III четвертями.");
		} else if (xCoordinate == 0.0 && yCoordinate > 0.0) {
			System.out.println("Точка находится на оси Y между I и II четвертями.");
		} else if (xCoordinate == 0.0 && yCoordinate < 0.0) {
			System.out.println("Точка находится на оси Y между III и IV четвертями.");		
		} else 
			System.out.println("Точка находится на пересечении осей X и Y.");
	}

}
