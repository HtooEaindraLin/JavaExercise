package Chapter_1;
public class EX1_8 {
	public static void main(String[] args) {
		double radius=5.5;
		double perimeter=2* radius * Math.PI;
		double area=radius * radius * Math.PI;
		System.out.println("The perimeter of circle is: "+Math.round(perimeter*100)/100.0);
		System.out.println("The area of circle is: "+Math.round(area*100)/100.0);
	}
}
