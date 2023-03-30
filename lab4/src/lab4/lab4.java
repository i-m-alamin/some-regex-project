package lab4;
    import java.util.*;
	import java.util.regex.Matcher;
	import java.util.regex.Pattern;
	import java.io.*;
	public class lab4 {
	public static void main(String[] args) throws FileNotFoundException {
		String theString = " ";//making an empty string variable
		File file = new File("data.txt");//taking the file into the program
		Scanner scanner = new Scanner(file);//scanning the file
		theString = scanner.nextLine();//taking text of the file inside the string variable
		while (scanner.hasNextLine()) {//running a loop to take all the text as string inside string variable
		theString = theString + scanner.nextLine();//taking one line after another line
		}
		
		
		
		
		
		
	    System.out.println("Methods: ");
	    
	    
	    
	    
	    
 	    Pattern pattern1 = Pattern.compile("public int ([a-z])*([(]((int) [a-z](,)?)+[)])");
	    Matcher matcher1 = pattern1.matcher(theString);
	    
	    
	    
	    
	    String x="";
	    String y="";
	    
	    
	    
	    
	    for(int i=0;i<theString.length();i++) {
	    boolean matchFound = matcher1.find();
	    if(matchFound) {
    	x=x+"%n"+matcher1.group();
	    }
		}
	    
	    
	    
	    
	    
	    //System.out.printf(x);
	    Pattern pattern2 = Pattern.compile("([a-z])*([(]((int) [a-z](,)?)+[)])");
	    Matcher matcher2 = pattern2.matcher(x);
	    Pattern p = Pattern.compile("int|void");
	    Matcher m = p.matcher(x);
	    m.find();
	    
	    
	    
	    for(int i=0;i<x.length();i++) {
		    boolean matchFound = matcher2.find();
		    if(matchFound) {
			 y=y+matcher2.group()+"  return type:"+m.group();
		    }
		    }
	    System.out.printf(y);
	    
	    
	    
	    
	    
	    

	    
	    
	    
	    
	    
		 Pattern pattern3 = Pattern.compile("public static int ([a-z])*([(]((int) [a-z]+(,)?)+[)])");
		    Matcher matcher3 = pattern3.matcher(theString);
		    
		    
		    
		    
		    
		    String x1="";
		    String y1="";
		    
		    
		    
		    
		    
		    
		    
		    for(int i=0;i<theString.length();i++) {
		    boolean matchFound = matcher3.find();
		    if(matchFound) {
	    	x1=x1+"%n"+matcher3.group();
		    }
			}
		    
		    
		    
		    
		    
		    
		    
		    
		    //System.out.printf(x1);
		    Pattern pattern4 = Pattern.compile("([a-z])*([(]((int) [a-z]+(,)?)+[)])");
		    Matcher matcher4 = pattern4.matcher(x1);
		    Matcher mx = p.matcher(x1);
		    mx.find();
		    
		    
		    
		    
		    for(int i=0;i<x1.length();i++) {
			    boolean matchFound = matcher4.find();
			    if(matchFound) {
				 y1=y1+"%n"+matcher4.group()+"  return type:"+mx.group();
			    }
		    } 
		    System.out.printf(y1);
		    
		    
		    
		    
		    
		    
	 	    Pattern pattern5 = Pattern.compile("public void ([a-z])*([(][)])");
		    Matcher matcher5 = pattern5.matcher(theString);
		    
		    
		    
		    
		    String x2=" ";
		    String y2=" ";
		    
		    
		    
		    
		    
		    
		    
		    
		    
		    for(int i=0;i<theString.length();i++) {
		    boolean matchFound = matcher5.find();
		    if(matchFound) {
	    	x2=x2+"%n"+matcher5.group();
		    }
			}
		    
		    
		    
		    
		    
		    //System.out.printf(x2);
		    Pattern pattern6 = Pattern.compile("([a-z])*([(][)])");
		    Matcher matcher6 = pattern6.matcher(x2);
		    Matcher my = p.matcher(x2);
		    my.find();
		    
		    
		    
		    for(int i=0;i<x2.length();i++) {
			    boolean matchFound = matcher6.find();
			    if(matchFound) {
				 y2=y2+"%n"+matcher6.group()+"  return type:"+my.group();
			    }
		    }
		    System.out.printf(y2);
		    
		    
		    
		  
	   
	}
    }