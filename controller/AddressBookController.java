package com.bl.controller;

import java.util.Scanner;

import com.bl.service.AddressBookService;

public class AddressBookController {

	public static void main(String[] args) {

		AddressBookService addressBookService = new AddressBookService();
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		final int EXIT_VALUE = 3;
		while(choice != EXIT_VALUE) {
			System.out.println("1.Add Person\n2.Update Person\n"+EXIT_VALUE+".Exit");
			choice = scanner.nextInt();
			switch (choice) {
			case 1:
				addressBookService.createPerson();
				addressBookService.print();
				break;
			case 2:
				System.out.println("Enter name of person to Update");
				String name = scanner.next();
				addressBookService.updatePerson(name);
				addressBookService.print();
				break;
			case EXIT_VALUE :
				System.out.println("Exit");
				break;
	        default:
	        	System.out.println("Enter valid value");
	        	break;
			}
		}
		
	}
}