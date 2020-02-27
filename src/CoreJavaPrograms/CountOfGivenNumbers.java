package CoreJavaPrograms;

import java.util.Scanner;

public class CountOfGivenNumbers {
public static void main(String[] args) {
	int i=0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int n=sc.nextInt();
	while(n>0)
	{
		n=n/10;
		i++;
	}
	System.out.println("Number of Digits present :"+i);
}
}
