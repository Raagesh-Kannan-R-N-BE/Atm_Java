package com.atm;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		int accno; int accv; 
		int pin; int pinv;
		int accbal = 10000; 
		int amtdep = 0; int amttkn = 0;

		Scanner s = new Scanner(System.in);
		// Account number 
		System.out.println("ENTER YOUR ACCOUNT NUMBER : ");
		accno = s.nextInt();
		// Pin Number
		System.out.println("ENTER YOUR 4 DIGIT PIN : ");
		pin = s.nextInt();
		
		if(accno == 12345678 && pin == 1234) {
			System.out.println("WELCOME HARI!!!!");
			accv = 1;
			pinv = 1;
		}
		else if(pin == 8765 && accno == 87654321) {
			System.out.println("WELCOME ARUN!!!!");
			accv = 1;
			pinv = 1;
		}
		else {
			System.out.println("=====INVALID ACCOUNT DETAILS=====");
			System.out.println("============TRY AGAIN============");
			accv = 0;
			pinv = 0;
		}

		if(accv == 1 && pinv == 1) {
			boolean loop = true;
			while(loop) {

				System.out.println("PRESS [1] FOR SHOW BALANCE");
				System.out.println("PRESS [2] FOR DEPOSIT");
				System.out.println("PRESS [3] FOR WITHDRAW");
				System.out.println("PRESS [4] FOR RECEIPT");
				System.out.println("PRESS [5] FOR EXIT");

				int opt;
				opt = s.nextInt();
				switch(opt) {

				case 1:
					System.out.println("YOUR ACCOUNT BALANCE IS "+accbal);
					break;

				case 2:
					System.out.println("ENTER THE AMOUNT : ");
					amtdep = s.nextInt();
					accbal =  amtdep + accbal;
					System.out.println("YOUR ACCOUNT BALANCE IS : "+accbal);
					break;

				case 3:
					System.out.println("ENTER THE AMOUNT : ");
					amttkn = s.nextInt();
					if(amttkn>accbal) {
						System.out.println("YOUR ACCOUNT BALANCE IS INSUFFICIENT!!!");	
					}
					else {
						accbal = accbal - amttkn;
						System.out.println("YOUR ACCOUNT BALANCE IS : "+accbal);
					}
					break;
				case 4:
					System.out.println("==================================");
					System.out.println("YOUR ACCOUNT NUMBER IS : "+ accno);
					System.out.println("AMOUNT TAKEN           : "+ amttkn);
					System.out.println("AMOUNT DEPOSITED       : "+ amtdep);
					System.out.println("YOUR ACCOUNT BALANCE IS: "+ accbal);
					System.out.println(".........THANKS FOR COMING........");
					System.out.println("==================================");
					break;
				case 5:
					System.out.println("HAVE A NICE DAY!!!");
					loop = false;
					break;
				default:
					System.out.println("THANK YOU!!!");
					break;
				}

//			if(opt == 5) {
//				System.out.println("HAVE A NICE DAY!!!");
//				loop = false;
//				break;
//			}
			}

		}

	}

}
