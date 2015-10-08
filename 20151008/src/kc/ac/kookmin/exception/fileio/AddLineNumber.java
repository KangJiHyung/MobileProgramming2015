package kc.ac.kookmin.exception.fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Makes numbered.txt the same as original.txt, but with each line numbered.
 */
public class AddLineNumber {
	public static void main(String[] args) {
		String path = AddLineNumber.class.getResource("").getPath();
		System.out.println(path);

		try {
			BufferedReader inputStream = new BufferedReader(new FileReader(path + "original.txt"));
			PrintWriter outputStream = new PrintWriter(new FileOutputStream(path + "numbered.txt"));

			int count = 0;

			while (true) {
				String line = inputStream.readLine();
				if (line == null)
					break;

				count++;

				outputStream.println(count + line);
			}

			inputStream.close();
			outputStream.close();
			
		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
	}
}
