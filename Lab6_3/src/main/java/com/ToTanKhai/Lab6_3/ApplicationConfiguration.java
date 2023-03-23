package com.ToTanKhai.Lab6_3;

import org.springframework.context.annotation.Bean;

public class ApplicationConfiguration {

	@Bean
	public TextWriter plainTextWriter() {return new PlainTextWriter();}
	
	@Bean TextWriter pdfTextWriter() {
		return new PdfTextWriter();
	}
	
	@Bean
	public TextEdittor textEditor() {return new TextEdittor();}
}

