package com.dom.factorymode;

import java.util.Scanner;

public class MainClass {
	
public static void main(String[] args){
	//1.���տ���̨������
	System.out.println("------------������------------------");
	System.out.println("�����һ��������");
	Scanner scanner = new Scanner(System.in);
	String num1=scanner.nextLine();
	System.out.println("���������");
	String oper = scanner.nextLine();
	System.out.println("����ڶ���������");
	String num2 = scanner.nextLine();
	double result=0;
	double n1=Double.parseDouble(num1);
	double n2=Double.parseDouble(num1);
	
	//2.��������
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
