package W3SchoolExercise;

import java.nio.charset.Charset;
public class EX40 {
	public static void main(String[] args) {
		System.out.println("List of the character sets: ");
		for(String str : Charset.availableCharsets().keySet()) {
			System.out.println(str);
		}
	}

}
