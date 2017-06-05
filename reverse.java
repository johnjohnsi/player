package john;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		String str;
		System.out.println("Enter the string");
		Scanner s=new Scanner(System.in);
		str=s.next();
		String s3="";
	for(int i=str.length()-1;i>=0;i--)
	{
		 s3=s3+str.charAt(i);
	}
	System.out.println("After string reverse "+s3);

	s.close();
		 
		 

	}

}
