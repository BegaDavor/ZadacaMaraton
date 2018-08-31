import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		ArrayList<Ucesnici> ucesnici = new ArrayList<>();
		
		// File 
		
		File file = new File("/media/bega/07682308-fbd6-498e-b733-abf74a560f6c/bega/eclipse-workspace/Zadaca28/src/maraton.txt");
		
		Scanner input = new Scanner(file);
		
		while (input.hasNext()) {
			
			
			String ime = input.next();
			int vrijeme = input.nextInt();
			
			Ucesnici ucesnik = new Ucesnici(ime, vrijeme);
			
			ucesnici.add(ucesnik);
			
		}
		
		input.close();
		
		
		int najboljeVrijeme = ucesnici.get(0).getTime();
		Ucesnici najboljiUcesnik = ucesnici.get(0);
		
		for (int i = 0; i < ucesnici.size(); i++) {
			if (ucesnici.get(i).getTime() <= najboljeVrijeme) {
				najboljeVrijeme = ucesnici.get(i).getTime();
				najboljiUcesnik = ucesnici.get(i);
			}
				
		}
		
		System.out.println("Pobjednik/ca je " + najboljiUcesnik.getName() + ", a vrijeme koje je ostvario/la je: " + najboljiUcesnik.getTime());
				
	}

}
