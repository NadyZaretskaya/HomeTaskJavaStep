package modul_3_1;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {

		int appartmentNum, appartmentOnFlor;
		int numberOfApp = 0;
		 int entranseNum = 0;
		
		try (Scanner scanner = new Scanner(System.in)){
			System.out.print("������� ����� ��������: ");
        		appartmentNum = scanner.nextInt();
        	System.out.print("������� ����������� ������� �� �����: ");
        		appartmentOnFlor = scanner.nextInt();	
		}
		
		do {
			numberOfApp = (appartmentOnFlor * 9) + numberOfApp;
			entranseNum++;
		}
		while (appartmentNum > numberOfApp); 
		
		System.out.print("��� ������� �" + entranseNum);
	}
	
}
