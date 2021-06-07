package com.cp.social;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		
		initialize();
		Scanner sc = new Scanner(System.in);
		String nextInput = null;
		while (sc.hasNext()) {

			nextInput = sc.nextLine();

			LoginService.handleUserInput(nextInput,sc);
		}

	}

	

	private static void initialize() {
		// TODO Auto-generated method stub
		new LoginService();

	}

	

	

}
