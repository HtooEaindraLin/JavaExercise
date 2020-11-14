package Chapter_3;
import java.util.Scanner;
public class EX3_3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a, b,c,d,e,f: ");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();
		double lower_part=a*d-(b*c);
		if(lower_part==0) {
			System.out.print("The equation has no solution.");
		}else {
			double x=(e *d-(b* f))/lower_part;
			double y=(a * f-(e *c))/lower_part;
			System.out.print("X is "+x+" and y is "+y);
		}
	}
}
