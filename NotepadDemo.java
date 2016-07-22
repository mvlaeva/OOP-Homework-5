package Notepad;

class NotepadDemo {
	public static void main(String[] args) {
		// SimpleNotepad mine = new SimpleNotepad();
		// mine.addText(15, "ala bala nqqqkav si text");
		// mine.printAllPages();
		// mine.addText(15, "dobavqm i zaglavie", "na ti oshte");
		// mine.printAllPages();
		// mine.erase(15);
		// mine.addText(1, "duru buru 100 chadura");
		// mine.printAllPages();
		// mine.addTextRemovePrevious(1, "lqlallelql");
		// mine.addText(25, "a sega");
		// mine.addText(26, "ko sta");
		// mine.printAllPages();
		// mine.eraseAll();

		// SecuredNotepad u = new SecuredNotepad();
		// u.addText(14, "ala bala");
		// u.addText(14, "mulchanieto na agnetata", "oshte malko text");
		// u.printAllPages();
		// u.addText(1, "", "sure");
		// u.addText(1, "not empty anymore", "");
		// u.printAllPages();

		// Page one = new Page();
		// one.addText("adf sdfsdffss cat horse");
		// System.out.println(one.containsDigits());
		// System.out.println(one.searchWord("cat"));

		ElectronicSecuredNotepad me = new ElectronicSecuredNotepad();
		me.start();
		me.addText(43, "3+5 = 8 \n alalanfdhskald\n :P");
		me.addText(12, "asefesf", "sdffsdfs");
		me.printAllPages();
		me.erase(12);
		me.printAllPagesWithDigits();
		me.searchWord("3+5");

	}
}
