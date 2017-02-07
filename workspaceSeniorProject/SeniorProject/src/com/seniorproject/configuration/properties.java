package com.seniorproject.configuration;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class properties {
	static Properties prop = new Properties();
	static InputStream input = null;
	static OutputStream output = null;
	
	public static String getCustomerName(){
		String customer = null;
		try{
			input = new FileInputStream ("config.properties");
			prop.load(input);		
			customer = prop.getProperty("customer");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(input != null){
				try{
					input.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		return customer;
	}
	public static void setCustomerName(String customer){
		try{
			output = new FileOutputStream ("config.properties");
			prop.setProperty("customer", customer);
			prop.store(output, "changed during test execution");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(input != null){
				try{
					output.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	}
	
	public static String getThreat1(){
		String password = null;
		try{
			input = new FileInputStream ("config.properties");
			prop.load(input);		
			password = prop.getProperty("threat1");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(input != null){
				try{
					input.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
		return password;
	}
	public static void setThreat1(String threat1){
		try{
			output = new FileOutputStream ("config.properties");
			prop.setProperty("Threat1", threat1);
			prop.store(output, "changed during test execution");
			
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			if(input != null){
				try{
					output.close();
				}catch(IOException e){
					e.printStackTrace();
				}
			}
		}
	
}

}