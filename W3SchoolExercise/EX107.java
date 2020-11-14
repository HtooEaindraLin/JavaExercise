package W3SchoolExercise;
import java.util.Arrays;
public class EX107 {
	public static void main(String[] args) {
		int[] array_nums = {11, 12, 13, 14, 45, 20};
		System.out.println("Origined Array: "+Arrays.toString(array_nums));
		int count=0;
		for(int i=0;i<array_nums.length-1;i++) {
			int j=i+1;
			if(array_nums[j]-array_nums[i]==1) {
				count++;
			}
		}
		if(count>=3) {
			System.out.println(true);
		}else System.out.println(false);
	}

}
