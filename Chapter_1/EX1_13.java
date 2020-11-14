package Chapter_1;
public class EX1_13 {
	public static void main(String[] args) {
		double a=3.4;
		double b=50.2;
		double c=2.1;
		double d=0.55;
		double e=44.5;
		double f=5.9;
		double x=(e *d-b*f)/(a*d-b*c);
		double y=(a*f-e*c)/(a*d-b*c);
		System.out.println("The x value is : "+Math.round(x*100)/100.0);
		System.out.println("The y value is : "+Math.round(y*100)/100.0);
	}
}
