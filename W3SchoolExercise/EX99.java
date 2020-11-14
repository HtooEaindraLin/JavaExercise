package W3SchoolExercise;
import java.util.Arrays;
import java.util.Scanner;
public class EX99 {
	public static void main(String[] args) {
		int[] array_nums = {10, 20, 10, 20, 40, 20, 50};
		System.out.println("Origined Arrays: "+Arrays.toString(array_nums));
		Scanner input=new Scanner(System.in);
		System.out.print("Enter specified number: ");
		int specified=input.nextInt();
		int result=0;
		for(int i=0;i<array_nums.length-1;i++){
			if(array_nums[i]!=specified && array_nums[i+1]!=specified) {
				result=1;
			}
		}
		if(result==1) {
			System.out.print(false);
		}else System.out.print(true);
	}
}
