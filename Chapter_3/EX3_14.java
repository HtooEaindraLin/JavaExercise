package Chapter_3;
import java.util.Scanner;
public class EX3_14 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num=(int) (Math.random()*2);
		System.out.print("Enter 1 or 0(Head or Tail): ");
		int user=input.nextInt();
		if(num==user) {
			System.out.print("The guess is correct");
		}else System.out.print("The guess isn't correct.");
	}
}
