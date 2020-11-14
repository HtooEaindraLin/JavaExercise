package W3SchoolExercise;
import java.util.Scanner;
public class EX30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input a hexadecimal number: ");
		int hex=input.nextInt();
		int sum=0;
		int count=0;
		while(hex>0) {
			sum+=(hex%10) *Math.pow(16,count);
			count++;
			hex=hex/10;
		}
		//print octal number
		String output="";
		while(sum>0) {
			output=sum%8+output;
			sum=sum/8;
		}
		System.out.print("Equivalent of octal number is: "+output);

	}

}
