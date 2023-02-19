package lab01_420;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
public class lab {
public static void main(String[] args) throws FileNotFoundException {
	String theString = " ";//making an empty string variable
	File file = new File("data.txt");//taking the txt file into the program
	Scanner scanner = new Scanner(file);//scanning the file
	theString = scanner.nextLine();//taking text of the file inside the string variable
	while (scanner.hasNextLine()) {//running a loop to take all the text as string inside string variable
	theString = theString + scanner.nextLine();//taking one line after another line
	}
	 Pattern pattern1 = Pattern.compile("([_a-zA-Z][_a-zA-Z]*\\w\\w*)");
	    Matcher matcher1 = pattern1.matcher(theString);
	    String x="";
	    for(int i=0;i<theString.length();i++) {
	    boolean matchFound = matcher1.find();
	    if(matchFound) {
	    	if(!x.contains(matcher1.group())) {
	    	x=x+" "+matcher1.group()+",";
	    }
	    }
	    }
	      System.out.println("keyword: "+x+" .");
	      Pattern pattern5 = Pattern.compile("\\b([a-z]'*)\\b");
		    Matcher matcher5 = pattern5.matcher(theString);
		    String b="";
		    for(int i=0;i<theString.length();i++) {
		    boolean matchFound = matcher5.find();
		    if(matchFound) {
		    	if(!b.contains(matcher5.group())) {
		    	b=b+" "+matcher5.group()+",";
		    }
		    }
		    }
		      System.out.println("Identifiers: "+b+" .");
		      Pattern pattern4 = Pattern.compile("(\\+|-|\\*|/|=)");
			    Matcher matcher4 = pattern4.matcher(theString);
			    String a="";
			    for(int i=0;i<theString.length();i++) {
			    boolean matchFound = matcher4.find();
			    if(matchFound) {
			    	if(!a.contains(matcher4.group())) {
			    	a=a+" "+matcher4.group()+",";
			    }
			    }
			    }
			      System.out.println("Math Operators: "+a+" .");
			      Pattern pattern3 = Pattern.compile("/and|x?or|&&|[<>!=]=|[<>&!]|\\|{1,2}/gi");
				    Matcher matcher3 = pattern3.matcher(theString);
				    String z="";
				    for(int i=0;i<theString.length();i++) {
				    boolean matchFound = matcher3.find();
				    if(matchFound) {
				    	if(!z.contains(matcher3.group())) {
				    	z=z+" "+matcher3.group()+",";
				    }
				    }
				    }
				      System.out.println("Logical Operators: "+z+" .");
	      Pattern pattern2 = Pattern.compile("\\d*\\.?\\d+");
		    Matcher matcher2 = pattern2.matcher(theString);
		    String y="";
		    for(int i=0;i<theString.length();i++) {
		    boolean matchFound = matcher2.find();
		    if(matchFound) {
		    	if(!y.contains(matcher2.group())) {
		    	y=y+" "+matcher2.group()+",";
		    }
		    }
		    }
		      System.out.println("Numerical Values: "+y+" .");

		      Pattern pattern7 = Pattern.compile("[\\p{Punct}&&[./(/),/{/}/[/]:;]]");
			    Matcher matcher7 = pattern7.matcher(theString);
			    String e="";
			    for(int i=0;i<theString.length();i++) {
			    boolean matchFound = matcher7.find();
			    if(matchFound) {
			    	if(!e.contains(matcher7.group())) {
			    	e=e+" "+matcher7.group();
			    }
			    
			    }
			    }
			      System.out.println("others: "+e+" .");
				      
}
}