import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AbecedniRed {

	public static void main(String[] args) throws FileNotFoundException {
		
	ArrayList<String> imena = new ArrayList<>();
		
		File file = new File(
				"/media/bega/07682308-fbd6-498e-b733-abf74a560f6c/bega/eclipse-workspace/Zadaca28/src/imena.txt");

		Scanner input = new Scanner(file);
		
		while (input.hasNext()) {
			String ime = input.next();

			imena.add(ime);
		}
		
		input.close();
		
		String[] abecedniRed = new String[imena.size()];
		
		for (int i = 0; i < abecedniRed.length; i++) {
			int redniBroj = 0;
			String ime = imena.get(0);
			for (int j = 0; j < imena.size(); j++) {
				if (imena.get(j).compareTo(ime) < 0) {
					ime = imena.get(j);
					redniBroj = j;
					}
			}
			abecedniRed[i] = ime;
			imena.remove(redniBroj);
		}
		
		for (int i = 0; i < abecedniRed.length; i++) {
			System.out.println(abecedniRed[i]);
		}

	}

}
