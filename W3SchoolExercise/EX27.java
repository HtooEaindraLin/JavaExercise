package W3SchoolExercise;
import java.util.Scanner;
public class EX27 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.print("Enter octal number: ");
	int oct=input.nextInt();
	int sum=0;
	int count=0;
	while(oct>0) {
		sum+=(oct%10)*(Math.pow(8, count));
		count++;
		oct=oct/10;
	}
	//print hexadecimal number
	System.out.print("Hexadecimal number is: ");
	String output="";
	if(sum>16) {
		while (sum>0) {
			output=(sum%16)+output;
			sum=sum/16;
		}
		System.out.print(output);
	}else if(sum>=10) {
		System.out.print((char)(sum-10+65));
	}else System.out.print(sum);
	}
	
}
