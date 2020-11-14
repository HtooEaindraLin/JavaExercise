package W3SchoolExercise;
import java.util.Arrays;
public class EX102 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_nums = {11, 11, 13, 31, 45, 20, 33, 53};
		System.out.println("Origined Arrays: "+Arrays.toString(array_nums));
		int count=0;
		for(int i=0;i<array_nums.length;i++) {
			if(array_nums[i]==10 || array_nums[i]==30) {
				count++;
			}
		}
		System.out.print(count>0?true:false);
	}
}
