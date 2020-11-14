package Chapter_4;
import java.util.Scanner;
public class EX4_19 {
	public static void main(String[] args) {		
		  Scanner input=new Scanner(System.in);
		  System.out.print("Enter the first 9 digits of an ISBN as integer: ");
		  String st=input.next(); 
		  int[] d=new int[9];
		  for(int i=0;i<d.length;i++) {
			  d[i]=st.charAt(i)-48;
		  }
		  System.out.print("The ISBN-10 number is "+st);
		  // to calculate check sum
		  int sum=0;
		  for(int i=0;i<d.length;i++) {
			  sum+=d[i]*(i+1);
		  }
		  // test validation
		  if(sum%11!=10) {
			  System.out.print(sum%11);
		  }else System.out.print('X');
	}

}
