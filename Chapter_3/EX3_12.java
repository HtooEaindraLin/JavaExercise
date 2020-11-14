package Chapter_3;
import java.util.Scanner;
public class EX3_12 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a three digit integer: ");
		int digit=input.nextInt();
		int primary=digit;
		int[] arr=new int[3];
		int i=0;
		while(digit/10!=0) {			
			arr[i++]=digit%10;
			digit=digit/10;							
		}
		arr[i]=digit%10;
		if(arr[0]==arr[arr.length-1]) {
			System.out.print(primary+" is a palindrome.");
		}else System.out.print(primary+" is not a plaindrome.");
		
	}
}
