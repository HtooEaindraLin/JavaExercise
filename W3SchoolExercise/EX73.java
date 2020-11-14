package W3SchoolExercise;
import java.util.Scanner;
public class EX73 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter first string: ");
		String st1=input.nextLine();
		System.out.print("Enter second string: ");
		String st2=input.nextLine();
		if(st1.length()>0 && st2.length()>0) {
			System.out.print(st1.substring(0,1)+st2.substring(st2.length()-1));
		}else if(st1.length()==0 ) System.out.print("#"+st2.substring(st2.length()-1));
		else if(st2.length()==0) System.out.println(st1.substring(0,1)+"#");
		else System.out.print("#"+"#");
	}

}
