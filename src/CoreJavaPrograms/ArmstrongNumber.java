package CoreJavaPrograms;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int a,i=0,j=0;
		a=n;
		while(a>0){
			i=a%10;
			j=j+(i*i*i);
			a=a/10;
		}
		if(n==j)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a armstrong number");
		}
	}
}
