package Notepad;

interface INotepad {
	void addText(int pageNumber, String text);
	void addTextRemovePrevious(int pageNumber, String text);
	void erase(int pageNumber);
	void printAllPages();
}
