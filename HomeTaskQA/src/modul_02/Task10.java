package modul_02;

import java.util.Scanner;

public class Task10 {
			    
	public static void main(String[] args) {
		
		double height; //рост
	    double weight; //вес
	    double perfectWeight; // идеальный вес
	       	try (Scanner scanner = new Scanner(System.in)){
				System.out.println("Укажите Ваш вес в килограммах:");
	        		weight = scanner.nextDouble();
	        	System.out.println("Укажите Ваш рост в сантиметрах:");
	        	height = scanner.nextDouble();
	       	}		
	       	    perfectWeight = height - 110.0;
	       	    weight -= perfectWeight;
	       	     
	       	    if (weight < 0) {
	       	    	System.out.println("Вам нужно набрать " + Math.abs(weight) + "кг для идеального веса");
	       	    } else if (weight > 0) {
	       	    	System.out.println("Вам нужно сбросить " + weight + "кг для идеального веса");
	       	    } else {
	       	    	System.out.println("У Вас идеальный вес");
	       	    }	
	  }
}
