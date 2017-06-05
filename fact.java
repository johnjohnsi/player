package john;

import java.util.Scanner;

public class fact {

	public static void main(String[] args) {
		int num,i,fact=1;
		System.out.println("Enter the number");
		Scanner n=new Scanner(System.in);
		num=n.nextInt();
		for(i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+num+" is "+fact);
		n.close();

	}

}
