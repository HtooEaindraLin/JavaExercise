package W3SchoolExercise;
public class EX66 {
	public static void main(String[] args) {
		int sum=2;
		int i=1;
		int n=2;
		while(i<100) {
			n++;
			if(isPrime(n)) {
				sum+=n;
				i++;
			}
		}
		System.out.println("Sum of the first 100 prime numbers are: "+sum);
	}
	public static boolean isPrime(int num) {
		boolean value=true;
		for(int i=2;i<=Math.sqrt(num);i++) {
			if(num%i==0) {
				return false;
			}
		}
		return value;
		
	}

}
