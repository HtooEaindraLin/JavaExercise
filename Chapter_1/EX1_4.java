package Chapter_1;
public class EX1_4 {
	public static void main(String[] args) {
		System.out.println("a\t"+"a^2\t"+"a^3\t");
		for(int i=1;i<=4;i++) {
			System.out.println(i+"\t"+(int)Math.pow(i, 2)+"\t"+(int)Math.pow(i, 3));
		}
	}
}
