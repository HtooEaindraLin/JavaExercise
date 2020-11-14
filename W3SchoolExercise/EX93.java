package W3SchoolExercise;
import java.util.Arrays;
public class EX93 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {10,10,2,4,20,20};
		System.out.println("Original Arrays: "+Arrays.toString(num));
		boolean found1010=false;
		boolean found2020=false;
		for(int i=0;i<num.length;i++) {
			if(num[i]==10 && num[i+1]==10) {
				found1010=true;
			}
			if(num[i]==10 && num[i+1]==10) {
				found2020=true;
			}
		}
		System.out.printf(String.valueOf(found1010!=found2020));

	}

}
