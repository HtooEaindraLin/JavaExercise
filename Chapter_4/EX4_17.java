package Chapter_4;
import java.util.Scanner;
public class EX4_17 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year=input.nextInt();
		System.out.print("Enter a month: ");
		String month=input.next();		
		  if(isValidMonth(month)) {
		  System.out.print(month+" "+year+" has "+days(Test_Month(month),year)+" days."); }
		  else  System.out.print("Month is invalid.");		 
	}
	public static int days(int month,int year) {
		if(isLeap(year)==true && month==2) {
			return 29;
		}else if(isLeap(year)==false && month==2) {
			return 28;
		}else if(month==9 || month==4 || month==6 || month==11) {
			return 30;
		}else return 31;
	}
	public static int Test_Month(String month) {
		if(month.equals("Jan")) return 1;
		else if(month.equals("Feb")) return 2;
		else if(month.equals("Mar")) return 3;
		else if(month.equals("Apr")) return 4;
		else if(month.equals("May")) return 5;
		else if(month.equals("Jun")) return 6;
		else if(month.equals("Jul")) return 7;
		else if(month.equals("Aug")) return 8;
		else if(month.equals("Sep")) return 9;
		else if(month.equals("Oct")) return 10;
		else if(month.equals("Nov")) return 11;
		else return 12;
	}
	public static boolean isValidMonth(String month) {
		if(month.length()==3 && Character.isUpperCase( month.charAt(0))){
			return true;
		}return false;
	}
	public static boolean isLeap(int year) {
		if((year% 100==0 || year%4==0) || year %400==0) {
			return true;
		}else return false;
	}
}
