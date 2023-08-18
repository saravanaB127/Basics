package com.num.pkg;


public class NumberTheory 
{
	public static void main (String[]args)
	{
      int perfect=0;
	  int abundant=0;
	  int defecit=0;
	  int total=0;
		for(int num=1;num<=10000;num++)
		{
			int sum=0;
			for(int div=1;div<=num/2;div++)
			{
				if(num%div==0)
					sum=sum+div;
			}
			if(sum==num)
			{
				perfect=perfect+1;
			}
			else if(sum>num)
			{
				 abundant=abundant+1;
			}
			else
			{
				defecit=defecit+1;
			}
			total=perfect+abundant+defecit;
		}
		System.out.println("Perfect="+ perfect);
		System.out.println("Abundant="+ abundant);
		System.out.println("Defecit="+ defecit);
		System.out.println("Total="+ total);
		
	}
}