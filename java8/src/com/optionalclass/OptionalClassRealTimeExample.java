package com.optionalclass;

import java.util.Optional;

class UserProfile {
    private String name;
    private Optional<String> emailAddress;

    public UserProfile(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = Optional.ofNullable(emailAddress);
    }

    public String getName() {
        return name;
    }

    public Optional<String> getEmailAddress() {
        return emailAddress;
    }
}
public class OptionalClassRealTimeExample {
	
	    public static void main(String[] args) {
	    	
	        UserProfile user1 = new UserProfile("Alice", "alice@example.com");
	        UserProfile user2 = new UserProfile("Bob", null);

	        printEmailAddress(user1);
	        printEmailAddress(user2);
	    }

	    public static void printEmailAddress(UserProfile userProfile) {
	        System.out.println("User: " + userProfile.getName());

	        Optional<String> emailOptional = userProfile.getEmailAddress();
	        if (emailOptional.isPresent()) {
	            System.out.println("Email: " + emailOptional.get());
	        } else {
	            System.out.println("Email not available.");
	        }
	    }
	

}
