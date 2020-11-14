package Chapter_4;
import java.util.Scanner;
public class EX4_14 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a letter grade: ");
		String st=input.next();
		char ch=st.charAt(0);
		int num=(int)('E'-ch);
		if(num<5 || num==-1) {
		if(num==4) System.out.print("The numeric value for grade "+st+" is "+num);
		else if(num==3) System.out.print("The numeric value for grade "+st+" is "+num);
		else if(num==2) System.out.print("The numeric value for grade "+st+" is "+num);
		else if(num==1) System.out.print("The numeric value for grade "+st+" is "+num);
		else System.out.print("The numeric value for grade "+st+" is "+(num+1));
		}else System.out.print(st+"is an invalid grade.");		
	}
}
