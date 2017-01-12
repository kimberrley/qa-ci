package libraryTesting;

import static org.junit.Assert.*;
import library.*;

import org.junit.Test;


public class LibraryTest {

	@Test
	public void testAddItemBook() {
		Library library = new Library();
		//add a book test
		//If successful, then Jane Green's book will be added
		library.addItem("Jane Green", "The Beach House", 2011, 1, "Penguin", 1, 448);
		
		assertNotNull("Items is null",library.getItems());
	}
	
	
	@Test
	public void testAddItemNewspaper() {
		Library library = new Library();
		//add a book test
		//If successful, then a newspaper will be added
		library.addItem();
		
		assertNotNull("Items is null",library.getItems());
	}
	
	
	@Test
	public void testAddItemDissertation() {
		Library library = new Library();
		//add a book test
		//If successful, then a dissertation will be added 
		library.addItem();
		
		assertNotNull("Items is null",library.getItems());
	}
	
	
	@Test
	public void testAddItemGovernmentDoc() {
		Library library = new Library();
		//add a book test
		//If successful, then a government doc will be added
		library.addItem();
		
		assertNotNull("Items is null",library.getItems());
	}
	
	
	

}
