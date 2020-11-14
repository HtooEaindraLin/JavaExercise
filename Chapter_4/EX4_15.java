package Chapter_4;
import java.util.Scanner;
public class EX4_15 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a letter: ");
		String st=input.next();
		char ch_primary=st.charAt(0);
		char ch=Character.toUpperCase(ch_primary);
		if(ch=='A' || ch=='B' || ch=='C') {
			System.out.print("The corresponding number is 2.");
		}else if(ch=='D' || ch=='E' || ch=='F') {
			System.out.print("The corresponding number is 3.");
		}else if(ch=='G' || ch=='H' || ch=='I') {
			System.out.print("The corresopnding number is 4.");
		}else if(ch=='J' || ch=='K' || ch=='L') {
			System.out.print("The corresponding number is 5.");
		}else if(ch=='M' || ch=='N' || ch=='O') {
			System.out.print("The corresponding number is 6.");
		}else if(ch=='P' || ch=='Q' || ch=='R' || ch=='S') {
			System.out.print("The corresponding number is 7.");
		}else if(ch=='T' || ch=='U' || ch=='V') {
			System.out.print("The corresponding number is 8.");
		}else if(ch=='W' || ch=='X' || ch=='Y' || ch=='Z') {
			System.out.print("The corresponding number is 9.");
		}else System.out.print(st+" is an invalid input.");
	}
}
