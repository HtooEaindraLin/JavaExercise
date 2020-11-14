package Chapter_2;
import java.util.Scanner;
public class EX2_9 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);		
		System.out.print("Enter v0,v1 and t: ");
		double v0=input.nextDouble();
		double v1=input.nextDouble();
		double t=input.nextDouble();
		double a=(v1-v0)/t;
		System.out.println("The average acceleration is: "+Math.round(a*10000)/10000.0);	
	}
}
