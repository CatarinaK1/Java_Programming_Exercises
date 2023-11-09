package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class arrays5 {

	public static void main(String[] args) {
		
		ArrayList<String> cars= new ArrayList<String>();
		cars.add("Kia");
		cars.add("Tesla");
		cars.add("BMW");
		cars.add("Renault");
		
		for(int i=0; i<cars.size(); i++) {
			System.out.println(cars.get(i));
		}
		
		cars.add(1, "Ford");
		cars.remove(2);
		cars.set(2, "Audi");
		System.out.println("MODIFIED LIST");
		for(int i=0; i< cars.size();i++) {
			System.out.println(cars.get(i));
		}
	}

}
