package Chapter_2;
public class EX2_18 {
	public static void main(String[] args) {
		System.out.println("a"+"\t"+"b"+"\t"+"pow(a,b)");
		for(int i=1;i<=5;i++) {
			System.out.println(i+"\t"+(i+1)+"\t"+(int)Math.pow(i,i+1));
		}
	}

}
