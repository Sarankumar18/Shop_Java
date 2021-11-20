package com.shop.new_;

import java.util.Dictionary;
import java.util.Hashtable;
import java.util.Scanner;

public class Admin {


	public void adminopt(Scanner input) {
		// TODO Auto-generated method stub
		//System.out.println("Show admin content here..");
		String list[];int price[] ;
		list= new String[]{"Grapes","Apple","Orange",};
		price = new int[] {60,150,100,};
		int len_list = list.length;
		int len_price = price.length;
		
		int i= 0;
		
		do {
			System.out.println("Choose the Options \n" + "1. List Items and Stocks\n"+ "2. Add Items\n"+ "3. Modify Items\n" + "4. Delete Items\n"+ "5. Exit");
			System.out.println("Enter the Options: ");
			i = input.nextInt();
			
			if(i ==1) {
				
				System.out.println("Item no \t Item \t\tPrice(Kg)");
				for(int j =1;j<= len_list;j++) {
					System.out.println(j+"\t\t" + list[j-1] + "\t\tRs." + price[j-1]);
				}
			}
			else if(i ==2) {
				int item_price;
				
				System.out.println("Enter Item Name: ");
				String item_name = input.nextLine();
				System.out.println("Enter Item Price: ");
				item_price = input.nextInt();
				
				list[len_list] = item_name;
				price[len_price] = item_price;
				
				
				
			}
			
		}
		while(i != 5) ;	
		
	}


}
