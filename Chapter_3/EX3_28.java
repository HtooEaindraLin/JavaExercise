package Chapter_3;
import java.util.Scanner;
public class EX3_28 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter r1'centers x-,y-coordinates, width and height: ");
		double r1x=input.nextDouble();
		double r1y=input.nextDouble();
		double r1width=input.nextDouble();
		double r1height=input.nextDouble();
		System.out.print("Enter r2' centers x-,y- coordinates, width and height: ");
		double r2x=input.nextDouble();
		double r2y=input.nextDouble();
		double r2width=input.nextDouble();
		double r2height=input.nextDouble();
		//test validation
		if(Math.pow(Math.pow(r2y-r1y, 2), 0.05)+ r2height/2 <=r1height/2 &&
		   Math.pow(Math.pow(r2x-r1x, 2), 0.05)+r2width/2 <=r1width/2 &&
		   (r2height/2 +r1height/2<=r1height)&& (r1width/2+r2width/2 <=r1width)) {
			System.out.print("r2 is inside of r1.");
		}else if((r1x+r1width/2 >r2x-r2width) || (r1y+r1height/2> r2y-r2height)){
			System.out.print("r2 overlaps r1");
		}else System.out.println("r2 doesn't overlaps r1");
	}

}
