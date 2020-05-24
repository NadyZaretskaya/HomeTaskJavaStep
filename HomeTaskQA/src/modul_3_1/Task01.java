package modul_3_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task01 {

	public static void main(String[] args)  throws IOException {
		
		String sNumber;
		int nNumber;
		
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
				System.out.println("Укажите порядковый номер дня недели (где 1 - Понедельник, а 7 - Воскресенье): ");
			sNumber = reader.readLine();
			nNumber = Integer.parseInt(sNumber);
			} 
		String result;
		
			switch (nNumber) {
	        	case 1: result = "Понедельник";
	        			break;
	        	case 2:  result = "Вторник";
	        			break;
	        	case 3:  result = "Среда";
	        			break;
	        	case 4:  result = "Четверг";
	        			break;
	        	case 5:  result = "Пятница";
	        			break;
	        	case 6:  result = "Суббота";
	        			break;
	        	case 7:  result = "Воскресенье";
	        			break;
	        default: result = "Вы ввели не верное число. Попробуйте еще раз.";
	    	}
			  	    
	    System.out.println(result);
	    
		}
	
}
