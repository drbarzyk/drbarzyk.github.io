package com.bettracker.jsp;

import java.io.*;
import java.lang.ProcessBuilder.Redirect;
import java.util.Arrays;

public class SiteScraper {

	public static void main(String[] args) throws IOException {
		try {
			Process p = Runtime.getRuntime().exec("/Applications/anaconda3/bin/python3 WebContent/scraper.py");
			p.waitFor();
			BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		} catch (InterruptedException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}

		System.out.println("Done");

	}
}