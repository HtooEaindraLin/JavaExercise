package Chapter_4;
import java.util.Scanner;
public class EX4_20 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a String: ");
		String st=input.next();
		System.out.println("The length of the string is: "+st.length());
		System.out.print("The first character of the string is "+st.charAt(0));
	}
}
