package Notepad;

import java.util.Scanner;

class SecuredNotepad extends SimpleNotepad implements ISecure {
	private String password;

	SecuredNotepad() {
		super();
		createPassword();
	}

	SecuredNotepad(int numberOfPages) {
		super(numberOfPages);
		createPassword();
	}

	static boolean isSecure(String password) {
		boolean hasLowerCase = false;
		boolean hasUpperCase = false;
		boolean hasDigit = false;
		if (password.length() < 5)
			return false;
		for (int index = 0; index < password.length(); ++index) {
			if ((int) password.charAt(index) >= 'a' && (int) password.charAt(index) <= 'z')
				hasLowerCase = true;
			if ((int) password.charAt(index) >= 'A' && (int) password.charAt(index) <= 'Z')
				hasUpperCase = true;
			if ((int) password.charAt(index) >= '0' && (int) password.charAt(index) <= '9')
				hasDigit = true;
		}
		if (hasLowerCase == true && hasUpperCase == true && hasDigit == true)
			return true;
		return false;
	}

	@SuppressWarnings("resource")
	@Override
	public void createPassword() {
		System.out.print("Enter password: ");
		String password = "";
		do {
			password = new Scanner(System.in).nextLine();
			if (!(isSecure(password)))
				System.out.println(
						"Your password must contain more than 5 characters, at least one upper case letter, at least one lower case letter and at least one digit. \nEnter password: ");
		} while (!(isSecure(password)));
		setPassword(password);
	}

	@SuppressWarnings("resource")
	@Override
	public boolean enterPassword() {
		String password = "";
		System.out.print("Enter password: ");
		do {
			password = new Scanner(System.in).nextLine();
			if (!(this.password.equals(password)))
				System.out.println("Invalid password! Try again or enter 'Q' to quit.");
		} while (!(password.equals(this.password)) || (password.toLowerCase().equals('q')));
		return this.password.equals(password);
	}

	@Override
	public void addText(int pageNumber, String text) {
		if (enterPassword() == true)
			super.addText(pageNumber, text);
	}

	@Override
	public void addText(int pageNumber, String title, String text) {
		if (enterPassword() == true)
			super.addText(pageNumber, title, text);
	}

	@Override
	public void addTextRemovePrevious(int pageNumber, String text) {
		if (enterPassword() == true)
			super.addTextRemovePrevious(pageNumber, text);
	}

	@Override
	public void addTextRemovePrevious(int pageNumber, String title, String text) {
		if (enterPassword() == true)
			super.addTextRemovePrevious(pageNumber, title, text);
	}

	@Override
	public void erase(int pageNumber) {
		if (enterPassword() == true)
			super.erase(pageNumber);
	}

	@Override
	public void printAllPages() {
		if (enterPassword() == true)
			super.printAllPages();
	}

	void setPassword(String password) {
		if (password.trim().length() > 0)
			this.password = password;
		else {
			System.out.println("Invalid input.");
			createPassword();
		}
	}

}
