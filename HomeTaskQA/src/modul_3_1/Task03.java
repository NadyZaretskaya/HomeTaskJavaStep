package modul_3_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task03 {
	
	public static void main(String[] args)  throws IOException {
		
		String sNumberOfAnimal;
		int nNumberOfAnimal;
		
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
				System.out.println(" 1 - �����\n 2 - ������\n 3 - ���\n 4 - ��\n 5 - ������\n 6 - ����\n "
						+ "7 - ���������\n 8 - ������\n 9 - ������\n 10 - ������\n ������� ����� ������������� ��� ���������: ");
			sNumberOfAnimal = reader.readLine();
			nNumberOfAnimal = Integer.parseInt(sNumberOfAnimal);
			}
			String result;
			
			switch (nNumberOfAnimal) {
	        	case 1: result = "��� - ���";
	        			break;
	        	case 2:  result = "��� - ���";
	        			break;
	        	case 3:  
	        	case 6:  result = "������";
	        			break;
	        	case 4:  result = "��� - ���";
	        			break;
	        	case 5:  result = "�� - �� - ��";
	        			break;
	        	case 7:  result = "��� - ���";
	        			break;
	        	case 8:  result = "�����";
    					break;
	        	case 9:  result = "���-��";
    					break;
	        	case 10:  result = "�����";
    					break;
	        default: result = "�� ����� �� ������ �����. ���������� ��� ���.";
	    	}
			  	    
	    System.out.println(result);
	    
	    
	}

}