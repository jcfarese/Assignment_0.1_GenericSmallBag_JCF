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
	
	//sets item of variable T
	public void setItem(T item) {
		this.item=item;
	} //end setItem
	
	/**
	 * return the current value of item
	 * @return item
	 */
	public T getItem() {
		return item;
	} //end getItem
	
} //end SmallBag class
