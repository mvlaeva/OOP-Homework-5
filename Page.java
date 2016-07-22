package Notepad;

class Page {
	private String title;
	private String text;

	// -----------------------------------------------------------------------------------
	Page() {
		this.title = "";
		this.text = "";
	}

	Page(String title, String text) {
		setText(text);
		setTitle(title);
	}
	// -----------------------------------------------------------------------------------

	boolean searchWord(String word) {
		return (this.text.contains(word));
	}

	boolean containsDigits() {
		char[] result = this.text.toCharArray();
		for (int index = 0; index < result.length; ++index)
			if ((int) result[index] >= '0' && (int) result[index] <= '9')
				return true;
		return false;
	}

	void addText(String text) {
		try {
			if (this.text.equals("")) {
				setText(text);
				return;
			}
			setText(this.text + " " + text);

		} catch (NullPointerException err) {
			System.err.println("Error! Trying to add null string as text.");
			setText("");
		}
	}

	void removeText() {
		this.text = "";
	}

	String view() {
		try {
			return ("-----------------------------------------------------------------------\n" + this.title + "\n\n\n"
					+ this.text + "\n-----------------------------------------------------------------------");

		} catch (NullPointerException err) {
			System.err.println("Error! The page doesn't exist!");
			return "";
		}
	}

	boolean hasTitle() {
		return this.title.trim().length() > 0;
	}

	void removeTitle() {
		this.title = "";
	}

	// -----------------------------------------------------------------------------------

	void setTitle(String title) {
		try {
			if (this.title.length() > 0) {
				this.title = this.title + title;
				return;
			}
			this.title = title;

		} catch (NullPointerException err) {
			System.err.println("Invalid title!");
		}
	}

	void setText(String text) {
		try {
			this.text = text;
		} catch (NullPointerException err) {
			System.err.println("Invalid text!");
		}

	}
}
