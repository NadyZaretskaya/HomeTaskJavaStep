package modul_02;

public class Task02 {
	
	public static void main(String[] args) {
		int number = 123;
        int hundreds = number/100; //1
        int dozens = (number - (100*hundreds)) / 10; // 2
        int units = (number - (100*hundreds)) - (dozens*10); //3
        number = hundreds + dozens + units;
        	System.out.println(number);	          	
	 } 
}
