package Application;

import java.util.Scanner;

import javax.swing.text.html.HTML;

public class GUIuser {
	

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("User Name");
		String s1=s.nextLine();
		
		System.out.println("User Department");
		String s2=s.nextLine();
		
		System.out.println("User Date Of Joinning");
		String s3=s.nextLine();
		System.out.println("submit");
		
		System.out.println("User Name            "  +s1);
		System.out.println("User Department       "  +s2);
		System.out.println("User Date Of Joinning  "  +s3);
		
		

	}

}
