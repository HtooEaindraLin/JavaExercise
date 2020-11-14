package W3SchoolExercise;
import java.util.Arrays;
public class EX106 {
	public static void main(String[] args) {
		int[] array_nums = {11, 15, 13, 10, 45, 20};
		System.out.println("Origined Array: "+Arrays.toString(array_nums));
		int first_num=array_nums[0];
		for(int i=1;i<array_nums.length;i++) {
			array_nums[i-1]=array_nums[i];
			if(i==array_nums.length-1){
				array_nums[i]=first_num;
			}
		}
		System.out.print("Result Array: "+Arrays.toString(array_nums));		
	}
}
