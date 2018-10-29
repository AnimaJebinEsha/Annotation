package main;
import java.io.*;

/**
 * <h1>Calculator for add, sub,mul and div!</h1>
 * this programm implements an apptication that simply add,multiply,substract,devide 
 * two given integer numbers and prints the output on the screen.
 * 
 * @author Anima Jebin Esha
 * @version 1.0
 * @since 29.10.2018
 */
	public class Main {
		
		/**
		 * this method add two numbers num1 and num2 
		 * @param num1 this is first number
		 * @param num2 this is second number
		 * @return it returns summation of num1 and num2
		 */
		
		public static int add(int num1, int num2) {
			return num1 + num2;
		}
		/**
         * this method multiply two numbers num1 and num2 
		 * @param num1 this is first number 
		 * @param num2 this is second number
		 * @return it returns multiplication of num1 and num2
		 */
		
		public static int mul(int num1, int num2) {
			return num1 * num2;
		}
		/**
		 * this method multiply two numbers num1 and num2 
		 * @param num1 this is first number 
				 * @param num2 this is second number
		 * @return it returns multiplication of num1 and num2
		 */
		
		public static int  sub(int num1, int num2) {
			return num1 - num2;
		}
		/**
		 * this method devide two numbers num1 and num2 
		 * @param num1 this is first number 
		 * @param num2 this is second number
		 * @return it returns divition of num1 and num2
		 */
		
		public static double div(int num1, int num2) {
			return (double)num1 /(double) num2;	
		}
		
		/**
		 * This is Main class.
		 * This class have 5 method. 
		 * @param args take input as string which remains unused
		 */
	public static void main(String[] args) {
		
		        
		      int num1 = 5;
		      int num2 = 15;
		      int sum;
		      int multiplication;
		      int substraction;
		      double division;
		      sum =add( num1 , num2 );
		      multiplication=mul( num1 , num2 );
		      substraction=sub( num1 , num2 );
		      division=div( num1 , num2 );
		      

		      System.out.println("Sum of these numbers: "+sum);
		      System.out.println("Sum of these numbers: "+multiplication);
		      System.out.println("Sum of these numbers: "+substraction);
		      System.out.println("Sum of these numbers: "+division);
		   }
}
