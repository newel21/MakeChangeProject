package com.skilldistillery.makechange;

import java.util.Scanner;

public class MakeChangeApp {

	public static void main(String[] args) {
		
		//#### 1 see README.md
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the price of the item: ");
		double itemPrice = sc.nextDouble();

		System.out.print("Enter the amount of money: ");
		double money = sc.nextDouble();

		sc.close();
		
		// #### 2 see README.md
		if (money < itemPrice) {
			System.out.println("Insufficient funds. Please try again");
		} else if (money == itemPrice) {
			System.out.println("Exact amount received. No change is required.");
		}
		
		double change = money - itemPrice;
		if (money > itemPrice) {
			System.out.println("Your change will be: ");
			//System.out.println(change);
		}
		
		int hundred, fifty, twenty, ten, five, one, quarter, dime, nickel, penny;
		
		hundred = (int)(change / 100.0);
		change -= hundred * 100.0;
		if (hundred == 1) {
			System.out.println(hundred + " one hundred dollar bill");
		}else if (hundred > 1) {
			System.out.println(hundred + " one hundred dollar bills");
		}else if (hundred == 0) {
			//System.out.println();
		}
		
		fifty = (int)(change / 50.0);
		change -= fifty * 50.0;
		if (fifty == 1) {
			System.out.println(fifty + " fifty dollar bill");
		}else if (fifty > 1) {
			System.out.println(fifty + " fifty dollar bills");
		}else if (fifty == 0) {
			//System.out.println();
		}
		
        twenty = (int)(change / 20.0);
        change -= twenty * 20.0;
        if (twenty == 1) {
        	System.out.println(twenty + " twenty dollar bill");
        }else if (twenty > 1) {
        	System.out.println(twenty + " twenty dollar bills");
        }else if ( twenty == 0) {
        	//System.out.println();
        }
        
        ten = (int)(change / 10.0);
        change -= ten * 10.0;
        if (ten == 1 ) {
        	System.out.println(ten + " ten dollar bill");
        }else if (ten > 1) {
        	System.out.println(ten + " ten dollar bills");
        }else if ( ten == 0) {
        	//System.out.println();
        }
        
        five = (int)(change / 5.0);
        change -= five * 5.0;
        if (five == 1) {
        	System.out.println(five + " five dollar bill");
        }else if (five > 1) {
        	System.out.println(five + " five dollar bills");
        }else if (five == 0) {
        	//System.out.println();
        }
           
        one = (int)(change / 1.0);
        change -= one * 1.0;
        if ( one == 1) {
        	System.out.println(one + " one dollar bill");
        }else if (one > 1) {
        	System.out.println(one + " one dollar bills");
        }else if ( one == 0) {
        	//System.out.println();
        }
        
        quarter = (int)(change / 0.25);
        change -= quarter * 0.25;
        if (quarter == 1) {
        	System.out.println(quarter + " quarter");
        }else if (quarter > 1) {
        	System.out.println(quarter + " quarters");
        }else if (quarter == 0) {
        	//System.out.println();
        }
        
        dime = (int)(change / 0.10);
        change -= dime * 0.10;
        if (dime == 1) {
        	System.out.println(dime + " dime");
        }else if (dime > 1) {
        	System.out.println(dime + " dimes");
        }else if (dime == 0) {
        	//System.out.println();
        }
        
        nickel = (int)(change / 0.05);
        change -= nickel * 0.05;
        if (nickel == 1 ) {
        	System.out.println(nickel + " nickel");
        }else if (nickel > 1) {
        	System.out.println(nickel + " nickels");    	
        }else if (nickel == 0) {
        	//System.out.println();
        }
        
        change = Math.round(change * 100.0) /100.0;
        penny = (int)(change / 0.01);
        change -= penny * 0.01;
        if (penny == 1) {
        	System.out.println(penny + " penny");
        }else if (penny > 1) {
        	System.out.println(penny + " pennies");    	
        }else if (penny == 0) {
        	//System.out.println();
        }
      

	}
}
