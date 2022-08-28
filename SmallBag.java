/**
 * SmallBag class for small bag application
 * 
 * @author Jim Farese
 * @version Aug/28/2022
 *Fall 2022
 */

public class SmallBag<T> {

	//instance of items in the SmallBag class
	private T item;
	
	public void setItem(T item) {
		this.item=item;
	} //end setter
	
	public T getItem() {
		return item;
	} //end getter
	
} //end class
