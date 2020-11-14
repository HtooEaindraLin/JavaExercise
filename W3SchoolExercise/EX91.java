package W3SchoolExercise;
public class EX91 {
	public static void main(String[] args) {
		long startTime=System.nanoTime();
		int i;
		System.out.println("The first 10 natural numbers are :\n");
		for(i=1;i<=10;i++) {
			System.out.println(i);
		}
		long estimatedtime=System.nanoTime()-startTime;
		System.out.print("Estimated time (in nanoseconds) to get first 10 natural numbers: "+estimatedtime);
	}

}
