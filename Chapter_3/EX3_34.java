package Chapter_3;
import java.util.Scanner;
public class EX3_34 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter three points for p0, p1 and p3: ");
		double x0=input.nextDouble();
		double y0=input.nextDouble();
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double calculation=(x1 - x0)*(y2 - y0) - (x2 - x0)*(y1 - y0);
		if(calculation>0) {
			System.out.print("( "+x2+" , "+y2+" ) "+" is on the left lign segment from "+"( "+x0+" , "+y0+" )"+" to "+" ( "+x1+" , "+y1+" ).");
		}else if(calculation==0) {
			System.out.print("( "+x2+" , "+y2+" ) "+" is on the line segment from "+"( "+x0+" , "+y0+" )"+" to "+" ( "+x1+" , "+y1+" ).");
		}else System.out.print("( "+x2+" , "+y2+" ) "+" is not on the line segment from "+"( "+x0+" , "+y0+" )"+" to "+" ( "+x1+" , "+y1+" )."); 

	}

}
