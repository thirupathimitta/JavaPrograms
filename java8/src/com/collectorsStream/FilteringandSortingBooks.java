package com.collectorsStream;

import java.awt.print.Book;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilteringandSortingBooks {
	/*
	 * Your Task:-
	 *  Filter the books to include only those with a price greater than or equal to $10.
	 *  Sort the filtered books by price in ascending order.
	 *  Display the titles and prices of the sorted books.
	 */
	public static void main(String[] args) {
		
		List<Books> books = Arrays.asList(
			    new Books("The Great Gatsby", "F. Scott Fitzgerald", 12.99),
			    new Books("To Kill a Mockingbird", "Harper Lee", 9.99),
			    new Books("1984 kargil", "George Orwell", 14.99),
			    new Books("Pride and Prejudice", "Jane Austen", 8.99),
			    new Books("The Catcher in the Rye", "J.D. Salinger", 11.99)
			);
		//1st task
		Map<String, Double> filtereddBooks = books.stream().filter(b->b.getPrice()>=10).collect(Collectors.toMap(Books::getTitle,Books::getPrice));
		 System.out.println(filtereddBooks);
		 //2nd Task
		 
		 List<Books> sortedByPrice= books.stream().filter(b->b.getPrice()>=10).sorted((b1,b2)->(int)(b1.getPrice()-b2.getPrice())).collect(Collectors.toList());
		 System.out.println(sortedByPrice);
			/*
			 * // Apply similar logic to sort the sortedBooks map by value (price)
			 * Map<String, Double> sortedByPrice = sortedBooks.entrySet().stream()
			 * .sorted(Map.Entry.comparingByValue()) .collect(Collectors.toMap(
			 * Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, //
			 * Merge function (keep old value) LinkedHashMap::new // Use LinkedHashMap to
			 * preserve order )); System.out.println("Sorted Books by Price: " +
			 * sortedByPrice);
			 */
		 
		 //3rd task
		 sortedByPrice.forEach(book -> 
         System.out.println("Title: " + book.getTitle() + ", Price: $" + book.getPrice()));
	}

}

class Books {
    private String title;
    private String author;
    private double price;

    public Books(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

	@Override
	public String toString() {
		return "Books [title=" + title + ", author=" + author + ", price=" + price + "]";
	}
    
}
