package W3SchoolExercise;

import java.util.Arrays;

public class EX100 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array_nums1 = {10, 11, 10, 20, 43, 20, 50};
		int[] array_nums2 = {10, 13, 11, 20, 44, 30, 50};
		if(array_nums1.length!=array_nums2.length) {
			System.out.print("Array sizes are not the same.");
			System.exit(1);
		}
		int[] result=new int[array_nums1.length];
		for(int i=0;i<array_nums1.length;i++) {
			result[i]=Math.abs(array_nums1[i]-array_nums2[i]);
		}
		//print data
		int count=0;
		for(int i=0;i<result.length;i++) {
			if(result[i]==1) {
				count++;
			}		
		}
		System.out.print("The result of the array is: "+count);
	}
}
