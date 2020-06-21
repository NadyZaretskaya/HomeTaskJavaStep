package modul_4_1;

import java.util.Arrays;

public class Task06 {

	public static void main(String[] args) {
		int count = 0;
    	for (int i = 0; i < 100000000; i++) {
    		if (i%12345 == 0) {
			char[] charArray = Integer.toString(i).toCharArray();
			Arrays.sort(charArray);
				for (int j = 0; j < charArray.length-1; j++) {
					if (charArray[j] == charArray[j+1]) {
						break;
				    }
				System.out.println(i);
				
			   } count++;
        } 
    	}
	System.out.println("Общее количество найденных чисел " + count);
    }
}
		
	