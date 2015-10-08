package kc.ac.kookmin.exception.intro;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class AAA {
	public void readFile() {
		String path = AAA.class.getResource("").getPath();
		System.out.println(path);

		try {
			BufferedReader input = new BufferedReader(new FileReader(path + "a.txt"));

			while (true) {
				String line = input.readLine();
				if (line == null)
					break;

				System.out.println(line);
			}
			input.close();
			
		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
	}
}

public class Test {
	public static void main(String args[]) {
		AAA a = new AAA();

		a.readFile();
	}
}
