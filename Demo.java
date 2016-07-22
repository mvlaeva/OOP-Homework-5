package Notepad;

class Demo {
	public static void main(String[] args) {
		ElectronicSecuredNotepad me = new ElectronicSecuredNotepad();
		me.start();
		me.addText(43, "3+5 = 8 \n alalanfdhskald\n :P");
		me.addText(12, "asefesf", "sdffsdfs");
		me.printAllPages();
		me.erase(12);
		me.printAllPagesWithDigits();
		System.out.println(me.searchWord("3+5"));
	}
}
