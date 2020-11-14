package W3SchoolExercise;
import java.util.Scanner;
public class EX72 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter string: ");
		String st=input.nextLine();
		int length=st.length();
		if(length >=3) {
			System.out.print(st.substring(0,3));
		}else if(length==1) {
			System.out.print(st.charAt(0)+"##");
		}else System.out.print("###");
		
	}

}
