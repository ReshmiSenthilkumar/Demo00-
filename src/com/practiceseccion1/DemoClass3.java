package com.practiceseccion1;

public class DemoClass3  {
	
	 public static void main(String[] args) {
	        String s = "Hello World";
	        
	       
	        String s1 = s.substring(0, 5); 
	        String s2 = s.substring(6);    
	      
	        String output = s2 + " " + s1;
	       
	        System.out.println(output);
	    }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public static void main(String[] args) {
//	  String s = "Hello World";
//      
//      
//      String String1 = s.substring(0, 5); 
//      String String2 = s.substring(6);    
//      
//      
//      String reversedString1 = reverseString(String1); 
//      String reversedString2 = reverseString(String2); 
//      
//      
//      String output = reversedString1 + " " + reversedString2.toLowerCase();
//      
//     
//      System.out.println(output);
//  }
//  
//
//	
//  public static String reverseString(String str) {
//      String reversed = "";
//      for (int i = str.length() - 1; i >= 0; i--) {
//          reversed += str.charAt(i);
//      }
//      return reversed;
//  }
//}
