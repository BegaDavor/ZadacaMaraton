import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ProsjecnoVrijeme {

	public static void main(String[] args) throws FileNotFoundException {
		
		int zbirVremena = 0;
		ArrayList<Ucesnici> ucesnici = new ArrayList<>();
		
		File file = new File(
				"/media/bega/07682308-fbd6-498e-b733-abf74a560f6c/bega/eclipse-workspace/Zadaca28/src/maraton.txt");

		Scanner input = new Scanner(file);
		
		while (input.hasNext()) {
			String ime = input.next();
			int vrijeme = input.nextInt();

			Ucesnici ucesnik = new Ucesnici(ime, vrijeme);

			ucesnici.add(ucesnik);
		}
		
		input.close();
		
		for (int i = 0; i < ucesnici.size(); i++) {
			zbirVremena += ucesnici.get(i).getTime();
		}
		
		System.out.println("Prosjecno vrijeme je: " + (zbirVremena / ucesnici.size()));

	}

}
