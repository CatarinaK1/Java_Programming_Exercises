package test;

import java.util.Scanner;

public class AdvancedArray1 {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        
        double throw1 , throw2 , throw3 ;
        int counter= 0;
        
        System.out.println("Throw length");
        throw1= Double.parseDouble(in.nextLine());
        System.out.println("Throw length");
        throw2= Double.parseDouble(in.nextLine());
        System.out.println("Throw length");
        throw3= Double.parseDouble(in.nextLine());
        double[] javelinThrows = {throw1 , throw2 , throw3};
        
        for(int i=0; i<javelinThrows.length; i++) {
        	counter++;
        	System.out.println("Throw "+counter+ ": "+javelinThrows[i]);
        }
	}

}
