package Chapter_4;
import java.util.Scanner;
public class EX4_21 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a SSN: ");
		String st=input.next();
		int digit_count=0;
		for(int i=0;i< st.length();i++) {
			if(Character.isDigit(st.charAt(i))) {
				digit_count++;
			}
		}
		if(st.charAt(3)=='-' && st.charAt(6)=='-' && digit_count==9) {		
			System.out.print(st+" is a valid social security number.");
		}else System.out.print(st+" is invalid social security number.");
	}
}
