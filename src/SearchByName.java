import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SearchByName {

	public static void main(String[] args) throws FileNotFoundException {
		int vrijeme = -1;
		
		File file = new File(
				"/media/bega/07682308-fbd6-498e-b733-abf74a560f6c/bega/eclipse-workspace/Zadaca28/src/maraton.txt");

		Scanner input = new Scanner(file);
		Scanner unos = new Scanner(System.in);
		
		System.out.println("Unesite ime ucesnika: ");
		String ucesnik = unos.next();
		
		while (input.hasNext()) {
			if (input.next().equals(ucesnik)) {
				vrijeme = input.nextInt();
				System.out.println("Vrijeme: " + vrijeme);
			}
		}
		
		if (vrijeme == -1)
			System.out.println("Ucesnik ne postoji!");
		
		input.close();
		unos.close();

	}

}
