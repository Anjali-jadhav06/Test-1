package com.anjali;

class Pizza {

	String pizzabase;
	int price;

	public Pizza() {
		this.pizzabase= "Handtossed";
		this.price = price;
	}
	public void display()
	{
		System.out.println("pizzabase ="+pizzabase);
	}

}
 class ChickenPizza  extends Pizza{

	String topping;
	public ChickenPizza(String pizzabase, int price) {
		super();
	}
	public ChickenPizza() 
	{
		super();
		this.topping ="Chicken Topping";
		this.price= 299;
	}
	
public void display()
{
super.display();
System.out.println("Topping is" + topping + "\nPrice is " + price);
}
}

 class MuttonPizza extends ChickenPizza {

	String flavouredtopping;

	public MuttonPizza(String pizzabase, int price) {
		super(pizzabase, price);
		
	}
	public MuttonPizza() 
	{
		super();
		this.price =499;
		this.flavouredtopping="Mutton Topping";
	}
	public void display()
	{
		super.display();
		System.out.println("Flavouredtopping is "+ " " + flavouredtopping);
	}

}