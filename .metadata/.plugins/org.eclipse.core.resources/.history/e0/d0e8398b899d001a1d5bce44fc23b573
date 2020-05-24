package modul_3_1;

import java.util.Scanner;

public class Task05 {
	
		static int day, month, year;
		static String result;
		static String result1;
		private static String [] animals = {"Обезьяны","Петуха","Собаки","Свиньи","Крысы","Быка",
                "Тигра","Зайца","Дракона","Змеи","Лошади","Козы"};
	
		public static void main(String[] args)  {
			
			try (Scanner scanner = new Scanner(System.in)){
				System.out.println("Укажите свою дату рождения в дормте ДД ММ ГГГГ:");
	        		day = scanner.nextInt();
	        		month = scanner.nextInt();
	        		year = scanner.nextInt();
	        	   	}		
					
			System.out.println("Вывод:");
			System.out.println("Знак: " + getNameOfZodiak(month));
			System.out.println("Год: " + getNameOfAnimal(year));
		}
		
		
		private static String getNameOfAnimal(int yaer) {
	        return animals [yaer % animals.length];
		}
		
		private static String getNameOfZodiak(int month) {
			switch (month) {
	    	case 1: if (day < 20) {
	    		result = "Козерог";
	    	} else result = "Водолей";
	    			break;
	    	case 2: if (day < 19) {
	    		result = "Водолей";
	    	} else result = "Рыба";
	    			break;
	    	case 3: if (day < 21) {
	    		result = "Рыба";
	    	} else result = "Овен";
	    			break;
	    	case 4: if (day < 20) {
	    		result = "Овен";
	    	} else result = "Телец";
	    			break;
	    	case 5: if (day < 21) {
	    		result = "Телец";
	    	} else result = "Близнецы";
	    			break;
	    	case 6: if (day < 21) {
	    		result = "Близнецы";
	    	} else result = "Рак";
	    			break;
	    	case 7: if (day < 23) {
	    		result = "Рак";
	    	} else result = "Лев";
	    			break;
	    	case 8: if (day < 23) {
	    		result = "Лев";
	    	} else result = "Дева";
	    			break;
	    	case 9: if (day < 23) {
	    		result = "Дева";
	    	} else result = "Весы";
	    			break;
	    	case 10: if (day < 23) {
	    		result = "Весы";
	    	} else result = "Скорпионй";
	    			break;
	    	case 11: if (day < 22) {
	    		result = "Скорпион";
	    	} else result = "Стрелец";
	    			break;
	    	case 12: if (day < 22) {
	    		result = "Стрелец";
	    	} else result = "Козерог";
	    			break;
	    default: result = "Вы ввели не верный месяц или день.";
		}
			return result;
	}
		
}
