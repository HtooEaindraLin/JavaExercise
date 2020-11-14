package W3SchoolExercise;
import java.util.Arrays;
public class EX96 {
	public static void main(String[] args) {
		int[] array={10, 70, 80, 50, 20, 13, 50};
		System.out.println("Original Arrays: "+Arrays.toString(array));
		boolean found_10 = false;
		boolean found_20=false;
		for(int i=0;i<array.length;i++) {
			if(array[i]==10) {
				found_10=true;
			}
			if((found_10==true) && array[i]==20) {
				found_20=true;
			}
		}
		System.out.print(found_10==found_20);
	}
}
