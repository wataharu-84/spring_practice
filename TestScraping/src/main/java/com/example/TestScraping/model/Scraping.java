package com.example.TestScraping.model;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scraping {
	 
	public static void scrape() {
		try {
		 //　指定のURLをGETで取得
		 String url = "https://news.yahoo.co.jp/rss/list";
		 Document doc = Jsoup.connect(url).timeout(5000).get();
		 
		 //　取得したdocumentからCSSセレクタで要素を抽出
		 Elements elms = doc.select("CSS selector");
		 
		 // Elementからforループでtextを抽出
		 for(Element elm : elms) {
			 String text = elm.text();
			 System.out.println(elm);
			 System.out.println(text);
		 }
		 
		 } catch (IOException e) {
			e.printStackTrace();
		}
	}
}


