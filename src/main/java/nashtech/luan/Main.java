package nashtech.luan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) throws IOException {
		try {
			String fileName;
			if (args.length > 0) {
				fileName = args[0];
			} else {
				fileName = "file.txt";
			}
			File file = new File(fileName);
			FileReader fileReader = new FileReader(file);
			@SuppressWarnings("resource")
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			boolean isPerfectFile = true;
			String line;
			while (isPerfectFile == true && (line = bufferedReader.readLine()) != null) {
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(line);
				int sum = 0;
				int posCount = 0;
				int negCount = 0;
				while (sc.hasNextInt() == true) {
					int number = sc.nextInt();
					if (number > 0) {
						posCount++;
					} else if (number < 0) {
						negCount++;
					}

					sum += number;
				}

				if (sum != 0 || posCount != negCount) {
					isPerfectFile = false;
				}

			}

			if (isPerfectFile == true) {
				System.out.println("This file is a perfect file");
			} else {
				System.out.println("This file is not a perfect file");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
