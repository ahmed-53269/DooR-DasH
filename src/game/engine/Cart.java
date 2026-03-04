package guc.supermarket.cart;
import guc.supermarket.products.*;

import java.util.*;
public class Cart {
private ArrayList<GroceryProduct> products;
public Cart(){
products = new ArrayList<>();	
}
public void addProduct(GroceryProduct p){
	products.add(p);
}
public double getTotal(){
	double price = 0 ;
	for (int i = 0 ; i < products.size() ; i ++)
		price += products.get(i).getActualPrice();
	return price;
}
public String toString(){
	String s = "";
	for (int i = 0 ; i < products.size() ; i ++)
	if (i < products.size() - 1)
		s += products.get(i) + "\n" + "——————————" + "\n";
	else s += products.get(i) ;
	return s;
}
public static void main(String [] args){
	Cart c = new Cart();
	c.addProduct(new Beverage("Coke Zero" , 10.25 , 20 , SugarLevel.ADDED_SUGAR));
	c.addProduct(new DairyProduct("Milk" , 150.5 , 45 , Fat.SKIMMED));
	System.out.println(Fat.SKIMMED);
	System.out.print(c);
	
}
}
