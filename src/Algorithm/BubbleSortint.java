package Algorithm;

import java.util.Scanner;

import Com.Bridgelabz.Utility.Utility;

public class BubbleSortint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Utility u=new Utility();
		System.out.println("enter length of list=");
		int n=sc.nextInt();
		int[] a=new int[n];
	System.out.println("enter numbers=");
	for(int i=0;i<n;i++)
	{
		a[i]=sc.nextInt();
	}
	a=u.bubblesort(a);

	for (int element: a) 
		{
		    System.out.println(element);
		    }
	}

}
