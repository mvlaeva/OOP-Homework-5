package Notepad;

class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {
	private boolean isStarted;

	ElectronicSecuredNotepad() {
		super();
		this.isStarted = false;
	}

	ElectronicSecuredNotepad(int numberOfPages) {
		super(numberOfPages);
		this.isStarted = false;
	}

	@Override
	public void start() {
		System.out.println("Starting device..");
		this.isStarted = true;
	}

	@Override
	public void stop() {
		System.out.println("Shutting down device..");
		this.isStarted = false;

	}

	@Override
	public boolean isStarted() {
		return this.isStarted;
	}

	// -----------------------------------------------------------------------------------

	@Override
	public void addText(int pageNumber, String text) {
		if (isStarted == true)
			super.addText(pageNumber, text);
	}

	@Override
	public void addText(int pageNumber, String title, String text) {
		if (isStarted == true)
			super.addText(pageNumber, title, text);
	}

	@Override
	public void addTextRemovePrevious(int pageNumber, String text) {
		if (isStarted == true)
			super.addTextRemovePrevious(pageNumber, text);
	}

	@Override
	public void addTextRemovePrevious(int pageNumber, String title, String text) {
		if (isStarted == true)
			super.addTextRemovePrevious(pageNumber, title, text);
	}

	@Override
	public void printAllPages() {
		if (isStarted == true)
			super.printAllPages();
	}

	@Override
	public boolean searchWord(String word) {
		if (isStarted == true)
			return super.searchWord(word);
		return false;
	}

	@Override
	public void printAllPagesWithDigits() {
		if (isStarted == true)
			super.printAllPagesWithDigits();
	}

	@Override
	public void erase(int pageNumber) {
		if (isStarted == true)
			super.erase(pageNumber);
	}

	@Override
	public boolean enterPassword() {
		if (isStarted == true)
			return super.enterPassword();
		else
			return false;
	}

	@Override
	void eraseAll() {
		if (isStarted == true)
			super.eraseAll();
	}

}
