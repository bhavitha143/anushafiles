

// remove special charecters and symbols in given string


public class RemoveSpecialSymbols {
public static void main(String[] args) {
	
	
	String str= "@#!$%ANUSHA&*^%$#@()ISGOODGIRL*&(";
	
	String str1="anusha is good girl 28 years";
	
	//we want to remove  special characters in string we have to use REGEX EXPRESSION
	
	// REGEX EXPRESSION  must declare in  squarebrackets [a-zA-Z0-9] 
	
	String s=str.replaceAll("[^a-zA-Z0-9]",""); // if you give space with in double quotes then it print output with space
	System.out.println(s);
	
	
	// if you remove numbers use below regexpression 
	
	String s2 =str1.replaceAll("[0-9]", "");
	System.out.println(s2);
	
	//remove spaces from givenstring 
	
	String s3 =str1.replaceAll("\\s+", "");
	System.out.println(s3);
}
}
