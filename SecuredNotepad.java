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

	@SuppressWarnings("resource")
	@Override
	public void createPassword() {
		System.out.print("Enter password: ");
		setPassword(new Scanner(System.in).nextLine());
	}

	void setPassword(String password) {
		if (password.trim().length() > 0)
			this.password = password;
		else {
			System.out.println("Invalid input.");
			createPassword();
		}
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

}
