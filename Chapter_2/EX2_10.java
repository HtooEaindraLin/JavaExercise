package Chapter_2;
import java.util.Scanner;
public class EX2_10 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the amount of water in kilograms: ");
		double M=input.nextDouble();
		System.out.print("Enter the initial temperature :");
		double initial_temp=input.nextDouble();
		System.out.print("Enter the final temperature : ");
		double final_temp=input.nextDouble();
		double Q=M *(final_temp-initial_temp)*4184;
		System.out.print("The energy needed is: "+Q);
	}

}
