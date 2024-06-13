package com.anudip.springdemo;

/*object ? tea and coffee
  	injection of tea and coffee is possible by
	constructor way
	setter way*/

public class Restaurant {

	HotDrink hotDrink;
	String welcomeNote;

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public Restaurant(HotDrink hotDrink)
	{
		this.hotDrink=hotDrink;
	}
	
	void prepareDrink()
	{
		hotDrink.prepareHotDrink();
	}
	
	void greetCustomer()
	{
		System.out.println(welcomeNote);
	}

	public void greetCustomer1() {
		// TODO Auto-generated method stub
		
	}
}
