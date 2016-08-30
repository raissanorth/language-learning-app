import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class Logic {
	FlashCard f;
	FlashCard [] vocab = new FlashCard [1000];
	Boolean gerToggle;
	//list of menu names in ger and engl
	
	
	public Logic() {
	}
	
	FlashCard[] createArray() throws FileNotFoundException {
		Integer r;
		String w;
		String d;
		String g;
		Scanner sc = new Scanner(new File("/home/northrais/Vocab1-50.csv"));
		for (int i = 0; i < 50; i++) {
			r = sc.nextInt();
	        sc.useDelimiter(",");
			w = sc.next();
			d = sc.next();
			g = sc.next();
			FlashCard f = new FlashCard(r, w, d, g);
			vocab [f.getRank()] = f;
		}
		sc.close();
		System.out.println(vocab);
		return vocab; 
	}

	public static void main (String [] args) throws FileNotFoundException{
		Logic l = new Logic();
		l.createArray();
	}
	
}
