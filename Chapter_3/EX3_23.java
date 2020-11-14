package Chapter_3;
import java.util.Scanner;
public class EX3_23 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point with two coordinates: ");
		double width=input.nextDouble();
		double height=input.nextDouble();
		if(width<=(10/2) && height<=(4/2)) {
			System.out.print("Point ( "+width+" , "+height+" ) "+" is in the rectangle");
		}else System.out.print("Point ( "+width+" , "+height+" ) "+" is not in the rectangle");
	}
}
