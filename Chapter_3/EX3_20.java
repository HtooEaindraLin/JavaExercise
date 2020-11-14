package Chapter_3;
import java.util.Scanner;
public class EX3_20 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the temperature in fahrenheit between -58F and 41F: ");
		double temp=input.nextDouble();
		System.out.print("Enter the wind speed (>=2) in miles per hour: ");
		double speed=input.nextDouble();
		double calculation=0;
		if(temp>=-58 && temp<=41 && speed>=2) {
			calculation=35.74+(0.6215 *temp)-(35.75*Math.pow(speed,0.16))+(0.4275 *(temp)*Math.pow(speed, 0.16));
			System.out.print("The wind chill index is: "+(int)(calculation*1000000)/1000000.0);
		}else System.out.print("Invalid input");
	}
}
