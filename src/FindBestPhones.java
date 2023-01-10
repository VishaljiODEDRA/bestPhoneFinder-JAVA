import java.util.*;
import java.io.IOException;

public class FindBestPhones {
	public static String PHONES_FILE = "phone-data.txt";
	
	public static void main(String[] args) {
		// TODO: use the parseFile method to get the phone data from the file
		
		// TODO: print the model names of all the best phones
		
		// TODO: handle I/O failures by printing an error message
		try {
			PhoneList p = PhoneParser.parseFile(PHONES_FILE);
			
			Collection<Phone> listPhone = p.getBestPhones();
			
			for (Phone x: listPhone) {
				System.out.println(x.getModel());
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
} 
