package com.wrapperClass;



public class test {

	
	
    public static void main(String[] args) {
        // Check if command-line arguments are provided
        if (args.length > 0) {
            
                // Convert command-line arguments into an array of integers
                int[] inputArray = new int[args.length];
                for (int i = 0; i < args.length; i++) {
                    inputArray[i] = Integer.parseInt(args[i]);
                }

                // Print the input array
                System.out.println("Input Array:");
                for (int num : inputArray) {
                    System.out.println(num);
                }
            
        
    }
	}


}

