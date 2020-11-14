package W3SchoolExercise;
import java.util.Scanner;
public class EX58 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input a Sentence: ");
		String st=input.nextLine();
		System.out.print(Character.toUpperCase(st.charAt(0)));
		for(int i=1;i<st.length()-1;i++){
			if(Character.isSpaceChar(st.charAt(i))) {
				System.out.print(st.charAt(i));
				System.out.print(Character.toUpperCase(st.charAt(++i)));
			}else System.out.print(st.charAt(i));
		}
	}
}
