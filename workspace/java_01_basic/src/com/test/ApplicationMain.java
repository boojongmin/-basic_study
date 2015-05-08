package com.test;

import com.google.common.escape.Escaper;
import com.google.common.html.HtmlEscapers;

public class ApplicationMain {
	public static void main(String[] args){
		Escaper htmlEscaper = HtmlEscapers.htmlEscaper();
		String escape = htmlEscaper.escape("<html>hihi<html>");
		System.out.println(escape);
	}
}
