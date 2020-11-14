package W3SchoolExercise;
import java.util.Scanner;
public class EX75 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number into the array: ");
		int[] array=new int[5];
		for(int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
		}
		System.out.print(array.length>=2 && (array[0]==array[array.length-1]));
	}
}