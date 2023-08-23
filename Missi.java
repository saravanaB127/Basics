package com.basic.pkg;

public class Missi {

	public static void main(String[] args) {
		String x="Mississippi is a river";
		   char search='i',replace='!';
		   int count =0;
		   char c[]=new char[x.length()];
		   for(int i=0;i<c.length;i++) {
		    c[i]=x.charAt(i);
		    if(c[i]==search &&  count <1)
		    {
		     c[i] = replace;
		     count = count+1;
		    }
		    System.out.print(c[i]);
		   }
	}

}
