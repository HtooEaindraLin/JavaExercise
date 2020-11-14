package W3SchoolExercise;
import java.util.Scanner;
public class EX60 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Input a String: ");
		String st=input.nextLine();
		String[] words=st.split("[ ]+");
		for(int i=0;i<words.length-1;i++) {
			System.out.print(words[i]);
		}		
		System.out.println("\nPenultimate word: "+words[words.length - 2]);

	}
}
