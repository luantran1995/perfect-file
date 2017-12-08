package nashtech.luan;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class PecfectFile {
	static String filename = "file.txt";
	public static boolean checkPefectfile() throws IOException {
		File file = new File(filename);
		FileReader fileReader = null;
		fileReader = new FileReader(file);		
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		boolean isPerfectFile = true;
		String line;
		while (isPerfectFile == true && (line = bufferedReader.readLine()) != null) {
			Scanner sc = new Scanner(line);
			int sum = 0;
			int countSoduong = 0;
			int countSoam = 0;
			while (sc.hasNextInt() == true) {
				int number = sc.nextInt();
				if (number > 0) {
					countSoduong++;
				} else if (number < 0) {
					countSoam++;
				}
				sum += number;
			}

			if (sum != 0 || countSoduong != countSoam) {
				isPerfectFile = false;
			}

		}
			if(isPerfectFile == true) {
				return true;
			}	
			else 
				return false;
	}
	public static boolean checkFileEmpty() throws IOException {
		File file = new File(filename);
		if( file.length()==0) {
			return false;
		}
		return true;
		
	}

}
