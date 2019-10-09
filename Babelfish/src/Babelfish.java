
public class Babelfish {
//modify file
	String text = "";

	static String PLACEHOLDER = "#";

	public Babelfish(String text) {
		super();
		this.text = text;
	}


	public void print(String newLine) {         

		System.out.println(newLine);

	}

	public String doMethod() {                               

		if (text.length() >= 3) {
			
			
			text = text.substring(0, 3);
			
		} else if (text.length() < 3) {
			

			
			text = text.substring(0, text.length());

			if (text.length() == 1) {
				text = text + PLACEHOLDER + PLACEHOLDER;
			}

			else if (text.length() == 2) {
				text = text + PLACEHOLDER;
			}
			
			else if (text.length()==0) {
				text = PLACEHOLDER + PLACEHOLDER + PLACEHOLDER;
			}
		} 

		return text;
	}

	// ---------------------> 
	
	
	public String doMethod(int numberOfSymbol, char placeholder) {

		char[] text2 = text.toCharArray();

		String newLine = "";

		for (int i = 0; i < text.length(); i++) { // foor loop always will be executed to text,lenght

//			

			if (i < numberOfSymbol) {

				newLine = newLine + text2[i]; // from 1 do text.lenght

			}

			else {

				newLine = newLine + placeholder;
			}

		}

		if (numberOfSymbol > text.length()) {

			for (int i = 0; i < (numberOfSymbol) - (text.length()); i++) {

				newLine = newLine + placeholder;
			}

		}

		return newLine;

	}

	public static void main(String[] args) {

		Babelfish p1 = new Babelfish("tenis");  

	String newLine = p1.doMethod(3,'%');
	p1.print(newLine);
		 newLine = p1.doMethod(5, '#');
		p1.print(newLine);

	}

}
