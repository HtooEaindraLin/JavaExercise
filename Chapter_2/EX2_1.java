package Chapter_2;
import java.util.Scanner;
public class EX2_1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a degree in Celsius: ");
		double celsius=input.nextDouble();
		double fahrenheit=(9/5.0)* celsius+32;
		System.out.print(celsius+" Celsius is "+fahrenheit+" Fahrenheit.");
	}
}
