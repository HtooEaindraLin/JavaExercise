package W3SchoolExercise;
import java.util.Scanner;
public class EX13 {
public static void main(String[] args) {
	 Scanner input=new Scanner (System.in);
	 System.out.print("Enter Width: ");
	 double width=input.nextDouble();
	 System.out.print("Enter Height: ");
	 double height=input.nextDouble();
	 System.out.println("Area is: "+Math.round(width*height*1000)/1000.0);
	 System.out.println("Perimeter is: "+2*(width+height));
	}

}
