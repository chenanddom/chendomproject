package com.dom.mementomode;

public class MainClass {

	public static void main(String[] args) {
		Person p1=new Person("zhangsan", "ÄÐ", 21);
		p1.display();
		Person p2 = new Person(p1.getName(), p1.getSex(), p1.getAge());
		p1.setName("zhangsanfeng");
		p1.setAge(22);
		p1.display();
		p1.setName(p2.getName());
		p1.setSex(p2.getSex());
		p1.setAge(p2.getAge());
		p1.display();
		
		
	}

}
