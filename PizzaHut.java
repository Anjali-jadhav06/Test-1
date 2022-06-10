package com.anjali;

import java.util.Scanner;

public class PizzaHut {

	public static void main(String[] args) {
	Pizza pi = new Pizza();
	ChickenPizza cp = new ChickenPizza();
	MuttonPizza mp = new MuttonPizza();
	int ch;
	do {
		Scanner sc= new Scanner(System.in);
	System.out.println("Price of Chicken Pizza: Rs 299 and Mutton Pizza: Rs 499");
	System.out.println("Please select choice \n 1. Chicken Pizza \n 2. Mutton Pizza:");
	ch =sc.nextInt();
	switch(ch)
	{
	case 1:
	{
		System.out.println("For CHICKEN PIZZA");
		cp.display();
		break;
	}
	case 2:
	{

		System.out.println("For MUTTON PIZZA");
		mp.display();
		break;
	}
	default:
	{
		System.out.println("Wrong input!");
		break;
	}
	}
	}while(ch>3);
	}
	
}