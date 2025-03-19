package Practice;

public class StringOperations {

	String str = "Hello, World! ";
	String str1 = " \n\b ";
	String str2 = "The World is better place to live";
	String str3 = "Apple,Banana,Orange,Pomegranate"; 
	String str4 = "http://fmcg.sanfmcg.com/";
	
	public void Operations() {

		//Length
		System.out.println("Length: "+str.length());
		
		//Character Extraction
		System.out.println("Character at Index 2: "+str.charAt(2));  
				
		//Concatenation
		System.out.println("Concatenation: "+str.concat("Joseph"));
		
		//Case Conversion
		System.out.println("Uppercase: "+str.toUpperCase());
		System.out.println("Lowercase: "+str.toLowerCase());
		
		//Trimming
		System.out.println("Trim:"+str.trim());
		System.out.println("Without Trim:"+str);
		
		//If Empty or Blank  Empty means with no space
		System.out.println("Is Empty: "+str1.isEmpty());
		System.out.println("Is Blank: "+str1.isBlank());
		System.out.println(str.isBlank());
		
		//Comparison**
		System.out.println("Equals: "+str.equals(" Hello, World! "));
		System.out.println("EqualsIgnoreCase: "+str.equalsIgnoreCase(" hello, World! "));
		System.out.println("CompareTo: "+str.compareTo("Hello, World!"));
		
        // Searching
		System.out.println("First Index of o" +str.indexOf("o"));
		System.out.println("Last Index of o" +str.lastIndexOf("o"));
        System.out.println("Starts with " + str.startsWith(" Hello"));
        System.out.println("Ends with " + str.endsWith("World! "));
        
        // Replacement
        System.out.println("Replace Word: "+str.replace("World","Java"));
        System.out.println("Replace letter: "+str.replace("o", "J"));
        
		// Substring
        System.out.println("Substring of index and end-1: "+str.substring(2, 10));
        System.out.println("Substring of index: "+str.substring(2));
        
        
        // Splitting
		
		//  String[] array = str4.split("\\."); 
		  String[] array = str2.split("o"); 
		  for (String i: array)
		  System.out.println(i);
		 
		
		
		
		
	}
	
	
	public static void main(String[] args) {

		StringOperations S = new StringOperations();
		S.Operations();
	}

}
