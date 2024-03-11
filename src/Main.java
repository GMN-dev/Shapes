import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Integer numShapes;
		List<Shape> shapeList = new ArrayList<Shape>();
		
		System.out.print("Enter the number of shapes:");
		numShapes = sc.nextInt();
		
		for(int i=1;i<=numShapes;i++) {
			System.out.printf("Shape #%d data\n", i);
			System.out.print("Retancgle or a Circle (r/c):");
			char res = sc.next().charAt(0);
			System.out.print("Color (BLACK/RED/BLUE): ");
			String color = sc.next();
			
			switch(res) {
				case('r'):
					System.out.print("Width: ");
					Double width = sc.nextDouble();
					System.out.print("Heigth: ");
					Double heigth = sc.nextDouble();
					shapeList.add(new Rectangle(width, heigth, color));
					break;
				case('c'):
					System.out.print("Radius: ");
					Double radius = sc.nextDouble();
					shapeList.add(new Circle(radius, color));
					break;
				default:
					System.out.println("Error");
			}
		}
		
		System.out.println("SHAPES AREAS: ");
		shapeList.stream().forEach(x->{
			System.out.printf("%.2f\n",x.area());
		});
		
	sc.close();	
	}
}