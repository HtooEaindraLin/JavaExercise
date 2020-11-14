package W3SchoolExercise;
import java.util.Scanner;
public class EX92 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter array number:");
		int[] array=new int[5];
		for(int i=0;i<array.length;i++) {
			array[i]=input.nextInt();
		}
		int even=0,odd=0;
		//test odd or even
		for(int i=0;i<array.length;i++) {
			if(array[i]%2==0) {
				even++;
			}else odd++;
		}
		System.out.println("The number of even counts are: "+even);
		System.out.println("The number of odd counts are: "+odd);
	}

}
