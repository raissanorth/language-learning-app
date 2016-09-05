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
		Scanner sc = new Scanner(new File("/home/northrais/vocab1-10.csv"));
        sc.useDelimiter(",");

		for (int i = 0; i < 10; i++) {
			r = i;
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
