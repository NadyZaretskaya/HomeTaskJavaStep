package modul_02;

import java.util.Scanner;

public class Task10 {
			    
	public static void main(String[] args) {
		
		double height; //����
	    double weight; //���
	    double perfectWeight; // ��������� ���
	       	try (Scanner scanner = new Scanner(System.in)){
				System.out.println("������� ��� ��� � �����������:");
	        		weight = scanner.nextDouble();
	        	System.out.println("������� ��� ���� � �����������:");
	        	height = scanner.nextDouble();
	       	}		
	       	    perfectWeight = height - 110.0;
	       	    weight -= perfectWeight;
	       	    
	       	    if (weight < 0) {
	       	    	System.out.println("��� ����� ������� " + Math.abs(weight) + "�� ��� ���������� ����");
	       	    } else if (weight > 0) {
	       	    	System.out.println("��� ����� �������� " + weight + "�� ��� ���������� ����");
	       	    } else {
	       	    	System.out.println("� ��� ��������� ���");
	       	    }	
	  }
}
