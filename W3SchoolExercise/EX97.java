package W3SchoolExercise;
import java.util.Arrays;
public class EX97 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] array_nums = {10, 20, 10, 50, 20, 13, 50};
		  System.out.println(Arrays.toString(array_nums));
		  boolean isTrue=false;
		  for(int i=0;i<array_nums.length;i++) {
			  if(i+2 <array_nums.length) {
			  if(array_nums[i]==array_nums[i+2]) {
				  isTrue=true;
			  }
			  }
		  }
		  System .out.print(isTrue);

	}

}
