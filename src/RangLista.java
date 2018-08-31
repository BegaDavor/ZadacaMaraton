
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RangLista {
	
	public static int[] bubbleSort(int[] niz) {
		boolean prebacen = true;
		int i = 0;
		int kontejner;
		while (prebacen) {
			prebacen = false;
			i++;
			for (int j = 0; j < niz.length - i; j++) {
				if (niz[j] > niz[j + 1]) {
					kontejner = niz[j];
					niz[j] = niz[j + 1];
					niz[j + 1] = kontejner;
					prebacen = true;
				}
			}
		}
		return niz;

	}

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Ucesnici> ucesnici = new ArrayList<>();
		ArrayList<Ucesnici> rangLista = new ArrayList<>();

		// File

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

		int[] vremena =new int[ucesnici.size()];
		
		for (int i = 0; i < vremena.length; i++) {
			vremena[i] = ucesnici.get(i).getTime();
		}
		
		int[] sortiranaVremena = bubbleSort(vremena);
		
		for (int i = 0; i < sortiranaVremena.length; i++) {
			for (int j = 0; j < ucesnici.size(); j++) {
				if (ucesnici.get(j).getTime() == sortiranaVremena[i]) {
					rangLista.add(ucesnici.get(j));
				}
			}
			
		}

		for (int i = 0; i < rangLista.size(); i++) {
			System.out.println((i + 1) + ". " + rangLista.get(i).getName() + " " + rangLista.get(i).getTime());
		}

	}

}
