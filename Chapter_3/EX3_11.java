package Chapter_3;
import java.util.Scanner;
public class EX3_11 {
	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		System.out.print("Enter month: ");
		int month=input.nextInt();
		System.out.print("Enter year: ");
		int year=input.nextInt();
		boolean leap=isLeapyear(year);
		System.out.print(DisplayMonth(month)+" "+year+" has "+DisplayDaysCount(leap, year, month)+" days.");

	}
	public static boolean isLeapyear(int year) {
		if((year %4 ==0 || year/10==0) || year % 400==0) {
			return true;
		}else return false;
	}
	public static String DisplayMonth(int i) {
		String month="";
		if(i==1) month="January";
		else if(i==2) month="February";
		else if(i==3) month="March";
		else if(i==4) month="April";
		else if(i==5) month="May";
		else if(i==6) month="June";
		else if(i==7) month="July";
		else if(i==8) month="August";
		else if(i==9) month="September";
		else if(i==10) month="October";
		else if(i==11) month="November";
		else if(i==12) month="December";	
		return month;		
	}
	public static int DisplayDaysCount(boolean leap,int year,int month) {
		int days=0;
		if(leap==true) {
			if(month==2) {
				days=29;
			}
		}else {
			if(month==9 || month==4 || month==6 || month==11) {
				 days=30;
			}else if(month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12) {
				days=31;
			}else days=28;		
		} 
		return days;
	}
}
