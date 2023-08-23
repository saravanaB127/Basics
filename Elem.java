package com.basic.pkg;

public class Elem {

	public static void main(String[] args) {
		Elem ad = new Elem();
		ad.value_1();
		ad.value_2();
		ad.value_3();
		ad.value_4();
	}
	private void value_1() {
		int [] ar= {7, 1, 11, 9, 0, 2, 6, 4, 3, 5, 1, 9};
		System.out.println("first value= "+ar[0]);
		System.out.println("last value= "+ar[ar.length-1]);
		int low=0,mid=0,high=0;
			if(ar.length%2==0) {
				System.out.println("middle value= "+ar[ar.length/2]);
				System.out.println("middle value= "+ar[ar.length/2-1]);
			}
			else {
				System.out.println("middle value="+ar[ar.length/2]);
			}
			System.out.println("******************************************************************");
	}
	
	private void value_2() {
		int [] ar= {7, 3, 1, 9, 4, 6, 3, 7, 2, 8};
		int sum=0,count=0;
		double avg=0.0;
			for(int i=0;i<ar.length;i++)
			{
				sum = ar[i]+sum;
				count+=1;
				
			}
			avg=sum/count;
			System.out.println("sum of the array= "+sum);
			System.out.println("count of the array= "+count);
			System.out.println("Avg of the array= "+avg);
			System.out.println("******************************************************************");
	}
	private void value_3() {
		
		int [] ar= {7, 3, 1, 9, 4, 6, 3, 7, 2, 8};
		for(int i=0;i<ar.length;i++)
		{
			if(i%2==0 && ar[i]%2!=0)
			System.out.println("odd elements present in even index= "+ar[i]);
				
				
		}
		System.out.println("******************************************************************");
	}
		
	
private void value_4() {
		
		int [] ar= {7, 3, 1, 9, 4, 6, 3, 7, 2, 8};
		for(int i=0;i<ar.length;i++)
		{
			if(i%2!=0 && ar[i]%2==0)
			System.out.println("EVEN elements present in odd index= "+ar[i]);	
		}
		System.out.println("******************************************************************");
}
}
		
	

			
			
				



