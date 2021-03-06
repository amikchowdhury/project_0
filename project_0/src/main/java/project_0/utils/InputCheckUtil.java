package project_0.utils;

import java.io.*;


public class InputCheckUtil {
	
	public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static String getString() {
		while(true){
		try {
			String input = reader.readLine();
			if(!input.isEmpty()) {
				return input;
			}
			else{
				System.out.println("Please enter valid values");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		}
	}
	
	
	public static Integer getInteger() {
		while(true) {
		try {
			String input = reader.readLine();
			if(!input.isEmpty()) {
			Integer i = Integer.parseInt(input);
			return i;
			}
		
			else {
				System.out.println("Please enter valid values");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	
	}}
	
	
	public static Double getDouble() {
		while(true) {
		try {
			String input = reader.readLine();
			if(!input.isEmpty()) {
			Double d = Double.parseDouble(input);
			return d;
			}
		
			else {
				System.out.println("Please enter valid values");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
	}}
	
	
	
	public static String getString(int length) {
		while(true) {
		try {
			String input = reader.readLine();
			if(!input.isEmpty() && input.length()<=length) {
				return input;
			}
			else{
				System.out.println("Please enter valid values");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}}
	
	
	
	
	public static String getfixedlengthString(int length) {
		while(true) {
		try {
			String input = reader.readLine();
			if(!input.isEmpty() && input.length()==length) {
				return input;
				
			}
			else{
				System.out.println("Please enter valid values of length "+length+ " characters");
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
		}
	}
	
	
	public static Integer getInteger(Integer min, Integer max) {
		while(true) {
		try {
			String input = reader.readLine();
			if(!input.isEmpty()) {
			Integer i = Integer.parseInt(input);
				if(i>= min && i <= max) {
					return i;
				}
			}
		
			else {
				System.out.println("Please enter valid values");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		}
	}
	
	
	public static Double getDouble(Double min, Double max) {
		
		while(true) {
		try {
			String input = reader.readLine();
			if(!input.isEmpty()) {
			Double d = Double.parseDouble(input);
				if(d>= min && d <= max) {
					return d;
				}
			}
		
			else {
				System.out.println("Please enter valid values");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
	
	}}
	
}
