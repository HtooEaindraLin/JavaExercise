package Chapter_3;
import java.util.Scanner;
public class EX3_29 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter circle1's center x-y coordinates, and  radius: ");
		double C1_x=input.nextDouble();
		double C1_y=input.nextDouble();
		double C1_radius=input.nextDouble();
		System.out.print("Enter circle2's center x-y coordinates, and radius: ");
		double C2_x=input.nextDouble();
		double C2_y=input.nextDouble();
		double C2_radius=input.nextDouble();
		//test validation
		if(Math.pow( Math.pow(C2_x-C1_x, 2)+ Math.pow(C2_y-C1_y, 2), 0.5) <=Math.abs(C1_radius-C2_radius)) {
			System.out.print("Circle 2 is inside of Circle1.");
		}else if( Math.pow( Math.pow(C2_x-C1_x,2)+Math.pow(C2_y+C1_y, 2), 0.5)<= C1_radius+C2_radius) {
			System.out.print("Circle 2 overlaps Circle1.");
		}else System.out.print("Circle 2 doesn't overlap Circle1");		
	}
}
