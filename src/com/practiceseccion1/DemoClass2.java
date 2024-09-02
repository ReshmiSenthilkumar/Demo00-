package com.practiceseccion1;

public class DemoClass2  {
	public static void main(String[] args) {
        String s = "Hello World from Java";
        
        // Extract words from the string using substring
        String word1 = s.substring(0, 5);  // "Hello"
        String word2 = s.substring(6, 11); // "World"
        String word3 = s.substring(12, 16); // "from"
        String word4 = s.substring(17);    // "Java"
        
        // Reverse each word
        String reversedWord1 = reverseString(word1); // "olleH"
        String reversedWord2 = reverseString(word2); // "dlroW"
        String reversedWord3 = reverseString(word3); // "morf"
        String reversedWord4 = reverseString(word4); // "avaJ"
        
        // Concatenate reversed words with a space
        String output = reversedWord1 + " " + reversedWord2 + " " + reversedWord3 + " " + reversedWord4;
        
        // Print the result
        System.out.println(output);
    }
    
    // Method to reverse a string
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}

//	public static void main(String[] args) {
//		
//		String str = "hellO worlD";
//		
//		StringBuffer sb =new StringBuffer(str);
//		System.out.println(sb.reverse());
//		
//	}
//}
