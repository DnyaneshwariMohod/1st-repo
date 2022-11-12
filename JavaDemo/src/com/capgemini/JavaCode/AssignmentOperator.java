//Java Program Using Assignment Operator
package com.capgemini.JavaCode;

public class AssignmentOperator {
	public static void main(String[] args) 
	{
		int FirstNum = 4;
		//x += 5; // x = x + 5
		//x -= 5; // x = x - 5
		//x *= 5; // x = x * 5
		//x /= 4; // x = x / 4
		FirstNum %= 5;   // x = x % 5
		System.out.println(FirstNum);
	}

}