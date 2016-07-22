package Notepad;

/*
 * TODO SEE COMMON LOGIC Ако някъде видите някаква обща логика, изнесете я на централно
място (в отделен метод).
 */

class SimpleNotepad implements INotepad {
	private Page[] pages;

	SimpleNotepad() {
		// бележника по подразбиране ще има 100 страници
		this.pages = new Page[100];
	}

	SimpleNotepad(int howManyPages) {
		// бележник с колкото си искаме страници
		this.pages = new Page[howManyPages];
	}

	@Override
	public boolean searchWord(String word) {
		for (Page page : pages) {
			if (page.searchWord(word) == true)
				return true;
		}
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		for (Page page : pages) {
			if (page.containsDigits() == true)
				page.view();
		}
	}

	@Override
	public void addText(int pageNumber, String text) {
		try {
			pages[pageNumber + 1].addText(text);

		} catch (IndexOutOfBoundsException err) {
			System.err.println("Invalid page number assigned to addText method.");
			return;

		} catch (NullPointerException err) {
			pages[pageNumber + 1] = new Page();
			pages[pageNumber + 1].addText(text);
		}
	}

	public void addText(int pageNumber, String title, String text) {
		try {
			pages[pageNumber + 1].setTitle(title);
			pages[pageNumber + 1].addText(text);

		} catch (IndexOutOfBoundsException err) {
			System.err.println("Invalid page number assigned to addText method.");
			return;

		} catch (NullPointerException err) {
			pages[pageNumber + 1] = new Page();
			pages[pageNumber + 1].setTitle(title);
			pages[pageNumber + 1].addText(text);
		}
	}

	@Override
	public void addTextRemovePrevious(int pageNumber, String text) {
		try {
			pages[pageNumber + 1].removeText();
			pages[pageNumber + 1].addText(text);

			if (this.pages[pageNumber + 1].hasTitle() == true)
				this.pages[pageNumber + 1].removeTitle();

		} catch (IndexOutOfBoundsException err) {
			System.err.println("Invalid page number assigned to addTextRemovePrevious method.");
			return;

		} catch (NullPointerException err) {
			pages[pageNumber + 1] = new Page();
			pages[pageNumber + 1].addText(text);
		}
	}

	public void addTextRemovePrevious(int pageNumber, String title, String text) {
		try {
			pages[pageNumber + 1].removeText();
			pages[pageNumber + 1].addText(text);

			if (this.pages[pageNumber + 1].hasTitle() == true)
				this.pages[pageNumber + 1].removeTitle();

			pages[pageNumber + 1].setTitle(title);

		} catch (IndexOutOfBoundsException err) {
			System.err.println("Invalid page number assigned to addTextRemovePrevious method.");
			return;

		} catch (NullPointerException err) {
			pages[pageNumber + 1] = new Page();
			pages[pageNumber + 1].setTitle(title);
			pages[pageNumber + 1].addText(text);
		}
	}

	@Override
	public void erase(int pageNumber) {
		try {
			pages[pageNumber + 1].removeText();
			pages[pageNumber + 1].removeTitle();
			pages[pageNumber + 1] = null;

		} catch (IndexOutOfBoundsException err) {
			System.err.println("Invalid page number assigned to addTextRemovePrevious method.");
			return;
		}
	}

	@Override
	public void printAllPages() {
		for (int page = 0; page < pages.length; ++page) {
			if (this.pages[page] == null)
				continue;
			if (this.pages[page].view().trim().equals(""))
				continue;
			System.out.println(pages[page].view());
		}
	}

	void eraseAll() {
		for (int page = 0; page < pages.length; ++page) {
			if (this.pages[page] != null) {
				pages[page].removeText();
				pages[page].removeTitle();
				pages[page] = null;
			}
		}
	}

}
