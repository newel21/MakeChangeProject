package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the price of the item: ");
		double itemPrice = sc.nextDouble();
		
		System.out.print("Enter the amount of money: ");
		double money = sc.nextDouble();
	

		if (money < itemPrice) {
			System.out.println("That's not enough.");
		}else if (money == itemPrice) {
			System.out.println("Thank you");
		}else if (money > itemPrice) {	
			double change = money - itemPrice; 
			System.out.println(change);
		}
		
		
		
		sc.close();
		
		
		
		
		

		
	}
	
		
}



