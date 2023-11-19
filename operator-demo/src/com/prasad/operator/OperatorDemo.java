package com.prasad.operator;

import java.util.Scanner;

class Addition{
	void add(int num,int num1){
		int sum=0;
		sum=num + num1;
		System.out.println("Addition of two number :"+sum);
		
	}
	
}
class Substraction{
	void Substract(int num,int num1){
		int sub=0;
		sub=num - num1;
		System.out.println("Substraction of two: "+sub);
		
	}
	
}
class multiplication{
	void Multiply(int num,int num1){
		int multi=0;
		multi=num * num1;
		System.out.println("multiplication of Two Number :"+multi);
		
	}
	
}
class Division{
	void Divide(int num,int num1){
		int div=0;
		div=num / num1;
		System.out.println("Division of two number :"+div);
		
	}
	
}

class Modulation{
	void Module(int num,int num1){
		int mod=0;
		mod=num % num1;
		System.out.println("Modulation of Number :"+mod);
		
	}
	
}

public class Operator_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Addition add=new Addition();
		Substraction sub=new Substraction();
		multiplication multi =new multiplication();
		Division div =new Division();
		Modulation mod=new Modulation();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number1 :");
		int num1=sc.nextInt();
		
		System.out.println("Enter Number2 :");
		int num2=sc.nextInt();
		
		add.add(num1, num2);
		sub.Substract(num1, num2);
		multi.Multiply(num1, num2);
		div.Divide(num1, num2);
		mod.Module(num1, num2);
		
		
	}

}
