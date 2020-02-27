package CoreJavaPrograms;

import java.util.Scanner;

public class BiggestOf4Numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		if(a>b && a>c && a>d)
		{
			System.out.println("The Biggest Number is : "+a);
		}else if(b>a && b>c && b>d)
		{
			System.out.println("The Biggest Number is : "+b);
		}else if(c>a && c>b && c>d)
		{
			System.out.println("The Biggest Number is : "+c);
		}else
		{
			System.out.println("The Biggest Number is : "+d);
		}
	}
}
