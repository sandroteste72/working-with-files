package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		/*
		 * File file = new File("C:\\ws_eclipse\\in.txt"); Scanner scan = null; try {
		 * scan = new Scanner(file); while (scan.hasNextLine()) {
		 * System.out.println(scan.nextLine()); } } catch (IOException e) {
		 * System.out.println("Error: " + e.getMessage()); } finally { if (scan != null)
		 * { scan.close(); } }
		 */

		/*
		 * String path = "C:\\ws_eclipse\\in.txt"; BufferedReader br = null; FileReader
		 * fr = null; try { fr = new FileReader(path); br = new BufferedReader(fr);
		 * String line = br.readLine(); while (line != null) { System.out.println(line);
		 * line = br.readLine(); } } catch (IOException e) {
		 * System.out.println("Error: " + e.getMessage()); } finally { try { if (br !=
		 * null) br.close(); if (fr != null) fr.close(); } catch (IOException e) {
		 * e.printStackTrace(); } }
		 */

//		String path = "C:\\ws_eclipse\\in.txt";
//		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//			String line = br.readLine();
//			while (line != null) {
//				System.out.println(line);
//				line = br.readLine();
//			}
//		} catch (IOException e) {
//			System.out.println("Error: " + e.getMessage());
//		}
//
//		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
//		path = "C:\\ws_eclipse\\out.txt";
//		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
//			for (String line : lines) {
//				bw.write(line);
//				bw.newLine();
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}

		/*
		 * Scanner scan = new Scanner(System.in);
		 * 
		 * System.out.println("Enter a folder path: "); String strPath =
		 * scan.nextLine();
		 * 
		 * File path = new File(strPath);
		 * 
		 * File[] folders = path.listFiles(File::isDirectory);
		 * 
		 * System.out.println("FOLDERS:"); for (File folder : folders) {
		 * System.out.println(folder); }
		 * 
		 * File[] files = path.listFiles(File::isFile);
		 * 
		 * System.out.println("FILES:"); for (File file : files) {
		 * System.out.println(file); }
		 * 
		 * boolean success = new File(strPath + "\\subdir").mkdir();
		 * System.out.println("Directory created successfully: " + success);
		 * 
		 * scan.close();
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter a file path: ");
		String strPath = scan.nextLine();

		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());

		scan.close();
	}
}
