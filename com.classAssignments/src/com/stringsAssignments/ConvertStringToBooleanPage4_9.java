package com.stringsAssignments;

public class ConvertStringToBooleanPage4_9 {

	
    		public static void main(String args[])
    		{

    			String str = "yes";

    			System.out.println(stringToBoolean(str));

    			str = "true";

    			System.out.println(stringToBoolean(str));

    			str = "false";

    			System.out.println(stringToBoolean(str));
    		}
	    		public static boolean stringToBoolean(String str)
	    		{

	    		
	    			boolean b1 = Boolean.parseBoolean(str);

	    			return b1;
	    		}

	    		
	    	

	    	
	    

}
