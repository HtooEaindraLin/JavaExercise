package W3SchoolExercise;

import java.util.Arrays;

public class EX101 {
	public static void main(String[] args) {
		int[] array_nums = {10, 11, 10, 30, 45, 20, 33, 53};
		int found_10=0;
		int found_20=0;
		System.out.println("Origined Array: "+Arrays.toString(array_nums));
		for(int i=0;i<array_nums.length;i++) {
			if(array_nums[i]==10) {
				found_10++;
			}
			if(array_nums[i]==20) {
				found_20++;
			}
		}
		System.out.print(found_10>found_20?true:false);
	}

}
