package Chapter_1;
public class EX1_9 {
	public static void main(String[] args) {
		double width=4.5;
		double height=7.9;
		double area=width * height;
		double perimeter=2 *(width+height);
		System.out.println("The area of the rectangle is: "+Math.round(area*100)/100.0);
		System.out.println("The perimeter of the rectangle is: "+Math.round(perimeter*100)/100.0);
	}
}
