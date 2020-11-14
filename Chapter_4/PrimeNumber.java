package Chapter_4;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter start number: ");
		int start=input.nextInt();
		System.out.print("Enter end number: ");
		int end=input.nextInt();
		boolean isPrime=true;
		
		for (int i=2;i<=end;i++) {
			
			for(int j=2;j<=i/2;j++) {
				
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime==true) {
				System.out.println(i);
			}
		}
	}

}
