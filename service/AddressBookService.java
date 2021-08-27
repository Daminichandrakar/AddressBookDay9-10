package com.bl.service;

import java.util.ArrayList;
import java.util.Scanner;

import com.bl.model.AddressBookModel;

public class AddressBookService {
	static ArrayList<AddressBookModel> addressBookModels = new ArrayList<>();
	public static Scanner scanner = new Scanner(System.in);

	//Add contact to addressbook
	public void createPerson() {
		AddressBookModel addressBookModel = new AddressBookModel();

		System.out.println("Enter Your First Name");
		String firstName = scanner.next();
		System.out.println("Enter Your Last Name");
		String lastName = scanner.next();
		System.out.println("Enter Your city Name");
		String city = scanner.next();
		System.out.println("Enter Your state Name");
		String state = scanner.next();
		System.out.println("Enter Your phone Number");
		int phNo = scanner.nextInt();
		System.out.println("Enter Your zip");
		int zip = scanner.nextInt();
		System.out.println("Enter Your email");
		String email = scanner.next();

		addressBookModel.setFirstName(firstName);
		addressBookModel.setLastName(lastName);
		addressBookModel.setCity(city);
		addressBookModel.setEmail(email);
		addressBookModel.setPhoneNo(phNo);
		addressBookModel.setState(state);
		addressBookModel.setZip(zip);

		addressBookModels.add(addressBookModel);

	}
}
