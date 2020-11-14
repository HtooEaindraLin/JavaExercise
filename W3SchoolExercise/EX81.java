package W3SchoolExercise;
import java.lang.reflect.Array;
import java.util.Scanner;
public class EX81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		int[] array=new int[3];
		System.out.print("Enter input number: ");
		for(int i=0;i< array.length;i++) {
			array[i]=input.nextInt();
		}
		int temp=array[0];
		array[0]=array[array.length-1];
		array[array.length-1]=temp;
		System.out.print("New array after swapping the first and last elements: "+"[");
		for(int i=0;i<array.length;i++) {
			if(i==array.length-1) {
				System.out.print(array[i]);
			}else 
			System.out.print(array[i]+",");
		}
		System.out.print("]");
	}

}
