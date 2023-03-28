package studio;

import java.util.Scanner;
import studio.Circle;

public class Area {
	
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);

		//System.out.print("\nEnter a radius: ");
		double radius = 1;
		boolean end = false;

		
		while (!end) {
			System.out.print("\nEnter a radius: ");

			if (input.hasNextDouble()) {
				
				radius = input.nextDouble();
				end = true;
			}
			else {
				input.next();
			}
		}

		double area = Circle.getArea(radius);

		System.out.println("The area of a circle of radius " + radius +
				" is: " + area +"\n");
		
		input.close();
	}
}
