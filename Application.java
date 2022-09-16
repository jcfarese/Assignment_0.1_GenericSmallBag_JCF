/**
 * The executable application for the Item and SmallBag class
 * 
 * @author Jim Farese
 * @version Aug/28/2022
 *Fall 2022
 */

public class Application {
	
	//main method
	public static void main(String[] args) {
		
	//new instance of item 	
	Item<String> itemString=new Item<String>();
	itemString.setE("Jim");
	
	//new instance of item
	Item<Integer> itemInteger=new Item<Integer>();
	itemInteger.setE(18);
	
	//new instance of smallbag string and adds the string
	SmallBag<Item> smallBagS=new SmallBag<Item>();
	smallBagS.setItem(itemString);
	
	//print the instance of the string in the small bag
	System.out.println("The string in the small bag is: " + smallBagS.getItem().getE());
	
	//creates an instance of smallbag int and adds an integer
	SmallBag<Item> smallBagI=new SmallBag<Item>();
	smallBagI.setItem(itemInteger);
	
	//print the instance of the integer in the small bag
	System.out.println("The integer in the small bag is: " + smallBagI.getItem().getE());
	
	} //end main method

} //end Application Class
