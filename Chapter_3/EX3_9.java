package Chapter_3;
import java.util.Scanner;
public class EX3_9 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the first of 9 digits of an ISBN as integer: ");
		int[] arr=new int[9];
		for(int i=0;i< arr.length;i++) {
			arr[i]=input.nextInt();
		}
		//calculation
		int sum=0;
		for(int i=0;i< arr.length;i++) {
			sum+=arr[i]*(i+1);
		}
		//for output
		System.out.print("The ISBN-10 number is ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(i);
		}
		if(sum%11==10) {
			System.out.print("X");
		}else System.out.print(sum %11);
	}
}
