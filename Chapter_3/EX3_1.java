package Chapter_3;
import java.util.Scanner;
public class EX3_1 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a, b and c: ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double discriminant=Math.pow(b,2)-(4* a*c);
		if(discriminant<0) {
			System.out.print("The equation has no roots.");
		}else if(discriminant ==0) {
			System.out.print("The equation has only one root ");
			double root=-b/(2 * a);
			System.out.print(root);
		}else {
			System.out.print("The equation has two roots: ");
			double root1=(-b+Math.sqrt(discriminant))/(2 *a);
			double root2=(-b-Math.sqrt(discriminant))/(2 *a);
			System.out.print( Math.round(root1*100000)/100000.0+ " and "+Math.round(root2*100000)/100000.0);
		}
	}
}
