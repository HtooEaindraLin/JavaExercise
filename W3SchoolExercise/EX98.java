package W3SchoolExercise;
import java.util.Arrays;
import java.util.Scanner;
public class EX98 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] array_nums = {10, 20, 10, 50, 20, 13, 20};
		 System.out.println("Origined Array:"+Arrays.toString(array_nums));
		 Scanner input=new Scanner(System.in);
		 System.out.print("Enter Specified number: ");
		 int spec_number=input.nextInt();
		 int count=0;
		 for(int i=0;i<array_nums.length;i++) {
			 if(array_nums[i]==spec_number) {
				count++; 
			 }
		 }
		 System.out.print(count>=3?true:false);


	}

}
