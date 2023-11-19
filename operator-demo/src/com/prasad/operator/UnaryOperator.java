package com.prasad.operator;

import java.util.Scanner;

class Pre_Increment{
	void pre_Increment(int Num) {
		System.out.println("Befoure Pre_Increment :" + Num++);
		System.out.println("After Pre_Increment :"+ Num);
	}
	
}
class Post_increment{
void post_Increment(int Num) {
	System.out.println("Befoure Post_Increment :" + ++Num);
	System.out.println("After Post_Increment :"+ Num);
		
	}
	
}
class Pre_Decrement{
void pre_Decrement(int Num) {
	System.out.println("Befoure Pre_Decrement :" + Num--);
	System.out.println("After Pre_Decrement :"+ Num);
		
	}
	
}
class Post_Decrement{
void post_Decrement(int Num) {
	System.out.println("Befoure Post_Decrement :" + --Num);
	System.out.println("After Post_Decrement :"+ Num);
		
	}
}

public class Unary_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pre_Increment Pre_In=new Pre_Increment();
		Post_increment Post_In=new Post_increment();
		Pre_Decrement Pre_de=new Pre_Decrement();
		Post_Decrement Post_de=new Post_Decrement();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number :");
		int num=sc.nextInt();
		Pre_In.pre_Increment(num);
		Post_In.post_Increment(num);
		Pre_de.pre_Decrement(num);
		Post_de.post_Decrement(num);

	}

}
