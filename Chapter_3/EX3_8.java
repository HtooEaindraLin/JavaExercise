package Chapter_3;
import java.util.Scanner;
public class EX3_8 {
	public static void main(String[] args) {	
		Scanner input=new Scanner(System.in);
		System.out.print("Enter threee integers: ");
		int[] arr=new int[3];
		for(int i=0;i<3;i++) {
			arr[i]=input.nextInt();
		}
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				int temp=max;
				max=arr[i];
				arr[i]=temp;
			}
		}
		System.out.print("The increasing order is: ");
		for(int j=0;j<3;j++) {
			System.out.print(arr[j]);
		}
	}
}
