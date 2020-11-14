package Chapter_4;
import java.util.Scanner;
public class EX4_11 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a decimal value (0 to 15): ");
		int num=input.nextInt();		
		if(num>=0 && num<=9) {
			System.out.print(num);
		}else if(num==10) System.out.print("The hex value is A");
		else if(num==11) System.out.print("The hex value is B");
		else if(num==12) System.out.print("The hex value is C");
		else if(num==13) System.out.print("The hex value is D");
		else if(num==14) System.out.print("The hex value is E");
		else if(num==15) System.out.print("The hex value is F");
		else System.out.print(num+" is an invalid input.");
	}
}