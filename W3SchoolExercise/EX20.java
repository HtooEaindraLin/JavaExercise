package W3SchoolExercise;

import java.util.Scanner;

public class EX20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner input=new Scanner(System.in);
		  System.out.print("Enter decimal number: ");
		  int decimal=input.nextInt();
		  System.out.print("Hexadecimal number is: "); 
		  if(decimal>=10 && decimal <=16)
		  {
			  System.out.print((char)(decimal-10+65)); 
		  }
		  else System.out.print(decimal);	 

	}

}
