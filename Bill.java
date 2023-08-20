package com.basic.pkg;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		Bill cal=new Bill();
		double pay=cal.cal_amount();
		System.out.println("Total amount is"+pay);
	}
		double cal_amount() {
				Scanner scan=new Scanner(System.in);
				double total=0;
				int productcode;
				while(true)
				{		
				System.out.println("enter the product code:");
				productcode=scan.nextInt();
				System.out.println("*********************************************");
				System.out.println("enter the quantity in count:");
				double quantity=scan.nextDouble();
				System.out.println("*********************************************");
				if(productcode==6) {
					scan.close();
					return total;}
				switch (productcode)
				{
				case 1:
					double tomato= 20*quantity;
					System.out.println(tomato);
					total=total+tomato;
					break;
				case 2:
					double onion= 25*quantity;
					System.out.println(onion);
					total=total+onion;
					break;
				case 3:
					double beans= 45*quantity;
					System.out.println(beans);
					total=total+beans;
					break;
				case 4:
					double carrot= 40*quantity;
					System.out.println(carrot);
					total=total+carrot;
					break;
				case 5:
					double cucumber= 15*quantity;
					System.out.println(cucumber);
					total=total+cucumber;
					break;
				default:
				System.out.println("Enter the valid product code!");
				}

			}

		}
}




