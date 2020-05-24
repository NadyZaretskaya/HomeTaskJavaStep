package modul_3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task03 {
	
	public static void main(String[] args)  throws IOException {
		
		String sNumberOfAnimal;
		int nNumberOfAnimal;
		
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
				System.out.println(" 1 - кошка\n 2 - собака\n 3 - лев\n 4 - ёж\n 5 - курица\n 6 - тигр\n "
						+ "7 - поросенок\n 8 - корова\n 9 - лошадь\n 10 - овечка\n Укажите номер интересующего вас животного: ");
			sNumberOfAnimal = reader.readLine();
			nNumberOfAnimal = Integer.parseInt(sNumberOfAnimal);
			} 
			String result;
			
			switch (nNumberOfAnimal) {
	        	case 1: result = "Мяу - мяу";
	        			break;
	        	case 2:  result = "Гав - гав";
	        			break;
	        	case 3:  
	        	case 6:  result = "Аррррр";
	        			break;
	        	case 4:  result = "Пых - пых";
	        			break;
	        	case 5:  result = "Ко - ко - ко";
	        			break;
	        	case 7:  result = "Хрю - хрю";
	        			break;
	        	case 8:  result = "Муууу";
    					break;
	        	case 9:  result = "Иго-го";
    					break;
	        	case 10:  result = "Мееее";
    					break;
	        default: result = "Вы ввели не верное число. Попробуйте еще раз.";
	    	}
			  	    
	    System.out.println(result);
	    
	    
	}

}
