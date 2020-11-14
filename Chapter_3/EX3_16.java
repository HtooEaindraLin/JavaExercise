package Chapter_3;
public class EX3_16 {
	public static void main(String[] args) {
		int width=(int) (Math.random()*100);
		int height=(int) (Math.random()*200);
		if(width==0 && height==0) {
			System.out.print("The rectange is centered at (0,0).");
		}else System.out.print("The rectangle's coordinate is "+"( "+width+" , "+height+" ) ");
	}

}
