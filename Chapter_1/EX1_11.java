package Chapter_1;
public class EX1_11 {
	public static void main(String[] args) {
		int Current_Population=312032486;
		int birth_people=((365 * 24 *60 * 60)/7);
		int next_year_birth=birth_people*5;
		int death_people=((365*24*60*60)/13);
		int next_year_death=death_people * 5;
		int immigrant_people=((365*24*60*60)/45);
		int next_year_immigrant=immigrant_people*5;
		int Furture_Population=Current_Population+next_year_birth-next_year_death+next_year_immigrant;
		System.out.println("Population Projection for the next five year: "+Furture_Population);		
		}
}
