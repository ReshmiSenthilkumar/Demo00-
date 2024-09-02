package com.javademo;


public class JavaDemo{
	
	
	  public static void main(String[] args){
	        
		  int no=69;
		  int count= 0;
		  for(int i = 2;i<no;i++) {
		
		  
			if(no%i==0) {
				count++;
			}
		  }
			if(count>0) {
				System.out.println(" not prime");
			}
			else {
				System.out.println("prime");
		}
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
//	 static int square(int number) {
//	        return number * number;
//	    }
//
//	    public static void main(String[] args) {
//	        int output = square(12); 
//	        System.out.println("Square of 12: " + output);
//	    }
//
//	
//	
//}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	  public static void main(String[] args) {
//	     
//	        int[][] a = {
//	            {10, 25, 33},
//	            {41, 57, 68},
//	            {71, 84, 19}
//	        };
//	        int[][] b = {
//	            {59, 88, 74},
//	            {36, 45,14},
//	            {33, 22, 11}
//	        };
//	        int rows = a.length;
//	        int cols = a[0].length;
//
//	        
//	        int[][] c = new int[rows][cols];
//
//	        // Step 3: Add corresponding elements
//	        for (int i = 0; i < rows; i++) {
//	            for (int j = 0; j < cols; j++) {
//	                c[i][j] = a[i][j] + b[i][j];
//	            }
//	        }
//
//	        // Step 4: Print the resulting matrix c
//	        System.out.println("Matrix A:");
//	        printMatrix(a);
//	        
//	        System.out.println("Matrix B:");
//	        printMatrix(b);
//
//	        System.out.println("Matrix C (Result of A + B):");
//	        printMatrix(c);
//	    }
//
//	    // Method to print a matrix
//	    private static void printMatrix(int[][] matrix) {
//	        for (int[] row : matrix) {
//	            for (int elem : row) {
//	                System.out.print(elem + " ");
//	            }
//	            System.out.println();
//	        }
//	    }
//	
//	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	public static void main(String[] args) {
//		
//        int[] arr = {12, 35, 1, 10, 34, 1};
//        findSecondAndThirdLargest(arr);
//    }
//    private static void findSecondAndThirdLargest(int[] arr) {
//     
//        if (arr.length < 3) {
//            System.out.println("Array does not have enough elements.");
//            return;
//        }
//
//        int first = Integer.MIN_VALUE;  
//        int second = Integer.MIN_VALUE;  
//        int third = Integer.MIN_VALUE;   
//
// 
//        for (int num : arr) {
//            if (num > first) {
//               
//                third = second;
//                second = first;
//                first = num;
//            } else if (num > second && num < first) {
//             
//                third = second;
//                second = num;
//            } else if (num > third && num < second) {
//          
//                third = num;
//            }
//        }
//
//   
//        if (second == Integer.MIN_VALUE) {
//            System.out.println("Second largest element does not exist.");
//        } else {
//            System.out.println("Second largest element: " + second);
//        }
//
//        if (third == Integer.MIN_VALUE) {
//            System.out.println("Third largest element does not exist.");
//        } else {
//            System.out.println("Third largest element: " + third);
//        }
//    }
//
//}


























//	  public static void main(String[] args) {
//	   
//	        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//	        int target = 7;
//	        findPairs(arr, target);
//	    }
//	    private static void findPairs(int[] arr, int target) {
//	        for (int i = 0; i < arr.length; i++) {
//	            for (int j = i + 1; j < arr.length; j++) {
//	                if (arr[i] + arr[j] == target) {
//	                    System.out.println("(" + arr[i] + ", " + arr[j] + ")");
//	                }
//	
//	            
//	            
//	            
//	            }
//	            
//	        
//	        }
// }
//	}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	 public static void main(String[] args) {
//	     
//		 for (;;) {
//			 System.out.println("Loop");
//
//	        }
//	    }
//	}
  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//
//
//
//        System.out.println("***** BLOOD TYPE DISTRIBUTION *****");
//        
//        int bloodGroupCode =1 ; 
//        
//
//        if (bloodGroupCode >= 37 && bloodGroupCode <= 40) {
//                System.out.println("Blood Group: O");
//            } else if (bloodGroupCode >= 27 && bloodGroupCode <= 30) {
//                System.out.println("Blood Group: A+");
//            } else if (bloodGroupCode >= 20 && bloodGroupCode <= 23) {
//                System.out.println("Blood Group: B+");
//            } else if (bloodGroupCode >= 3 && bloodGroupCode <= 5) {
//                System.out.println("Blood Group: AB+");
//            }
//            else if (bloodGroupCode >= 2 && bloodGroupCode <= 3) {
//                System.out.println("Blood Group: O-");
//            }
//            else if (bloodGroupCode >= 1 && bloodGroupCode <= 2) {
//                System.out.println("Blood Group: A+");
//            }
//            else if ( bloodGroupCode >= -1) {
//                System.out.println("Blood Group: AB+");
//            }
//        else {
//            System.out.println("Invalid Blood Group Code");
//        }
//    }
//}
//		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		

//		try {
//            
//            int result = 10 / 0; 
//            String text = null;
//            System.out.println(text.length()); 
//            
//        } catch (ArithmeticException e) {
//        
//         System.out.println("Caught ArithmeticException: " + e.getMessage());
//     }finally {
//            System.out.println("First finally block");
//        } 
//    }
//}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	





















































