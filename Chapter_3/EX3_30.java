package Chapter_3;
import java.util.Scanner;
public class EX3_30 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT: ");
		int offset=input.nextInt();
		long totalMilliseconds=System.currentTimeMillis();
		long totalSecond=totalMilliseconds/1000;
		long currentSecond=totalSecond%60;
		
		long totalMinutes=totalSecond/60;
		long currentMinutes=totalMinutes %60;
		
		long totalHours=totalMinutes /60;
		long currentHours=totalHours %24;
		
		currentHours=currentHours+offset;
		System.out.print("Current Time is: "+((currentHours>12)? currentHours-12:currentHours)+" : "+currentMinutes+" : "+currentSecond+((currentHours>12)? " PM":" AM"));
		
		
	}
}
