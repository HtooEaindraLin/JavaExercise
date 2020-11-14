package W3SchoolExercise;
import java.util.Scanner;
public class EX82 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number into the array: ");
		int[] array=new int[5];
		for(int i=0;i< array.length;i++) {
			array[i]=input.nextInt();
		}
		int max=0;
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.print("Largest element between first,last and middle value is: "+max);
		

	}

}
