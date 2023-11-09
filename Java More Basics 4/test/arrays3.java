package test;

import java.util.stream.IntStream;

public class arrays3 {

	public static void main(String[] args) {
		
		String[] furniture = {"Table", "Sofa", "Shelf", "Painting"};
		
		for(int i=0; i <2 ; i++) {
			if (furniture[i].equals("Sofa")) {
				System.out.println(furniture[i]+" found");
			}
		}
		int[] numbers = {3,6,1};
	       int sum = IntStream.of(numbers).sum();
	       System.out.println(sum);
	
	}
       }
