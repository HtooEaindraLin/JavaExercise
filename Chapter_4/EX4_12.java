package Chapter_4;
import java.util.Scanner;
public class EX4_12 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a hex digit: ");
		String st=input.next();
		char ch=st.charAt(0);
		int num=ch-'A'+10;
		if(num>=10 && num<=11) {
			System.out.print("The binary value is: "+ChangeBinary(num));
		}else System.out.print(st+" is an invalid input.");
	}
	public static String ChangeBinary(int num) {
		String output="";
		while(num/2!=0) {
			output=num%2+output;
			num=num/2;
		}output=num%2+output;
		return output;
	}
}
