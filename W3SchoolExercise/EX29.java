package W3SchoolExercise;
import java.util.Scanner;
public class EX29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter Hexadecimal Number is: ");
		int hex=input.nextInt();
		int sum=0;
		int count=0;
		while(hex>0) {
			sum+=(hex%10)*Math.pow(16, count);
			hex=hex/10;
			count++;
		}
		//print binary number
		String st="";
		while(sum>0) {
			st=sum%2+st;
			sum=sum/2;
		}
		System.out.print("Binary number is: "+st);

	}

}
