package Chapter_4;
import java.util.Scanner;
public class EX4_9 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a character: ");
		String st=input.next();
		char ch=st.charAt(0);
		System.out.print("The unicode for character "+st+" is "+(int)ch);
	}
}
