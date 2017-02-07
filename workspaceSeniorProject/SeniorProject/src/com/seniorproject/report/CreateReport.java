package com.seniorproject.report;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

import org.apache.commons.io.FileUtils;

import com.seniorproject.configuration.Constants;

public class CreateReport {

	public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, IOException
	{	
		//File htmlTemplateFile = new File("C:\\Users\\chackett\\Desktop\\workspaceSeniorProjet\\SeniorProject\\template.html");
		File htmlTemplateFile = new File("template.html");
    	String htmlString = FileUtils.readFileToString(htmlTemplateFile, "UTF-8");
    	String customer = Constants.CUSTOMER;
    	String threat1 = Constants.THREAT1;
    	htmlString = htmlString.replace("$title", customer);
    	htmlString = htmlString.replace("$threat1", threat1);
    	htmlString = htmlString.replace("$threat2", "XSS");
    	htmlString = htmlString.replace("$threat3", "URL Tampering");
    	htmlString = htmlString.replace("$threat4", "Brute Force");
    	
    	//File newHtmlFile = new File("C:\\Users\\chackett\\Desktop\\workspaceSeniorProjet\\SeniorProject\\custom.html");
    	File newHtmlFile = new File("custom.html");
    	FileUtils.writeStringToFile(newHtmlFile, htmlString, "UTF-8");
    	System.out.println("Custom Report Created");
	}
}
