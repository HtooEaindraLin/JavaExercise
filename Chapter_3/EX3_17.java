package Chapter_3;
import java.util.Scanner;
public class EX3_17 {
	public static void main(String[] args) {	
		Scanner input=new Scanner(System.in);
		System.out.print("Scissor (0), rock (1) ,paper (2) : ");
		int guess=input.nextInt();
		int num=(int) (Math.random()*3);
		System.out.print("The computer is "+Condition(num)+". ");
		System.out.print("You are "+Condition(guess)+". ");
		if(guess==num) {
			System.out.print("It is a draw");
		}else if((guess==1 && num==0) || (guess==0 && num==2) || (guess==2 && num==1)) {
			System.out.print("You Won");
		}else System.out.print("You Lost");
	}
	public static String Condition(int i) {
		String output="";
		if(i==0) {
			output="Scissor";
		}else if(i==1) {
			output="Rock";
		}else output="Paper";
		return output;
	}

}
