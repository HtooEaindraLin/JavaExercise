package Chapter_4;
import java.util.Scanner;
public class EX4_13 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);		
		  System.out.print("Enter a letter grade: ");
		  String st=input.next(); 
		  char ch=Character.toUpperCase(st.charAt(0)); 
		  int num=(int)ch;
		  if((num>=65 && num<=90)) {
			 if(ch=='A' || ch=='E' || ch=='I' ||ch=='O' || ch=='U') {
				 System.out.print(st+" is a vowel.");
			 }else System.out.print(st+" is a consonant.");
		  }else System.out.print(st+" is an invalid input.");
	}
}