package W3SchoolExercise;
import java.util.Arrays;
public class EX103 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_nums = {11, 10, 13, 10, 45, 20, 33, 53};
		System.out.println("Origined Array: "+Arrays.toString(array_nums));
		int index=0;
		for(int i=0;i<array_nums.length;i++) {
			if(array_nums[i]==10) {
				index=i;
			}
		}
		System.out.print("Result Array: "+"[");
		for(int i=index+1;i<array_nums.length;i++) {
			if(i==array_nums.length-1) {
				System.out.print(array_nums[i]+"]");
			}else System.out.print(array_nums[i]+",");
		}
	}
}
