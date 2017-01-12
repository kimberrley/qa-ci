/* Title: Library
 * 
 */

package library;

import java.util.ArrayList;

public class Library {
	
	private ArrayList<Items> items = new ArrayList<>();
	
	
	
	public ArrayList<Items> getItems() {
		return items;
	}



	public void setItems(ArrayList<Items> items) {
		this.items = items;
	}



	public void addItem(String author, String title, int year, int edition, String publisher, long ISBN, int pages) {
		
	}

}
