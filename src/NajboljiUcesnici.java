import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class NajboljiUcesnici {

	public static void main(String[] args) throws FileNotFoundException {

		ArrayList<Ucesnici> ucesnici = new ArrayList<>();

		File file = new File(
				"/media/bega/07682308-fbd6-498e-b733-abf74a560f6c/bega/eclipse-workspace/Zadaca28/src/maraton.txt");

		File najboljiMaratonci = new File(
				"/media/bega/07682308-fbd6-498e-b733-abf74a560f6c/bega/eclipse-workspace/Zadaca28/src/najboljiMaratonci.txt");

		Scanner input = new Scanner(file);
		PrintWriter output = new PrintWriter(najboljiMaratonci);

		while (input.hasNext()) {
			String ime = input.next();
			int vrijeme = input.nextInt();

			Ucesnici ucesnik = new Ucesnici(ime, vrijeme);

			ucesnici.add(ucesnik);
		}

		input.close();
		
		for (int i = 0; i < ucesnici.size(); i++) {
			if (ucesnici.get(i).getTime() < 300) {
				output.println(ucesnici.get(i).getName() + " " + ucesnici.get(i).getTime());
			}
		}
		
		output.close();
		
		System.out.println("Ispis je gotov!");

	}

}
