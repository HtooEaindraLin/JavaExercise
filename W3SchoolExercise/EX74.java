package W3SchoolExercise;
import java.util.Scanner;
public class EX74 {
	public static void main(String[] args) {
		int[] array=new int[5];
		Scanner input=new Scanner(System.in);
		System.out.print("Enter number: ");
		for(int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
		}
		if(array[0]==10 && array[array.length-1]==10){
			System.out.print(true);
		}else System.out.print(false);
	}
}
