package Chapter_4;
import java.util.Scanner;
public class EX4_18 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter two characters: ");
		String st=input.next();
		char ch=st.charAt(0);
		int num=st.charAt(1);	
		boolean isinvalid=false;
		String output1="";
		String output2="";
		switch(ch) { 
		case 'M': output1="Mathematics"; break;
		case 'C': output1="Computer Science"; break;
		case 'I': output1="Information Technology";break;
		default: isinvalid=true;} 
		switch(num) {
		case '1': output2="Freshman";break;
		case '2': output2="Sophomore";break;
		case '3': output2=" Junior";break;
		case '4': output2="Senior";break;
		default:isinvalid=true;
		}
		if(isinvalid==true) {
			System.out.print("Invalid Input.");
		}else System.out.print(output1+" "+output2);	 
	}
}