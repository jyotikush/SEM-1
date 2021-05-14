package org.gvp.dcs.ds;


import java.util.*;
import java.util.Scanner;
class Stack{
	private int top;
	private int data[];
	
	Stack(){
		top=-1;
		data = new int[5];
	}
	Stack(int size){
		top=-1;
		data = new int[size];
	}
		
	public void push(int x){
		if(top >= data.length-1){
			System.out.println("Stack overflow");
			return;
		}
		data[++top] = x;
	}
	
	public int pop(){
		if(top<0){
			System.out.println("Stack underflow");			
			System.exit(0);
		}
		top--;
		return data[top+1];
	}
	
	public String toString(){
		String s="";
		for(int i=0;i<=top ;i++)
		{
			s += data[i] + "\t" ; 
		}
		return s;
	}
}

class Package
{
	public static void main(String [] args){
		Stack st = new Stack(10);
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<10;i++){
			System.out.print("Enter any integer value : ");
			int x = sc.nextInt();
			st.push(x);
		}
		System.out.print("" + st);
		for(int i=0;i<=10;i++){
			System.out.println("poped value : " + st.pop());			
			System.out.println("" + st);
		}
	}	
	
}	

