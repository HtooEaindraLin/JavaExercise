package Chapter_2;
import java.util.Scanner;
public class EX2_3 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a value for feet: ");
		double feet=input.nextDouble();
		double Foot_Meter=0.305;
		System.out.println(feet+" feet is "+feet * Foot_Meter+" meters.");
	}
}
