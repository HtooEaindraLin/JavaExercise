package W3SchoolExercise;

public class EX83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {1,3,-5,4};
		int[] array2= {1,4,-5,-2};
		System.out.print("Result is: ");
		for(int i=0;i<array1.length;i++) {
			if(i==array1.length-1) {
				System.out.print(array1[i]*array2[i]);
			}else System.out.print(array1[i]*array2[i]+",");			
		}

	}

}
