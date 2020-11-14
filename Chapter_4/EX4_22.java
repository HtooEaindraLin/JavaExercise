package Chapter_4;
import java.util.Scanner;
public class EX4_22 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter String s1: ");
		String st1=input.next();
		System.out.print("Enter String s2: ");
		String st2=input.next();
		if(st1.contains(st2)) {
			System.out.print(st2+" is a substring of "+st1);
		}else System.out.print(st2+" is not a substring of "+st1);
	}
}
