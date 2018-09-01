package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the price of the item: ");
		double itemPrice = sc.nextDouble();

		System.out.print("Enter the amount of money: ");
		double money = sc.nextDouble();

		sc.close();

		if (money < itemPrice) {
			System.out.println("That's not enough.");
		} else if (money == itemPrice) {
			System.out.println("Thank you");
		}
		
		double change = money - itemPrice;
		//System.out.println(change);
		int hundred, fifty, twenty, ten, five, one, 
		quarter, dime, nickel, penny;
		
		hundred = (int)(change / 100.0);
		change -= hundred * 100.0;
		System.out.println("$100   :" + hundred);
		
		fifty = (int)(change / 50.0);
		change -= fifty * 50.0;
		System.out.println("$50   :" + fifty);
		
        twenty = (int)(change / 20.0);
        change -= twenty * 20.0;
        System.out.println("$20   :" + twenty);
        
        ten = (int)(change / 10.0);
        change -= ten * 10.0;
        System.out.println("$10   :" + ten);
        
        five = (int)(change / 5.0);
        change -= five * 5.0;
        System.out.println("$5   :" + five);
           
        one = (int)(change / 1.0);
        change -= one * 1.0;
        System.out.println("$1   :" + one);
        
        quarter = (int)(change / 0.25);
        change -= quarter * 0.25;
        System.out.println("$0.25   :" + quarter);
        
        dime = (int)(change / 0.10);
        change -= dime * 0.10;
        System.out.println("$0.10   :" + dime);
        
        nickel = (int)(change / 0.05);
        change -= nickel * 0.05;
        System.out.println("$0.05   :" + nickel);
        
        penny = (int)(change / 0.01);
        change -= penny * 0.01;
        System.out.println("$0.01   :" + penny);


	}

}
