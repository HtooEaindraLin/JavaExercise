package Chapter_2;
import java.util.Scanner;
public class EX2_2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the radius and length of a cylinder: ");
		double radius=input.nextDouble();
		double length=input.nextDouble();
		double area=radius * radius * Math.PI;
		double perimeter=area * length;
		System.out.println("The area is    : "+Math.round(area*10000)/10000.0);
		System.out.println("The perimeter is: "+Math.round(perimeter*10000)/10000.0);
	}
}
