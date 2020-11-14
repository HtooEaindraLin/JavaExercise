package W3SchoolExercise;
import java.util.Scanner;
public class EX110 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input a positive integer: ");
		int num=input.nextInt();
		boolean found=false;
		for (int i=1;i<num;i++) {
			if(Math.pow(4,i)==num){
				found=true;
			}
		}
		System.out.print(found==true?true:false);
	}

}
