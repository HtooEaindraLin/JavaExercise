package Chapter_3;
import java.util.Scanner;
public class EX3_6 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter weight in pounds: ");
		double weight=input.nextDouble();
		System.out.print("Enter feet: ");
		double feet=input.nextDouble();
		System.out.print("Enter inches: ");
		double inches=input.nextDouble();
		double KILOGRAN_PER_POUNDS=0.45359237;
		double METER_PER_INCH=0.0254;
		double weight_kilogram=weight* KILOGRAN_PER_POUNDS;
		double height_meter=(feet *12 +inches)* METER_PER_INCH;
		double BMI=weight_kilogram/Math.pow(height_meter, 2);
		System.out.println("BMI is "+BMI);
		if(BMI<18.5) {
			System.out.print("UnderWeight");
		}else if(BMI<25.0) {
			System.out.print("Normal");
		}else if(BMI <30) {
			System.out.print("OverWeight");
		}else System.out.print("Obese");

	}

}
