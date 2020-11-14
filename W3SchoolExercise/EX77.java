package W3SchoolExercise;
public class EX77 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1= {50,-20,0};
		int[] array2= {5,-50,10};
		int[] newarray= {array1[0],array2[array2.length-1]};
		for(int i=0;i<newarray.length;i++) {
			System.out.print(newarray[i]+" ");
		}
	}
}
