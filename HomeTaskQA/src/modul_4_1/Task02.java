package modul_4_1;

public class Task02 {

	public static void main(String[] args) {
		
		boolean flag = true;
		 
       for (int i = 2; i <= 1_000_00; i++) {
            for (int j = 2; j <= Math.sqrt((double)i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                    } 
            }  
            if (flag)
            	System.out.println(i);
            flag=true;
        } 
		
	}
			
}


