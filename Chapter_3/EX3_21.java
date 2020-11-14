package Chapter_3;
import java.util.Scanner;
public class EX3_21 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter year: ");
		int year=input.nextInt();
		System.out.print("Enter month 1-12: ");
		int m=input.nextInt();
		System.out.print("Enter the day of the month 1-31: ");
		int q=input.nextInt();
		int j=year/100;
		int k=year % 100;
		int h=(q+((26*(m+1))/10)+k+(k/4)+(j/4)+(5 *j))%7;
		System.out.print("The day of the week is ");
		if(h==0) System.out.print("Saturday");
		else if(h==1) System.out.print("Sunday");
		else if(h==2) System.out.print("Monday");
		else if(h==3) System.out.print("Tuesday");
		else if(h==4) System.out.print("Wednesday");
		else if(h==5) System.out.print("Thursday");
		else if(h==6) System.out.print("Friday");		
	}
}
