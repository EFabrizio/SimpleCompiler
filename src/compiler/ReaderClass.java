package compiler;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * A class for reading files for the compiler.
 * @author TxSec
 *
 */
public class ReaderClass {

	/**
	 * Reads a file from a location.
	 * @param location , File Location.
	 */
	public void initInput(String location) {
		File file = new File(location);
		try {
			BufferedReader reader = new BufferedReader(new FileReader(file));
			StringBuilder build = new StringBuilder();
			String text = null;
			while((text = reader.readLine()) != null){
				build.append(text);
			}
			System.out.println(build.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
