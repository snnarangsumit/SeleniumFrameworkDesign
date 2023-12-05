package JavaCodes;
public class CoreJavaBrushUp3_String {
	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// String is an object that represent sequence of characters
		// String literal
		// New operator
		
		
		/*
		 In Java, a String is a sequence of characters that is 
		 widely used to represent text. It is one of the most commonly
		 used classes in Java, and it is part of the java.lang package, 
		 which is automatically imported in every Java program.
		 */
		
		
	    String s1 = "Rahul Shetty Academy";

		String s5 = "hello";


		//new
		String s2 = new String("Welcome");
		String s3 = new String("Welcome");


		String s = "Rahul Shetty Academy";
		String[] splittedString = s.split("Shetty");

		
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());

		
		
		// Print charter in reverse order
		//length method
		//charAt
		
		
		for(int i =s.length()-1;i>=0;i--)
		{

		System.out.println(s.charAt(i));

		}
		
		
		String myString = "Hello, Java!";
		String firstName = "John";
		String lastName = "Doe";
		String fullName = firstName + " " + lastName;
		
		
		String text = "Java Programming";
		int length = text.length();
		
		
		//Java provides numerous methods for manipulating strings, such as charAt(), 
		//substring(), toUpperCase(), toLowerCase(), equals(),
		//startsWith(), endsWith(), etc.
		String example = "Hello, World!";
		char firstChar = example.charAt(0);
		String subString = example.substring(7);
		boolean isEqual = example.equals("Hello, World!");
		
		//Strings in Java are immutable, meaning that their values cannot be changed once they are created.
		//Operations on strings usually result in the creation of a new string.
		
		String original = "Hello";
		String modified = original.concat(", Java!"); // Creates a new string
		
		
		//String Pool: Java maintains a "string pool" for literal stringsStrings 
		//declared with double quotes are automatically added to the pool.

		String str1 = "hello";
		String str2 = "hello"; // This will reuse the existing string from the pool
		
		
		//StringBuilder and StringBuffer:
		
		//For mutable string operations, StringBuilder and StringBuffer classes are available. 
		//These classes provide methods for efficient string manipulation.
		
		StringBuilder stringBuilder = new StringBuilder("Hello");
		stringBuilder.append(", Java!");
		String result = stringBuilder.toString();
		
		
		//Escape Sequences:
		//Strings can contain escape sequences to 
		//represent special characters, such as newline (\n), tab (\t), etc.
		
		
		String multilineString = "Line 1\nLine 2\nLine 3";
		}


		}

