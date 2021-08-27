package com.bl.controller;
import com.bl.service.AddressBookService;

public class AddressBookController {
	
       public static void main(String[] args) {
    	   AddressBookService addressBookService = new AddressBookService();
    	   addressBookService.createPerson(); 
	}
}
