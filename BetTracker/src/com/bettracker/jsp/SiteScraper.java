package com.bettracker.jsp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.time.LocalDate;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class SiteScraper {

	public static void main(String[] args) throws IOException {

		LocalDate date = LocalDate.now();
		System.out.println(date);

		try {
			Document doc = Jsoup.connect("http://google.com").get();

			String title = doc.title();
			System.out.println("title:" + title);

			Elements links = doc.select("a[href]");
			for (Element link : links) {
				System.out.println("\nlink:" + link.attr("href"));
				System.out.println("text: " + link.text());

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Make a URL to the web page
		URL url = new URL("http://stackoverflow.com/questions/6159118/using-java-to-pull-data-from-a-webpage");

		// Get the input stream through URL Connection
		URLConnection con = url.openConnection();
		InputStream is = con.getInputStream();

		// Once you have the Input Stream, it's just plain old Java IO stuff.

		// For this case, since you are interested in getting plain-text web page
		// I'll use a reader and output the text content to System.out.

		// For binary content, it's better to directly read the bytes from stream and
		// write
		// to the target file.

		BufferedReader br = new BufferedReader(new InputStreamReader(is));

		String line = null;
		// read each line and write to System.out
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}