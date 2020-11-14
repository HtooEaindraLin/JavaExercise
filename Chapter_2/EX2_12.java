package Chapter_2;
import java.util.Scanner;
public class EX2_12 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the speed and acceleration: ");
		double speed=input.nextDouble();
		double accel=input.nextDouble();
		double length=Math.pow(speed, 2)/(2 *  accel);
		System.out.print("The minimum runway length for this airplane is: "+Math.round(length*1000)/1000.0);
	}
}
