package modul_3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Task06 {

	public static void main(String[] args) throws IOException {
		
		String sYear;
		int nYear;
			
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println(" Введите год: ");
		sYear = reader.readLine();
		nYear = Integer.parseInt(sYear);
		} 
		 
		GregorianCalendar gcalendar = new GregorianCalendar();
		
		  if(gcalendar.isLeapYear(nYear)) {
		         System.out.println("В этом году 366 дней");
		      }else {
		         System.out.println("В этом году 365 дней");
		      }
		  
		/* if (nYear % 100 == 0 && nYear % 400 == 0 )
            System.out.println("В этом году 366 дней");

        else if (nYear % 4 == 0 && nYear % 100 > 0)
            System.out.println("В этом году 366 дней");

        else if (nYear % 100 == 0)
            System.out.println("В этом году 365 дней");

        else
            System.out.println("В этом году 365 дней"); */

	}

}
