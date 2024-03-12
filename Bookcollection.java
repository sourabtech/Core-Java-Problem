package LabProgram;



	import java.util.Scanner;
	public class Bookcollection {
			String title;
			String author;
			String isbn;
	    public Bookcollection(String title, String author, String isbn) {  // USING Constructor
	        this.title = title;
	        this.author = author;    // .this is used here for the ---> refrence of a current class variable
	        this.isbn = isbn;
	    }    
	    public String getTitle() {     // Getter methods
	        return title;
	    }
	    public String getAuthor() {
	        return author;
	    }
	    public String getIsbn() {
	        return isbn;
	    }
	    public static void addBook(Bookcollection[] collection, Bookcollection book, int index) {       // Method for add  book 
	        collection[index] = book;
	        System.out.println("Book added: " + book.getTitle());
	    }

	        public static void removeBook(Bookcollection[] collection, String isbn, int index) {     // Method for remove  book 

	        for (int i = 0; i < index; i++) {
	            if (collection[i].getIsbn().equals(isbn)) {
	                System.out.println("Book removed: " + collection[i].getTitle());
	                
	               // effectively removes the book with the specified ISBN from the collection.
	                for (int j = i; j < index - 1; j++) {          // Shift elements to the left to fill the gap
	                    collection[j] = collection[j + 1];
	                }
	                collection[index - 1] = null; 
	                return;
	            }
	        }
	        System.out.println("Book with ISBN " + isbn + " not found.");
	    }
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Bookcollection[] collection = new Bookcollection[10];      // Create  array to store books
	        int bookCount = 0; 					//  track  No of books in the collection
	   
	        while (true) {
	            System.out.println("\nMenu:");
	            System.out.println("1. Add a book");
	            System.out.println("2. Remove a book");
	            System.out.println("3. Exit");
	            System.out.print("Enter your choice: ");
	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    if (bookCount < collection.length) {
	                        scanner.nextLine();                    // Consume newline character
	                        System.out.print("Enter book title: ");
	                        String title = scanner.nextLine();
	                        System.out.print("Enter author name: ");
	                        String author = scanner.nextLine();
	                        System.out.print("Enter ISBN: ");
	                        String isbn = scanner.nextLine();
	                        addBook(collection, new Bookcollection(title, author, isbn), bookCount++);
	                    } else {
	                        System.out.println("The collection is full. Cannot add more books.");
	                    }
	                    break;
	                case 2:
	                    scanner.nextLine(); 
	                    System.out.print("Enter ISBN of the book to remove: ");
	                    String isbnToRemove = scanner.nextLine();
	                    removeBook(collection, isbnToRemove, bookCount--);
	                    break;
	                case 3:
	                    System.out.println("Exiting...");
	                    scanner.close();
	                    System.exit(0);
	                default:
	                    System.out.println("Invalid choice. Please enter a number from the menu.");
	            }
	        }
	    }
	}

	
