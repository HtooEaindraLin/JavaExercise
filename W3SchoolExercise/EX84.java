package W3SchoolExercise;
import java.util.Scanner;
public class EX84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a string: ");
		String st=input.nextLine();
		int st_remove=st.length()-3;
		if(st.length()>3){
			int last=st.length()-st_remove;
			System.out.println(st.substring(last)+st+st.substring(last));
		}		
	}

}
