package com.shop.new_;
import com.shop.new_.*;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		welcome(input);
	}
	
	
	static void welcome(Scanner input){
		
		     int i= 0;
			System.out.println("Choose the way of login \n" + "1. Admin \n"+ "2. Customer");
			System.out.println("Enter the value: ");
			i = input.nextInt();
			do {
				if(i == 1) {
					admin(input);
					System.exit(1);
				}
				else if(i ==2){
					customer(input);
					System.exit(1);
				}
				else {
					System.out.println("Entered wrong value.. Enter Again:");
					i = input.nextInt();
				}
			}
			while(i != 1 ||  i !=2 ) ;	
			
	}
	
	static void admin(Scanner input) {
		int id_default = 123, pass_default = 345,id,pass;
		do {
			System.out.println("Enter Admin Id: ");
			 id = input.nextInt();
			System.out.println("Enter Password: ");
			pass = input.nextInt();
			if(id != id_default || pass != pass_default) {
				System.out.println("Wrong Credentials, Please try again...");
			}
			else {
				//Admin content here
				Admin ad = new Admin();
				ad.adminopt(input);
			}
		}
		while( id_default != id || pass_default != pass) ;
		
	}
	
	static void customer(Scanner input) {
		
		int id_default = 123, pass_default = 345,id,pass;
		
		do {
			System.out.println("Enter Customer Id: ");
			 id = input.nextInt();
			System.out.println("Enter Pass Id: ");
			pass = input.nextInt();
			if(id != id_default || pass != pass_default) {
				System.out.println("Wrong Credentials, Please try again...");
			}
			else {
				//Customer content add here
				System.out.println("Show Customer content here");
			}
		}
		while( id_default != id || pass_default != pass) ;
	}
			
			
			
		

}
