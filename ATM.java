package com.demo;

import java.io.IOException;

public class ATM extends OptionMenu {
      
	public static void main(String[] args) 
	{
		OptionMenu optionMenu =new OptionMenu();
		
		try {
			
			optionMenu.getLogin();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
