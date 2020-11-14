package W3SchoolExercise;
import java.util.Scanner;
public class EX23 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input a Binary Number: ");
		int binary=input.nextInt();
		int count=0;
		int sum=0;
		while(binary>0) {
			sum+=(int) ((binary%10)*(Math.pow(2,count)));
			binary=binary/10;
			count++;
		}
		//test hexadecimal
		System.out.print("Hexadecimal number is: ");
		String output="";
		if(sum>16) {
			while(sum>0) {
			output=sum % 16+output;
			sum=sum/16;
		}
			System.out.print(sum);
		}else if(sum >=10) {
				System.out.print((char)(sum-10+65));
		}else System.out.print(sum);

	}

}
