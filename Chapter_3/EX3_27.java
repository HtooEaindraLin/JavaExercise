package Chapter_3;
import java.util.Scanner;
public class EX3_27 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a point's x and y coordinates: ");
		double x=input.nextDouble();
		double y=input.nextDouble();
		double intersetX=(-x*(200*100))/(-y*200- x*100);
		double intersetY=(-y *(200 *100))/(-y*200 -x*100);
		if(intersetX<x || intersetY<y) {
			System.out.print("The point is not in the triangle.");
		}else System.out.print("The point is in the triangle.");
	}
}
