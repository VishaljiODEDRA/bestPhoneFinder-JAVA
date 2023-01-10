
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class PhoneParser {
	/*
	 * Parses a phone data string, in the following format:
	 * 
	 *     model screenSize batteryCapacity
	 * 
	 * The model name is encoded with underscores instead of spaces.
	 */
	public static Phone parse(String data) {
		// TODO: parse the phone data string, and return a Phone object.
		// you may use string manipulation, a regex, or a Scanner
		String[] phones = data.split(" ");
		
		String model = phones[0].replace("_", " ");
		double screenSize = Double.parseDouble(phones[1]);
		int batterySize = Integer.parseInt(phones[2]);
		return new Phone(model, screenSize, batterySize);
	}
	 
	/*
	 * Returns a PhoneList by parsing a text file containing the phone data.
	 */
	public static PhoneList parseFile(String filename) throws IOException {
		// TODO: create a PhoneList
		PhoneList modelList = new PhoneList();
		
		// TODO: create a BufferedReader to read from the file
		BufferedReader file = new BufferedReader(new FileReader(filename));
		
		// TODO: for each line, parse it as a Phone and add it to the list 
		while(true) {
			String l = file.readLine();
			if (l == null) {
				file.close();
				break;
			}
			Phone phone = parse(l);
			modelList.addPhone(phone);
		}
		
		return modelList;
	}
}
