package Chapter_4;
import java.util.Scanner;
public class EX4_7 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the radius of the bounding circle: ");
		double radius=input.nextDouble();	
		System.out.println("The coordinates of the five points on the pentagonal are: ");
		for(int i=0;i<5;i++) {
			System.out.println(" ( "+Math.round(Math.random()*radius *100)/100.0+" , "+Math.round(Math.random()*radius*100)/100.0+" ) ");
		}
	}
}
