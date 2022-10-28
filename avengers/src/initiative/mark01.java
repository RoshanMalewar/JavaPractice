package initiative;

import java.util.concurrent.*;
import java.lang.*;
import java.net.*;
import java.io.*;


public class mark01 {

	
	int a= 10;
	int b= 5;
	int c;
	
	public void add() {
		int c = a+b;
		System.out.println("Addition:" +c);
	}
	
	public void sub() {
		int c = a - b;
		System.out.println("Substraction:"+c);
	}
	public void mul() {
		int c = a * b;
		System.out.println("Multiplication:"+c);
	}
	
	public void div() {
		int c = a / b;
		System.out.println("Division:"+c);
	}
	
	public static void main(String[]args ) {
		
		mark01 A = new mark01();
		A.add();
		A.sub();
		A.mul();
		A.div();
		
	}
	
}
