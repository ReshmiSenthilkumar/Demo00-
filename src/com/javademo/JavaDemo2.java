package com.javademo;

public class JavaDemo2 extends JavaDemo{


	
	public static void main (String[] args) {
		JavaDemo2 details=new JavaDemo2();
		
		details.emailID();
		
	}


	public void emailID() {
		System.out.println("resh123@gmail.com");
		
	}

	
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	  public static void main(String[] args) {
//	        
//	        String input = "Numbers in this string: 7 12 19 34";
//
//	        // Step 1: Process each character to find numbers
//	        String[] parts = input.split(" "); // Split the string by spaces
//	        for (String part : parts) {
//	            try {
//	                // Step 2: Convert the part to an integer
//	                int number = Integer.parseInt(part);
//
//	                // Step 3: Check if the number is odd or even
//	                if (number % 2 == 0) {
//	                    System.out.println(number + " is even.");
//	                } else {
//	                    System.out.println(number + " is odd.");
//	                }
//	            } catch (NumberFormatException e) {
//	                // If part is not a valid integer, ignore it
//	                System.out.println(part + " is not a number.");
//	            }
//	        }
//	    }
//}
	
//	 public static void main(String[] args) {
//	        
//	        String input = "Here are some numbers: 5, 10, 13, 24, and 37.";
//
//	      
//	        List<Integer> numbers = extractNumbers(input);
//
//	        
//	        List<Integer> oddNumbers = new ArrayList<>();
//	        List<Integer> evenNumbers = new ArrayList<>();
//
//	        for (int number : numbers) {
//	            if (number % 2 == 0) {
//	                evenNumbers.add(number);
//	            } else {
//	                oddNumbers.add(number);
//	            }
//	        }
//
//	        
//	        System.out.println("Even numbers: " + evenNumbers);
//	        System.out.println("Odd numbers: " + oddNumbers);
//	    }
//
//	
//	    private static List<Integer> extractNumbers(String input) {
//	        List<Integer> numbers = new ArrayList<>();
//	        Pattern pattern = Pattern.compile("\\d+"); // Regex to find numbers
//	        Matcher matcher = pattern.matcher(input);
//
//	        while (matcher.find()) {
//	            numbers.add(Integer.parseInt(matcher.group())); // Convert and add to list
//	        }
//
//	        return numbers;
//	    }
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	 public static void main(String[] args) {
//	        // Initialize a variable (e.g., int i = 0)
//	        int i = 0;
//
//	        // Infinite loop
//	        while (true) {
//	            // Print "can't stop"
//	            System.out.println("can't stop");
//
//	            // Increment and decrement i
//	            i++; // This line increments i
//	            i--; // This line decrements i
//
//	            // Since i++ and i-- cancel each other out, they don't affect the loop
//	            // The loop will continue indefinitely due to the 'while (true)' condition
//	        }
//	    }
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	 public static void main(String[] args) {
//	        // Create a Scanner object to read input
//	        Scanner scanner = new Scanner(System.in);
//	        
//	        // Prompt the user to enter a number
//	        System.out.print("Enter a positive integer: ");
//	        int n = scanner.nextInt();
//	        
//	        // Initialize sum to 0
//	        int sum = 0;
//	        
//	        // Use a for loop to calculate the sum of first n natural numbers
//	        for (int i = 1; i <= n; i++) {
//	            sum += i; // Add i to the sum
//	        }
//	        
//	        // Output the result
//	        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
//	        
//	        // Close the scanner to avoid resource leak
//	        scanner.close();
//	    }
//	}
//	
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//	public static void main(String args[])   
//	{    
//	int i, j, row=6;   
//	for(i=0; i<row; i++)   
//	{    
//	for(j=0; j<=i; j++)   
//	{     
//	System.out.print("* ");   
//	}    
//	System.out.println();   
//	}   
//	}   
//	}  

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String args[])   
//	{    
//	int i, j, row = 6;       
//	for (i=0; i<row; i++)   
//	{     
//	for (j=row-i; j>1; j--)   
//	{  
//	System.out.print(" ");   
//	}   
//	for (j=0; j<=i; j++ )   
//	{     
//	System.out.print("* ");   
//	}   
//	System.out.println();   
//	}   
//	}   
//	}  
