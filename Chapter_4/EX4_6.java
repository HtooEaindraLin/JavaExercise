package Chapter_4;
public class EX4_6 {
	public static void main(String[] args) {
		double radius=40;
		double rand_ang=Math.random()*180;
		double x= radius * Math.cos(rand_ang);
		double y= radius * Math.sin(rand_ang);
		System.out.print("The three random points are "+(int)rand_ang+","+(int)x+" and "+(int)y);		
	}
}
