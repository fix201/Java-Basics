package com.java.basics.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Incognito
 * Input output to files in Java
 */
public class Files {

	/**
	 * List of all files/directory names under a given directory
	 */
	public static void listFilesAndDirectories(String directory) {
		File file = new File(directory);
		for (File f : file.listFiles()) {
			System.out.println(f.getName());
		}
	}

	/**
	 * Append text to an existing file
	 */
	public static void appendTextToFile(String file, String text) {
		try (FileWriter writer = new FileWriter(file, true)) {
			writer.append(text);
			System.out.println("Success!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Count the number of times a character appears in a file
	 */
	public static Integer fileCharacterCount(String fileName, String regex) {
		Integer count = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(fileName));) {
			String line = br.readLine();
			do {
				count += line.length() - line.replaceAll(regex, "").length() ;
				System.out.println(line + " " + count);
			} while ((line = br.readLine()) != null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Math.abs(count);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// listFilesAndDirectories("resources");
		System.out.println(fileCharacterCount("resources/input/input.txt", "l"));
	}

}

