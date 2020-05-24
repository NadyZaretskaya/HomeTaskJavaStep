package modul_02;

public class Task07 {
	
		public static void main(String[] args) {
		Double summaN = 1500.0;
		Double summaF;
		Double proc = 0.055;  // 5.5%
		int srok = 2;
		int n=0;
		summaF = summaN;
		do {
			summaF += summaF * proc;
			n++;
		} while (n < srok);
			System.out.println("Сумма вклада через два года составит " + summaF);
	}
 
}
