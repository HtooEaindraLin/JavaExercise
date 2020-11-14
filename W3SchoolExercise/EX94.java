package W3SchoolExercise;
import java.util.Arrays;
public class EX94 {
	public static void main(String[] args) {
	    int[] array = {1, 7, 8, 5, 7, 13, 0, 2, 4, 9};
	    
	    //sort array
	    int even=0,odd=0;
	    for(int j=0;j<array.length;j++) {
	    	if(array[j]%2==0) {
	    		even++;
	    	}
	    	else odd++;
	     }
	    int[] even_array=new int[even];
	    int[] odd_array=new int[odd];
	    int k=0,l=0;
	    for(int p=0;p< array.length;p++) {
	    	if(array[p]%2==0) {
	    		even_array[k++]=array[p];
	    	}else odd_array[l++]=array[p];
	    }
	    //Print array
	    int[] result_array=new int[even+odd];
	    int j=0;
	    for(int i=0;i<odd_array.length;i++) {
	    	result_array[j++]=odd_array[i];
	    }
	    for(int i=0;i<even_array.length;i++) {
	    	result_array[j++]=even_array[i];
	    }
	    System.out.print("Print Array: "+Arrays.toString(result_array));
	    	  
	}
}
