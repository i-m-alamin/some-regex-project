package lab3;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class lab3 
{
public static void main(String[] args) 
{
	System.out.print("Enter the number of patterns: ");
	Scanner sc= new Scanner (System.in);
	int pattern_no= sc.nextInt();
	sc.nextLine();
	String [] pattern=new String[pattern_no];
	for(int i=0;i<pattern_no;i++)
	{
		pattern[i]= sc.nextLine();
	}
	System.out.print("Enter the number of lines: ");
	int line_no= sc.nextInt();
	sc.nextLine();
	String [] line=new String[line_no];
	
	for(int i=0;i<line_no;i++)
	{
		line[i] = sc.nextLine();
	}
		
	for(int x=0;x<line_no;x++) {
		int i=0;
		boolean a= false;
		while(i<pattern_no) {
		Pattern p= Pattern.compile(pattern[i]);
		Matcher m=p.matcher(line[x]);
		int z=i+1;
		if(m.find()) {
	System.out.println("YES: "+ z );
	i++;
	a=true;
	break;
		}
		else {
			i++;
		}
		}
		if(a==false) {
			System.out.println("NO: "+ 0 );
		}
	}
}

}

