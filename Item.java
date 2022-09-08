/**
 * Item class for small bag application
 * 
 * @author Jim Farese
 * @version Aug/28/2022
 *Fall 2022
 */


public class Item<T> {
	
	//Instance of items in the Item class
	private T e;
	
	//set e of variable type e
	public void setE(T e) {
		this.e=e;
	} //end setter
	
	//return the current value of e
	public T getE() {
		return e;
		
	} //end getter

} //end Item Class
