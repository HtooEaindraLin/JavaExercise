package W3SchoolExercise;
import java.util.Scanner;
public class EX80 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] array=new int[3];
		int max=0;
		System.out.print("Enter array values: ");
		for(int i=0;i<array.length;i++){
			array[i]=input.nextInt();
		}
		for(int i=0;i<array.length;i++) {
			if(max<array[i]) {
				max=array[i];
			}
		}
		System.out.print("Larger value between first and last element: "+max);
	}
}
