package W3SchoolExercise;
import java.util.Scanner;
public class EX38 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("The string is: ");
		String st=input.nextLine();
		int charcount=0;
		int DigitCount=0;
		int spaceCount=0;
		int other=0;
		for(int i=0;i<st.length();i++) {
			if(Character.isDigit(st.charAt(i))) {
				DigitCount++;
			}else 
			if(Character.isLetter(st.charAt(i))) {
				charcount++;
			}else
			if(Character.isSpaceChar(st.charAt(i))) {
				spaceCount++;
			}else other++;
		}
		System.out.println("Letter: "+charcount);
		System.out.println("Space: "+spaceCount);
		System.out.println("Number: "+DigitCount);
		System.out.println("Others: "+other);
	}

}
