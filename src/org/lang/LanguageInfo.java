package org.lang;

public class LanguageInfo extends StateDetails{
	
	private void tamilLanguage() {
System.out.println("Enter Tamil Language: First Language");
	}
	private void englishLanguge() {
System.out.println("Enter English Language: Second Language");
	}
	private void hindiLanguge() {
System.out.println("Enter Hindi Language: Optionl Language");
	}
	public static void main(String[] args) {
		LanguageInfo l = new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguge();
		l.hindiLanguge();
		l.southIndia();
		l.northIndian();
	}
}
