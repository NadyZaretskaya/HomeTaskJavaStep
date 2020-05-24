package modul_02;

import java.util.Scanner;


public class Task12 {

	public static void main(String[] args) {
		int puples;
		int pie;
		double milk;
		double lightweightPerсent;
		double lightweightPuples;
		
		try (Scanner scanner = new Scanner(System.in)){
			
			for (int i = 0; i < 3; i++) {
				
				System.out.println("Укажите колличество первоклассников:");
	        		puples = scanner.nextInt();
	        	System.out.println("Укажите процент детей, вес которых менее 30 кг.:");
	        		lightweightPerсent = scanner.nextInt();	
	        		
	        		lightweightPuples = (puples * lightweightPerсent) / 100;
	        		lightweightPuples = Math.ceil(lightweightPuples);
		
	        	System.out.println("Колличество учеников, чей вес меньше 30 кг.: " + lightweightPuples + "человек");	
			
	        		pie = (int)(puples + lightweightPuples);
	        		milk = (lightweightPuples * 0.2) / 0.9;
		 
	        	System.out.println("Колличество пирожков: " + pie + " шт.");
	        	System.out.println("Колличество бутылок молока: " + Math.ceil(milk) + " шт");
	        	System.out.println("\n" + "***" + "\n");
				}
			}
		}
	}
	