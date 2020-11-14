package W3SchoolExercise;
import java.util.Scanner;
public class EX112 {
		public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter factorial number is: ");
		int num=input.nextInt();
		int product=1;
		for(int i=1;i<=num;i++){
			product=product*i;
		}
		String st=""+product;
		int count=0;
		for(int i=st.length()-1;i>0;i--) {
			if(st.charAt(i)=='0') {
				count++;
			}else break;
		}
		System.out.print("The output is: "+count);
		
	}

}
