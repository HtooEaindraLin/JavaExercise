package Chapter_2;
import java.util.Scanner;
public class EX2_11 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number of years: ");
		int years=input.nextInt();
		int currentpopulation=312032486;
		int birth_people=(365 * 24 * 60 * 60)/7;
		int next_birth=birth_people * years;
		int death_people=(365 * 24 * 60 * 60)/13;
		int next_death=death_people * years;
		int immigrant_people=(365 * 24 *60 *60)/45;
		int next_immigrant=immigrant_people * years;
		int future_population=currentpopulation+next_birth-next_death+next_immigrant;
		System.out.print("The population in "+years+" years is: "+future_population);
	}
}
