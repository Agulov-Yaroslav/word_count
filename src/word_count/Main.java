package word_count;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();
        
        int wordCount = countWords(text);
        
        System.out.println("Количество слов в тексте: " + wordCount);
    }

    public static int countWords(String text) {
    	int wordCount = 1;
    	for(int i = 0; i<text.length(); i++) {
    		
    		
    		if(text.charAt(i) == ' ' ){
    			wordCount++;
    		}
    		
    	}
    	return wordCount;
    }
}