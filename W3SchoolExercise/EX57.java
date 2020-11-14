package W3SchoolExercise;
import java.util.Scanner;
public class EX57 {
public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=input.nextInt();
		int count=0;
		for(int i=1; i<=(int)Math.sqrt(num); i++) {
            if(num%i==0 && i*i!=num) {
                count+=2;
            } else if (i*i==num) {
                count++;
            }
        }
		System.out.print("The number is: "+count);

	}

}
