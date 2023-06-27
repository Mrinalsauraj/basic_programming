package String_Basic;
import java.util.*;

//write a java program to count number is non-blank characters in a given string 
public class Q1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner( System.in);
		String s ="";
		int i,c=0;
		System.out.println(" Enter a Sentance ");
		s = scn.nextLine();
		for(  i=0; i<s.length(); i++) {
			char ch = s.charAt(i);
			if(ch!=' ') {
				c++;
				
			}
		}
		System.out.println("the total number of charactor is "+c);
	}
}
