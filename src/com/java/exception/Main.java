package com.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

//	Exception
//	An event that interrupts the normal flow of a program
//	Divde by zero, file not found, mismatch input type
//	Surround any dangerous code with a try{} block
//	try{}, catch{}, finally{}

	public static void main(String[] args) {

//		Scanner scanner = new Scanner(System.in);
//		try {
//			System.out.print("Please input a number : ");
//			int number = scanner.nextInt();
//			System.out.println(number);
//			System.out.println(100/number);
//		} catch (ArithmeticException e) {
//			System.out.println("Divide by 0 error.");	
//		} catch (InputMismatchException e) {
//			// input strings instead of int number
//			System.out.println("Input type mismatch. integer expected");	
//		} catch(Exception e) {
//			// catch all, safety net
//			System.out.println("Something went wrong");
//		} finally {
//			// these will execute even when there is not exception error
//			// optional but can be use to clean up and close scanner
//			System.out.println("close scanner");
//			scanner.close();
//		}
		
		
		
		try (Scanner scanner1 = new Scanner(System.in)){
			System.out.print("Please input new a number : ");
			int number1 = scanner1.nextInt();
			System.out.println(number1);
			System.out.println(100/number1);
		} catch (ArithmeticException e) {
			System.out.println("Divide by 0 error.");	
		} catch (InputMismatchException e) {
			// input strings instead of int number
			System.out.println("Input type mismatch. integer expected");	
		} catch(Exception e) {
			// catch all, safety net
			System.out.println("Something went wrong");
		} finally {
			// these will execute even when there is not exception error
			// optional but can be use to clean up and close scanner
			System.out.println("finally");
		}
	}
}
