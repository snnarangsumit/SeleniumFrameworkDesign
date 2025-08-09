package JavaCodes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class countVowels {
	 public static void main(String[] args) throws IOException {
	        String line = "sidharth";
	        int vowels = 0;
	        line = line.toLowerCase();
	        for (int i = 0; i < line.length(); ++i) {
	            char ch = line.charAt(i);
	            if (ch == 'a' || ch == 'e' || ch == 'i'
	                    || ch == 'o' || ch == 'u') {
	               vowels++;
	            }

	        }
	        System.out.println("Vowels: " + vowels);
	    }
	 public static String readFileAsString() {
	        String text = "";
	        try {
	            text = new String(Files.readAllBytes(Paths.get("/home/nikhil/IdeaProjects/Assignments/5.String/input.txt")));
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        String a = text;
	        return text;
	    }

}
