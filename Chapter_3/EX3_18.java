package Chapter_3;
import java.util.Scanner;
public class EX3_18 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter weight: ");
		double weight=input.nextDouble();
		double cost=0;
		if(weight<=1) {
			cost=3.5;
			System.out.print("The package cost is "+cost);
		}else if(weight<=3) {
			cost=1*3.5+(weight-1)*5.5;
			System.out.print("The package cost is "+cost);
		}else if(weight<=10) {
			cost=1*3.5+(3-1)*5.5+(weight-3)*8.5;
			System.out.print("The package cost is "+cost);
		}else if(weight<=20) {
			cost=1*3.5+(3-1)*5.5+(10-3)*8.5+(weight-10)*10.5;
			System.out.print("The package cost is "+cost);
		}else if(weight>=50) {
			System.out.print("The package cannot be shipped.");
		}

	}

}
