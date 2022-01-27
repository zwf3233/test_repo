import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FindPalindromes
{
	public static void main(String args[]) throws IOException {
		
		MyStack<Character> stack = new MyStack<Character>();
		File text = new File("wordList.txt");
		BufferedReader reader = new BufferedReader(new FileReader(text));
		String line;
		while ((line = reader.readLine()) != null) {

			String letters = line.toLowerCase().replaceAll("[\\W]", "");
			
			 
			for (int i =0; i < letters.length(); i++) {
			  stack.push(letters.charAt(i));
			}

			String reverse = "";
			
			while (!stack.isEmpty())
				reverse += stack.pop();
			
			if (letters.equals(reverse))
				System.out.println('"' + line + '"' + " is a palindrome.");
		}
		reader.close();
	}
}