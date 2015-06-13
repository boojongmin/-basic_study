package com.school;

import com.google.common.escape.Escaper;
import com.google.common.html.HtmlEscapers;
     
public class HelloWorld {
	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		Escaper htmlEscaper = HtmlEscapers.htmlEscaper();
		String escape = null;escape = htmlEscaper.escape("<html>hihi</html>");System.out.println(escape);
		
		
	}
}
