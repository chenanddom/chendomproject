package com.dom.factorymode;

import java.util.Scanner;

public class MainClass {
	
public static void main(String[] args){
	//1.接收控制台的输入
	System.out.println("------------计算器------------------");
	System.out.println("输入第一个操作数");
	Scanner scanner = new Scanner(System.in);
	String num1=scanner.nextLine();
	System.out.println("输入运算符");
	String oper = scanner.nextLine();
	System.out.println("输入第二个操作数");
	String num2 = scanner.nextLine();
	double result=0;
	double n1=Double.parseDouble(num1);
	double n2=Double.parseDouble(num1);
	
	//2.进行运算
	if("+".equals(oper)){
		AddOperationFactory factory = new AddOperationFactory();
		Operation operation = factory.getOperation();
		operation.setN1(n1);
		operation.setN2(n2);
		result=operation.getResult();
//		result=Double.parseDouble(num1)+Double.parseDouble(num2);
	}/*else if("-".equals(oper)){
		result=Double.parseDouble(num1)-Double.parseDouble(num2);
	}else if("*".equals(oper)){
		result=Double.parseDouble(num1)*Double.parseDouble(num2);
	}else if("/".equals(oper)){
		result=Double.parseDouble(num1)/Double.parseDouble(num2);
	}*/
	System.out.println(num1+oper+num2+"="+result);	
}
}
