import java.util.Arrays;
import java.util.Scanner;

public class Mokkitikka {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        
        //5 darts
        int[] points;
        points = new int [5];
        int pointsTotal = 0;
        double sum = 0;
        
        
        for (int i= 0; i <5 ; i++) {
        System.out.println("Points of the "+ (i+1) +". throw");
        points[i] = in.nextInt();
        sum = sum + points[i];
        //points[0]= Integer.parseInt(in.nextline());
        }
        
        //points[0] = 5;
        /*points[1] = 10;
        points[2] = 0;
        points[3] = 3;
        points[4] = 8;*/
        
        Arrays.sort(points);
        
        for (int i=0; i < points.length ; i++) 
        {
        	System.out.println(i+1 + ". throw was "+ points[i]);
        	
        	if (points[i] >= 10) {
        		
        		System.out.println("Great!");
        	}
        	pointsTotal = pointsTotal + points[i];
        }
        System.out.println("Your score was "+ pointsTotal);
        System.out.println("Average: "+ sum/5);
	

	}
	

}
