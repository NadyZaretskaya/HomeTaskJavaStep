package modul_3_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Task01 {

	public static void main(String[] args)  throws IOException {
		
		String sNumber;
		int nNumber;
		
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
				System.out.println("������� ���������� ����� ��� ������ (��� 1 - �����������, � 7 - �����������): ");
			sNumber = reader.readLine();
			nNumber = Integer.parseInt(sNumber);
			}
		String result;
		
			switch (nNumber) {
	        	case 1: result = "�����������";
	        			break;
	        	case 2:  result = "�������";
	        			break;
	        	case 3:  result = "�����";
	        			break;
	        	case 4:  result = "�������";
	        			break;
	        	case 5:  result = "�������";
	        			break;
	        	case 6:  result = "�������";
	        			break;
	        	case 7:  result = "�����������";
	        			break;
	        default: result = "�� ����� �� ������ �����. ���������� ��� ���.";
	    	}
			  	    
	    System.out.println(result);
	    
		}
	
}