package com.dom.singleinstancemode;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=Person.getPerson();
		p.setName("zhangsan");
		Person p2=Person.getPerson();
		p2.setName("lisi");
		System.out.println(p.getName());
		System.out.println(p2.getName());
	}

}
