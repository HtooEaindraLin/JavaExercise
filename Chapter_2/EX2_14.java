package Chapter_2;
import java.util.Scanner;
public class EX2_14 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double pound_per_kg=0.45359237;
		double inch_per_meter=0.0254;
		System.out.print("Enter weight in pounds: ");
		double weight_pounds=input.nextDouble();
		double weight_kilograms=weight_pounds * pound_per_kg;
		System.out.print("Enter height in inches: ");
		double height_inches=input.nextDouble();
		double height_meter=height_inches * inch_per_meter;
		double BMI=(weight_kilograms)/((Math.pow(height_meter, 2)));
		System.out.println("BMI is: "+Math.round((BMI*10000))/10000.0);		
	}
}
