package Chapter_4;
import java.util.Scanner;
public class EX4_2 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter point1 (Latitude and Longitude) in degrees: ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double rad_x1=Math.toRadians(x1);
		double rad_y1=Math.toRadians(y1);
		System.out.print("Enter point2 (Latitude and Longitude) in degrees: ");
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double rad_x2=Math.toRadians(x2);
		double rad_y2=Math.toRadians(y2);
		double radius=6371.01;
		double distance=radius * Math.acos(Math.sin(rad_x1)*Math.sin(rad_x2)+Math.cos(rad_x1) * Math.cos(rad_x2) *Math.cos(rad_y2-rad_y1));
		System.out.print("The distance between the two pints is: "+distance+" Km");
		
	}
}
