package fr.mrdragonn.gurvv29.textual_rpg;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Methods {
	static void writeFile(String fileContent, String filePathOutput) {
		try {
			FileWriter fw = new FileWriter(filePathOutput, false);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(fileContent);
			bw.flush();
			bw.close();
			System.out.println("Fichier créé");
		} catch (IOException e) {
			System.err
					.println("Erreur levée de type IOException au niveau de la méthode "
							+ "writeFile(...) : ");
			e.printStackTrace();
		}
	}
	public static void readFile(String filePathInput, String filePathOutput) {

		Scanner scanner = null;
		String line = null;
		StringBuffer str = new StringBuffer();
		try {
			scanner = new Scanner(new File(filePathInput));

			while (scanner.hasNextLine()) {
				line = scanner.nextLine();

				if (line != null)
					str.append(line + "\r\n");
			}

			scanner.close();
		} catch (FileNotFoundException e) {
			System.err.println("Erreur levée de type FileNotFoundException"
					+ " au niveau de la méthode " + "readFile(...) : ");
			e.printStackTrace();
		}

		Methods.writeFile(str.toString(), filePathOutput);
	}// End readFile(...)
}
