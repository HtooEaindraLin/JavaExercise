package Chapter_3;
import java.util.Scanner;
public class EX3_19 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter three edges of the triangle: ");
		double first_edge=input.nextDouble();
		double second_edge=input.nextDouble();
		double third_edge=input.nextDouble();
		double area=0;
		double perimeter=0;
		if((first_edge+second_edge)>third_edge && (second_edge+third_edge)>first_edge && (first_edge+third_edge)>second_edge) {
			area=0.5 * first_edge * second_edge* third_edge;
			perimeter=(first_edge+second_edge+third_edge);
			System.out.println("The area of the triangle is: "+area);
			System.out.print("The perimeter of the triangle is: "+perimeter);
		}else System.out.print("Invalid Input");

	}

}
