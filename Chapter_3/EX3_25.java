package Chapter_3;
import java.util.Scanner;
public class EX3_25 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter x1,y1,x2,y2,x3,y3,x4,y4: ");
		double x1=input.nextDouble();
		double y1=input.nextDouble();
		double x2=input.nextDouble();
		double y2=input.nextDouble();
		double x3=input.nextDouble();
		double y3=input.nextDouble();
		double x4=input.nextDouble();
		double y4=input.nextDouble();
		//calculate intersection point
		double a=y1-y2;
		double b=-1*(x1-x2);
		double c=y3-y4;
		double d=-1*(x3-x4);
		double e=((y1 - y2) *x1) -((x1 - x2) *y1);
		double f=((y3 - y4)*x3) -((x3 - x4) *y3);
		double calculate=(a *d)-(b*c);
		if(calculate==0) {
			System.out.print("The two lines are parallel.");
		}else {
			double x=((e*d)-(b*f))/calculate;
			double y=((a*f)-(e*c))/calculate;
			System.out.print("The intersecting point is at ("+Math.round(x*10000)/10000.0+" , "+Math.round(y*10000)/10000.0+" ).");
		}
		
	}

}
